package BancoDeQuest�es;

public abstract class Quest�o {
	private String pergunta;
	private String resposta;
	
	public Quest�o(String pergunta, String resposta){
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
	
	public Quest�o(String pergunta){
		this.pergunta = pergunta;
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
	

}
