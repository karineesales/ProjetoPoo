package BancoDeQuestões;

public class RespostaAluno {
	private String códigoPergunta;
	private String resposta;
	private String refExercicio;
	
	public RespostaAluno(String refExercicio, String codPergunta, String resposta){
		this.códigoPergunta = codPergunta;
		this.resposta = resposta;
		this.setRefExercicio(refExercicio);
	}

	public String getCódigoPergunta() {
		return códigoPergunta;
	}

	public void setCódigoPergunta(String códigoPergunta) {
		this.códigoPergunta = códigoPergunta;
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
