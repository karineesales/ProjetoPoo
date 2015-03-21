package BancoDeQuestoes;

import java.io.Serializable;

public abstract class Questao implements Serializable {
	private String pergunta;
	private String resposta;
	private String codPergunta;
	private TipoQuestao tipo;
	
	public Questao(TipoQuestao tipo, String codPergunta, String pergunta, String resposta){
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
	
	public abstract String toStringRepresentaçao () ;

	public String getCodPergunta() {
		return codPergunta;
	}

	public void setCodPergunta(String codPergunta) {
		this.codPergunta = codPergunta;
	}

	public TipoQuestao getTipo() {
		return tipo;
	}

	public void setTipo(TipoQuestao tipo) {
		this.tipo = tipo;
	}
	

}
