package br.com.MundoDoEstudante.classes.leitor;

import java.math.BigDecimal;

import org.apache.poi.ss.usermodel.Row;

import br.com.MundoDoEstudante.classes.util.StreamUtil;
import br.com.MundoDoEstudante.modelos.Atendente;

public class Leitor {

	public static Atendente criaAtendenteDeCadaLinha(Row row) {

		Atendente atendente = Atendente.INSTANCE();

		StreamUtil.convertToStream(row.cellIterator()).forEach(cell -> {
			switch (cell.getColumnIndex()) {
			case 1:
				atendente.setNome(cell.getStringCellValue());
				break;
			case 7:
				String valorString = cell.getStringCellValue();
				if (!valorString.isEmpty()) {
					valorString = valorString.replace(",", ".");
					atendente.setVendasPrimeiraSemana(new BigDecimal(valorString));
				}
				break;
			}
		});
		return atendente;
	}
}
