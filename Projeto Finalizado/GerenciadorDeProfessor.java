package BancoDeQuestoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProfessor implements Serializable {
	private List<Professor> professores;
	
	public GerenciadorDeProfessor(){
		this.professores = new ArrayList<Professor>();
	}
	
	public List<Professor> getProfessores(){
		return professores;
	}
	
	public boolean autenticaProfessor(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		boolean autenticou = false;
		for(Professor p: this.professores){
			if(p.getLogin().equals(login)){
				if(p.getSenha().equals(senha)){
					autenticou=true;
				}else{
					throw new SenhaNegadaException("Senha incorreta" +senha);
				}
			}else{
				throw new LoginInexistenteException("Login não existe" +login);
			}
		}
		return autenticou;
	}
	
	public void cadastraProfessor(Professor p) throws UsuarioJaExisteException{
		for(Professor pr: this.professores){
			if(pr.getEmail().equals(p.getEmail())){
				throw new UsuarioJaExisteException("Professor já cadastrado"+p.getNome());
			}
		}this.professores.add(p);
	}
	
	public Professor pesquisaProfessor(String codProf) throws UsuarioInexistenteException{
		for(Professor p: this.professores){
			if(p.getCod().equals(codProf)){
				return p;
			}
		}throw new UsuarioInexistenteException("Professor Inexistente" +codProf);
	}
	
	public Professor pesquisaProfessorPeloLogin(String login) throws UsuarioInexistenteException{
		for(Professor p: this.professores){
			if(p.getLogin().equals(login)){
				return p;
			}
		}throw new UsuarioInexistenteException("Professor Inexistente: " +login);
	}
	
	
	
	public String obterFeedBackProfessor(GerenciadorDeExercicio gE, GerenciadorDeAluno gA, GerenciadorDeQuestoes gQ ) throws PerguntaInexistenteException, QuestaoInexistenteException{
		List<String> feedBack = new ArrayList<String>();
		String feedB = " FeedBack de Exercícios \n";
		for(Exercicio e: gE.getExercicios()){
			String parte = gE.feedBackDoExercicio(e, gA, gQ);
			feedBack.add(parte);
		}for(String s: feedBack){
			feedB+=s;
		}return feedB;
		
	}
	
}
