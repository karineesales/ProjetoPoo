package BancoDeQuestões;

public class QuestãoVouF extends Questão {
	
	public QuestãoVouF(TipoQuestão tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
		
	public String toStringRepresentação() {
		return "Questão V ou F :" +super.getPergunta();
	}
	
	

}
