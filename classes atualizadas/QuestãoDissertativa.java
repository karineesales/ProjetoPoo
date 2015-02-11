package BancoDeQuestões;

public class QuestãoDissertativa extends Questão {
	public static int referênciaQD = 01;
	private String respostaAluno;
	
	public int getReferencia(){
		return referênciaQD;
	}
	
	public QuestãoDissertativa(String pergunta, String resposta){
		super(pergunta,resposta);
	}
	
	public QuestãoDissertativa(String pergunta, String resposta, String respostaAluno){
		super(pergunta,resposta);
		this.respostaAluno = respostaAluno;
	}
	
	
	public String toStringRepresentação() {
		return "Questão: "+super.getPergunta()+" Resposta Esperada: "+super.getResposta();
	}

	
	public String getRespostaAluno() {
		return respostaAluno;
	}

	public void setRespostaAluno(String respostaAluno) {
		this.respostaAluno = respostaAluno;
	}

	
	
	
}
