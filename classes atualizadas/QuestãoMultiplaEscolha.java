package BancoDeQuestões;

import java.util.List;

public class QuestãoMultiplaEscolha extends Questão {
	private List<String> alternativas;
	private String respostaAluno;
	
	
	public static int referênciaQME = 02;
	
	public QuestãoMultiplaEscolha(String pergunta, List<String> alternativas, String respostaProfessor){
		super(pergunta, respostaProfessor);
		this.alternativas = alternativas;
	}
	
	public QuestãoMultiplaEscolha(String pergunta, String respostaAluno){
		super(pergunta);
		this.respostaAluno = respostaAluno;
	}
	
	public int getReferencia(){
		return referênciaQME;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String toStringRepresentação() {
		return "Questão: "+super.getPergunta()+ 
		"Alternativas: "+getAlternativas();
	}

	
	public String getRespostaAluno() {
		return respostaAluno;
	}

	
	public void setRespostaAluno(String respostaAluno) {
		this.respostaAluno = respostaAluno;
	}

	
	
	

}
