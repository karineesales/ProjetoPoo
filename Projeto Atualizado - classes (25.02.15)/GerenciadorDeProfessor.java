package BancoDeQuestıes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProfessor {
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
			if(p.getLogin()==login){
				if(p.getSenha()==senha){
					autenticou=true;
				}else{
					throw new SenhaNegadaException("Senha incorreta" +senha);
				}
			}else{
				throw new LoginInexistenteException("Login n„o existe" +login);
			}
		}
		return autenticou;
	}
	
	public void cadastraProfessor(Professor p) throws Usu·rioJ·ExisteException{
		for(Professor pr: this.professores){
			if(pr.getEmail().equals(p.getEmail())){
				throw new Usu·rioJ·ExisteException("Professor j· cadastrado"+p.getNome());
			}
		}this.professores.add(p);
	}
	
	public Professor pesquisaProfessor(String codProf) throws Usu·rioInexistenteException{
		for(Professor p: this.professores){
			if(p.getCod().equals(codProf)){
				return p;
			}
		}throw new Usu·rioInexistenteException("Professor Inexistente" +codProf);
	}
	
	//public String enviarFeedBackProfessor(Professor p){
		//fazer
	//}
	
	
}
