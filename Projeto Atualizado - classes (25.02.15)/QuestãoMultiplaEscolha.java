package BancoDeQuestões;

import java.util.List;

public class QuestãoMultiplaEscolha extends Questão {
	private List<String> alternativas;

	
	public QuestãoMultiplaEscolha(TipoQuestão tipo, String codPergunta, String pergunta, List<String> alternativas, String respostaProfessor){
		super(tipo, codPergunta, pergunta, respostaProfessor);
		this.alternativas = alternativas;
	}
	
	
	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String toStringRepresentação() {
		return "Questão Múltipla Escolha: "+super.getPergunta()+ 
		"Alternativas: "+getAlternativas();
	}

	
	

}
