package BancoDeQuestões;

public class QuestãoDissertativa extends Questão {
	
	public QuestãoDissertativa(TipoQuestão tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
	
	public String toStringRepresentação() {
		return "Questão Dissertativa: "+super.getPergunta();
	}


	
	
	
}
