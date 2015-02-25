package BancoDeQuestões;

public abstract class Questão {
	private String pergunta;
	private String resposta;
	private String codPergunta;
	private TipoQuestão tipo;
	
	public Questão(TipoQuestão tipo, String codPergunta, String pergunta, String resposta){
		this.codPergunta = codPergunta;
		this.pergunta = pergunta;
		this.resposta = resposta;
		this.tipo = tipo; 
	}
	
	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public abstract String toStringRepresentação () ;

	public String getCodPergunta() {
		return codPergunta;
	}

	public void setCodPergunta(String codPergunta) {
		this.codPergunta = codPergunta;
	}

	public TipoQuestão getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuestão tipo) {
		this.tipo = tipo;
	}
	

}
