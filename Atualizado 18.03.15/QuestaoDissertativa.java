package BancoDeQuestoes;

import java.io.Serializable;

public class QuestaoDissertativa extends Questao implements Serializable{
	
	public QuestaoDissertativa(TipoQuestao tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
	
	public String toStringRepresentaçao() {
		return "Questão Dissertativa: "+super.getPergunta();
	}


	
	
	
}
