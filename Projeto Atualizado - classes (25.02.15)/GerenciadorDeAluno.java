package BancoDeQuestıes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAluno {
	List<Aluno> alunos;
	
	public GerenciadorDeAluno(){
		this.alunos = new ArrayList<Aluno>();
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public boolean autenticaAluno(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		boolean autenticou = false;
		for(Aluno a: this.alunos){
			if(a.getLogin()==login){
				if(a.getSenha()==senha){
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
	
	public void cadastraAluno(Aluno a) throws Usu·rioJ·ExisteException{
		for(Aluno al: this.alunos){
			if(al.getCod().equals(a.getCod())){
				throw new Usu·rioJ·ExisteException("Aluno j· cadastrado"+a.getNome());
			}
		}alunos.add(a);
	}
	
	public Aluno pesquisaAluno(String codAluno) throws Usu·rioInexistenteException{
		for(Aluno a: this.alunos){
			if(a.getCod().equals(codAluno)){
				return a;
			}
		}throw new Usu·rioInexistenteException("Aluno Inexistente "+codAluno);
	}

	
	
	

}
