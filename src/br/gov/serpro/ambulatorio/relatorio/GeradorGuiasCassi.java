package br.gov.serpro.ambulatorio.relatorio;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import br.gov.serpro.ambulatorio.database.MysqlConn;
import br.gov.serpro.ambulatorio.database.ParamRelatorioDTO;

/**
 * 
 *
 */
public class GeradorGuiasCassi {
	
	/**
	 * 
	 * @param matricula
	 */
	public String gerarRelatorioPDF(ParamRelatorioDTO params) throws Exception {
		
		InputStream arquivoMascaraRelatorio = getClass().getResourceAsStream("guia_cassi.jasper");
        Map<String, Object> parametros = retornaParametros(params);
		
        return new ManipuladorRelatorioEmArquivo().gerarRelatorioEmArquivo(arquivoMascaraRelatorio, 
            															parametros, 
            															params.getMatricula(),
            															MysqlConn.getInstance().getConn());
            
	}
	
	
  
	/**
	 * 
	 * @return
	 */
	private Map<String, Object> retornaParametros(ParamRelatorioDTO params) {
		
		Map<String, Object> parametrosRelatorio = new HashMap<String, Object>();
		parametrosRelatorio.put("p_matricula", params.getMatricula());
		parametrosRelatorio.put("p_uf", params.getUf());
		parametrosRelatorio.put("p_carater_solicitacao", params.getCaraterSolicitacao());
		parametrosRelatorio.put("p_cid", params.getCid());
		parametrosRelatorio.put("p_indicacao_clinica", params.getIndicacaoClinica());
		parametrosRelatorio.put("p_codigo_proc_1", params.getCodProc1());
		parametrosRelatorio.put("p_codigo_proc_2", params.getCodProc2());
		parametrosRelatorio.put("p_codigo_proc_3", params.getCodProc3());
		parametrosRelatorio.put("p_codigo_proc_4", params.getCodProc4());
		parametrosRelatorio.put("p_codigo_proc_5", params.getCodProc5());
		parametrosRelatorio.put("p_desc_proc_1", params.getDescProc1());
		parametrosRelatorio.put("p_desc_proc_2", params.getDescProc2());
		parametrosRelatorio.put("p_desc_proc_3", params.getDescProc3());
		parametrosRelatorio.put("p_desc_proc_4", params.getDescProc4());
		parametrosRelatorio.put("p_desc_proc_5", params.getDescProc5());
		
		return parametrosRelatorio;
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(new GeradorGuiasCassi().gerarRelatorioPDF(new ParamRelatorioDTO(args)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
