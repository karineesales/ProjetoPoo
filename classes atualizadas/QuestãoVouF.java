package BancoDeQuest�es;

import java.util.List;

public class Quest�oVouF extends Quest�o {
	
	private List <String> alternativas;
	private List <String> respostasProfessor;
	private List <String> respostasAluno;
	public static int refer�nciaQVF = 03;
	
	public int getReferencia (){
		return refer�nciaQVF;
	}
	
	public Quest�oVouF(String pergunta, List<String> alternativas, List<String> respostasProfessor){
		super(pergunta);
		this.alternativas = alternativas;
		this.respostasProfessor = respostasProfessor;
	}
	
	public Quest�oVouF(String pergunta, List<String> respostasAluno){
		super(pergunta);
		this.respostasAluno = respostasAluno;
	}

	public List <String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List <String> alternativas) {
		this.alternativas = alternativas;
	}

	public List <String> getRespostasProfessor() {
		return respostasProfessor;
	}

	public void setRespostasProfessor(List <String> respostasProfessor) {
		this.respostasProfessor = respostasProfessor;
	}

	public List <String> getRespostasAluno() {
		return respostasAluno;
	}

	public void setRespostasAluno(List <String> respostasAluno) {
		this.respostasAluno = respostasAluno;
	}

	
	public String toStringRepresenta��o() {
		return "Quest�o :"+super.getPergunta()+
				"Alternativas: "+getAlternativas();
	}
	
	

}
