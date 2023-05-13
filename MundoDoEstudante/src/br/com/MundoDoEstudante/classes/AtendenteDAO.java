package br.com.MundoDoEstudante.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.MundoDoEstudante.classes.calculadoraGratificacao.LapisCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.MundoCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.SonhoCalculadoraGratificacao;
import br.com.MundoDoEstudante.classes.calculadoraGratificacao.VovoCalculadoraGratificacao;

public class AtendenteDAO {

	private ConnectionFactory connection = new ConnectionFactory();
	private String nomeAtendente;
	private static final String fileName = "/home/waldirjunior/Downloads/TesteVendas.xls";
	private List<Atendente> listaDAO = new ArrayList<Atendente>();

	public void inserirAtendenteBanco(String nome) {
		String sql = "INSERT INTO Atendentes(nome) VALUES(?)";
		Connection conn = connection.recuperarConexao();

		String selectSql = "SELECT COUNT(*) FROM Atendentes WHERE nome = ?";
		this.nomeAtendente = nome;

		try {
			PreparedStatement selectStatement = conn.prepareStatement(selectSql);
			selectStatement.setString(1, nome);
			ResultSet resultSet = selectStatement.executeQuery();
			resultSet.next();
			int count = resultSet.getInt(1);
			resultSet.close();
			if (count > 0) {
				return;
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setString(1, nome);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException();
		}
	}

	public void inserirValoresBanco(BigDecimal vendas, BigDecimal gratificacao) {
		String sql = "UPDATE Atendentes SET vendas_totais = ?, gratificacao = ? WHERE nome = ?";
		Connection conn = connection.recuperarConexao();
		try {
			PreparedStatement prepareStatement = conn.prepareStatement(sql);
			prepareStatement.setBigDecimal(1, vendas);
			prepareStatement.setBigDecimal(2, gratificacao);
			prepareStatement.setNString(3, this.nomeAtendente);
			prepareStatement.executeUpdate();
			prepareStatement.close();
			conn.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Atendente> lerPlanilha() throws IOException {
		List<Atendente> listaDAO = new ArrayList<>();
		try (FileInputStream arquivo = new FileInputStream(new File(AtendenteDAO.fileName))) {
			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
			HSSFSheet sheetAtendentes = workbook.getSheetAt(0);

			Iterator<Row> rowIterator = sheetAtendentes.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				if (row.getRowNum() < 2) continue;
				Iterator<Cell> cellIterator = row.cellIterator();

				Atendente atendente = new Atendente();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getColumnIndex()) {
					case 1:
						atendente.setNome(cell.getStringCellValue());
						break;
					case 8:
						String valorCelula = cell.getStringCellValue();
						valorCelula = valorCelula.replace(",", ".");
						atendente.setVendasPrimeiraSemana(new BigDecimal(valorCelula));
						break;
					}
				}
				listaDAO.add(atendente);
			}

		} catch (IOException e) {
			throw new RuntimeException("Erro ao ler planilha: " + e.getMessage(), e);
		}
		return listaDAO;
	}

	public void calcularGratificacao(Lojas loja) {
		switch (loja) {
		case MUNDO:
			listaDAO = (List<Atendente>) new MundoCalculadoraGratificacao(listaDAO).calcularGratificacao();
			break;
		case SONHO:
			listaDAO = (List<Atendente>) new SonhoCalculadoraGratificacao(listaDAO).calcularGratificacao();
			break;
		case LAPIS:
			listaDAO = (List<Atendente>) new LapisCalculadoraGratificacao(listaDAO).calcularGratificacao();
			break;
		case VOVO:
			listaDAO = (List<Atendente>) new VovoCalculadoraGratificacao(listaDAO).calcularGratificacao();
			break;
		default:
			throw new IllegalArgumentException("É necessário informar uma loja válida");
		}
	}

}
