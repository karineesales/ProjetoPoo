package BancoDeQuestoes;

import java.io.Serializable;

public class QuestaoVouF extends Questao implements Serializable {
	
	public QuestaoVouF(TipoQuestao tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
		
	public String toStringRepresentaçao() {
		return "Questão V ou F :" +super.getPergunta();
	}
	
	

}
