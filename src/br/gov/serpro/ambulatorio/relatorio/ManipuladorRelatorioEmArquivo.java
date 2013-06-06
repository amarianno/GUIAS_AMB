package br.gov.serpro.ambulatorio.relatorio;

import java.awt.Desktop;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

public class ManipuladorRelatorioEmArquivo {
	
	/**
	 * 
	 * @param arquivo
	 * @throws IOException
	 */
	private void abrirArquivo(File arquivo) throws IOException {
		Desktop.getDesktop().browse(arquivo.toURI());
	}
	
	/**
	 * 
	 * @param arquivoMascaraRelatorio
	 * @param parametrosRelatorio
	 * @param matricula
	 * @param conn
	 * @throws Exception 
	 */
	public String gerarRelatorioEmArquivo(InputStream arquivoMascaraRelatorio, 
										Map<String, Object> parametrosRelatorio,
										String matricula,
										Connection conn) throws Exception {
		
		ByteArrayOutputStream arquivoGerado = new ByteArrayOutputStream();
		
		try{
			String path = "/var/www/ambulatorio/guias_cassi/";
			String nomeArquivo = "guia_" + matricula + System.currentTimeMillis() + ".pdf";
			String arquivo = path + nomeArquivo;
	  
			JasperPrint jasperPrint = JasperFillManager.fillReport(arquivoMascaraRelatorio, parametrosRelatorio, conn);
            JasperExportManager.exportReportToPdfFile(jasperPrint, arquivo);
            //this.abrirArquivo(new File(arquivo));
            
            return nomeArquivo;
			
		} catch(Exception e) {
			throw e;
		} finally{
			arquivoMascaraRelatorio.close();
			arquivoGerado.close();
		}
	}
	
}
