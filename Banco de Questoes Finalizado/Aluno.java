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
	
	public void cadastraExResolvidosDoAluno(Exercicio e) throws ExercicioExistenteException{
		if(exResolvidos.contains(e)){
			throw new ExercicioExistenteException("Exercício já foi resolvido! ");
		}else{
			exResolvidos.add(e);
		}
	}
	
	public List<Exercicio> getExerciciosDoAluno(){
		return exResolvidos;
	}
	
	public void cadastraRespostasDoAluno(RespostaAluno a) throws RespostaNullException{
		if(a.getResposta()=="" || respostas.contains(a)){
			throw new RespostaNullException("Resposta não foi digitada! ou Resposta já foi cadastrada!");
		}else{
			respostas.add(a);
		}
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
