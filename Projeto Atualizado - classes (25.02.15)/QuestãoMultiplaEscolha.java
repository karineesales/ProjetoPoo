package BancoDeQuest�es;

import java.util.List;

public class Quest�oMultiplaEscolha extends Quest�o {
	private List<String> alternativas;

	
	public Quest�oMultiplaEscolha(TipoQuest�o tipo, String codPergunta, String pergunta, List<String> alternativas, String respostaProfessor){
		super(tipo, codPergunta, pergunta, respostaProfessor);
		this.alternativas = alternativas;
	}
	
	
	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String toStringRepresenta��o() {
		return "Quest�o M�ltipla Escolha: "+super.getPergunta()+ 
		"Alternativas: "+getAlternativas();
	}

	
	

}
