package BancoDeQuestoes;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Exercicio> exResolvidos = new ArrayList<Exercicio>();
	List<RespostaAluno> respostas = new ArrayList<RespostaAluno>();
	
	public Aluno(String codAluno, String nome, String email, String login, String senha){
		super(codAluno,nome,email,login,senha);
	}
	
	public void cadastraExResolvidosDoAluno(Exercicio e){
		exResolvidos.add(e);
	}
	
	public List<Exercicio> getExerciciosDoAluno(){
		return exResolvidos;
	}
	
	public void cadastraRespostasDoAluno(RespostaAluno a){
		respostas.add(a);
	}
	
	public List<RespostaAluno> getRespostaDoAluno(){
		return respostas;
	}
	
	public RespostaAluno pesquisaRespostaAluno(String codQuestao) throws QuestaoInexistenteException{
		RespostaAluno resp = null;
		for(RespostaAluno r: this.respostas){
			if(r.getCodigoPergunta().equals(codQuestao)){
				resp = r;
			}
		}if(resp==null){
			throw new QuestaoInexistenteException("Questão não cadastrada"+codQuestao);
		}else{
			return resp;
		}
	}
	


}
