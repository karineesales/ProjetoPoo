package BancoDeQuest�es;

public class Quest�oVouF extends Quest�o {
	
	public Quest�oVouF(TipoQuest�o tipo, String codPergunta, String pergunta, String resposta){
		super(tipo, codPergunta, pergunta, resposta);
	}
		
	public String toStringRepresenta��o() {
		return "Quest�o V ou F :" +super.getPergunta();
	}
	
	

}
