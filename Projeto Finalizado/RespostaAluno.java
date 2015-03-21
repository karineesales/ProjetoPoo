package BancoDeQuestoes;

import java.io.Serializable;

public class RespostaAluno implements Serializable {
	private String codigoPergunta;
	private String resposta;
	private String refExercicio;
	
	public RespostaAluno(String refExercicio, String codPergunta, String resposta){
		this.codigoPergunta = codPergunta;
		this.resposta = resposta;
		this.setRefExercicio(refExercicio);
	}

	public String getCodigoPergunta() {
		return codigoPergunta;
	}

	public void setCodigoPergunta(String códigoPergunta) {
		this.codigoPergunta = códigoPergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public String getRefExercicio() {
		return refExercicio;
	}

	public void setRefExercicio(String refExercicio) {
		this.refExercicio = refExercicio;
	}
	
	

}
