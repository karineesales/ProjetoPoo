package BancoDeQuest�es;

public class Quest�oDissertativa extends Quest�o {
	public static int refer�nciaQD = 01;
	private String respostaAluno;
	
	public int getReferencia(){
		return refer�nciaQD;
	}
	
	public Quest�oDissertativa(String pergunta, String resposta){
		super(pergunta,resposta);
	}
	
	public Quest�oDissertativa(String pergunta, String resposta, String respostaAluno){
		super(pergunta,resposta);
		this.respostaAluno = respostaAluno;
	}
	
	
	public String toStringRepresenta��o() {
		return "Quest�o: "+super.getPergunta()+" Resposta Esperada: "+super.getResposta();
	}

	
	public String getRespostaAluno() {
		return respostaAluno;
	}

	public void setRespostaAluno(String respostaAluno) {
		this.respostaAluno = respostaAluno;
	}

	
	
	
}
