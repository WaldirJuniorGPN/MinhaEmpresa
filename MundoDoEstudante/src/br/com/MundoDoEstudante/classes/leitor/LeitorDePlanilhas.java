package br.com.MundoDoEstudante.classes.leitor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import br.com.MundoDoEstudante.classes.util.StreamUtil;
import br.com.MundoDoEstudante.modelos.Atendente;

public class LeitorDePlanilhas {
	
	public List<Atendente> carregarAtendentes() {
	    HSSFWorkbook workbook = null;
	    try (FileInputStream arquivo = new FileInputStream(new File("teste.xls"))) {
	        workbook = new HSSFWorkbook(arquivo);
	        HSSFSheet listaDeAtendentes = workbook.getSheetAt(0);

	        return StreamUtil.convertToStream(listaDeAtendentes.iterator())
	                .skip(1)
	                .limit(listaDeAtendentes.getLastRowNum() - 1)
	                .map(Leitor::criaAtendenteDeCadaLinha)
	                .filter(atendente -> atendente.getNome() != null)
	                .toList();

	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (workbook != null) {
	            try {
	                workbook.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return Arrays.asList();
	}

}
