package BancoDeQuest�es;

public class RespostaAluno {
	private String c�digoPergunta;
	private String resposta;
	private String refExercicio;
	
	public RespostaAluno(String refExercicio, String codPergunta, String resposta){
		this.c�digoPergunta = codPergunta;
		this.resposta = resposta;
		this.setRefExercicio(refExercicio);
	}

	public String getC�digoPergunta() {
		return c�digoPergunta;
	}

	public void setC�digoPergunta(String c�digoPergunta) {
		this.c�digoPergunta = c�digoPergunta;
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
