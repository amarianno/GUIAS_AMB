package br.gov.serpro.ambulatorio.database;

public class ParamRelatorioDTO {
	
	private String matricula;
	private String uf;
	private String caraterSolicitacao;
	private String cid;
	private String indicacaoClinica;
	private String codProc1;
	private String codProc2;
	private String codProc3;
	private String codProc4;
	private String codProc5;
	private String descProc1;
	private String descProc2;
	private String descProc3;
	private String descProc4;
	private String descProc5;
	
	public ParamRelatorioDTO(String[] args) {
		setMatricula(args[0]);
		setUf(args[1]);
		setCaraterSolicitacao(args[2]);
		setCid(args[3]);
		setIndicacaoClinica(args[4]);
		setCodProc1(args[5]);
		setCodProc2(args[6]);
		setCodProc3(args[7]);
		setCodProc4(args[8]);
		setCodProc5(args[9]);
		setDescProc1(args[10]);
		setDescProc2(args[11]);
		setDescProc3(args[12]);
		setDescProc4(args[13]);
		setDescProc5(args[14]);
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCaraterSolicitacao() {
		return caraterSolicitacao;
	}

	public void setCaraterSolicitacao(String caraterSolicitacao) {
		this.caraterSolicitacao = caraterSolicitacao;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getIndicacaoClinica() {
		return indicacaoClinica;
	}

	public void setIndicacaoClinica(String indicacaoClinica) {
		this.indicacaoClinica = indicacaoClinica;
	}

	public String getCodProc1() {
		return codProc1;
	}

	public void setCodProc1(String codProc1) {
		this.codProc1 = codProc1;
	}

	public String getCodProc2() {
		return codProc2;
	}

	public void setCodProc2(String codProc2) {
		this.codProc2 = codProc2;
	}

	public String getCodProc3() {
		return codProc3;
	}

	public void setCodProc3(String codProc3) {
		this.codProc3 = codProc3;
	}

	public String getCodProc4() {
		return codProc4;
	}

	public void setCodProc4(String codProc4) {
		this.codProc4 = codProc4;
	}

	public String getCodProc5() {
		return codProc5;
	}

	public void setCodProc5(String codProc5) {
		this.codProc5 = codProc5;
	}

	public String getDescProc1() {
		return descProc1;
	}

	public void setDescProc1(String descProc1) {
		this.descProc1 = descProc1;
	}

	public String getDescProc2() {
		return descProc2;
	}

	public void setDescProc2(String descProc2) {
		this.descProc2 = descProc2;
	}

	public String getDescProc3() {
		return descProc3;
	}

	public void setDescProc3(String descProc3) {
		this.descProc3 = descProc3;
	}

	public String getDescProc4() {
		return descProc4;
	}

	public void setDescProc4(String descProc4) {
		this.descProc4 = descProc4;
	}

	public String getDescProc5() {
		return descProc5;
	}

	public void setDescProc5(String descProc5) {
		this.descProc5 = descProc5;
	}

}
