package BancoDeQuest�es;

import java.util.List;

public class Quest�oMultiplaEscolha extends Quest�o {
	private List<String> alternativas;
	private String respostaAluno;
	
	
	public static int refer�nciaQME = 02;
	
	public Quest�oMultiplaEscolha(String pergunta, List<String> alternativas, String respostaProfessor){
		super(pergunta, respostaProfessor);
		this.alternativas = alternativas;
	}
	
	public Quest�oMultiplaEscolha(String pergunta, String respostaAluno){
		super(pergunta);
		this.respostaAluno = respostaAluno;
	}
	
	public int getReferencia(){
		return refer�nciaQME;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String toStringRepresenta��o() {
		return "Quest�o: "+super.getPergunta()+ 
		"Alternativas: "+getAlternativas();
	}

	
	public String getRespostaAluno() {
		return respostaAluno;
	}

	
	public void setRespostaAluno(String respostaAluno) {
		this.respostaAluno = respostaAluno;
	}

	
	
	

}
