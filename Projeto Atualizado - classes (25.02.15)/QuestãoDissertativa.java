package BancoDeQuest�es;

public class Quest�oDissertativa extends Quest�o {
	
	public Quest�oDissertativa(TipoQuest�o tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
	
	public String toStringRepresenta��o() {
		return "Quest�o Dissertativa: "+super.getPergunta();
	}


	
	
	
}
