package BancoDeQuestoes;

import java.io.Serializable;
import java.util.List;

public class QuestaoMultiplaEscolha extends Questao implements Serializable {
	private List<String> alternativas;

	
	public QuestaoMultiplaEscolha(TipoQuestao tipo, String codPergunta, String pergunta, List<String> alternativas, String respostaProfessor){
		super(tipo, codPergunta, pergunta, respostaProfessor);
		this.alternativas = alternativas;
	}
	
	
	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String toStringRepresentaçao() {
		return "Questão Múltipla Escolha: "+super.getPergunta()+ 
		"Alternativas: "+getAlternativas();
	}

	
	

}
