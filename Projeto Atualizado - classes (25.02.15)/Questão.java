package BancoDeQuest�es;

public abstract class Quest�o {
	private String pergunta;
	private String resposta;
	private String codPergunta;
	private TipoQuest�o tipo;
	
	public Quest�o(TipoQuest�o tipo, String codPergunta, String pergunta, String resposta){
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
	
	public abstract String toStringRepresenta��o () ;

	public String getCodPergunta() {
		return codPergunta;
	}

	public void setCodPergunta(String codPergunta) {
		this.codPergunta = codPergunta;
	}

	public TipoQuest�o getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuest�o tipo) {
		this.tipo = tipo;
	}
	

}
