package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa{
	List<Exercicio> exProfessor = new ArrayList<Exercicio>();
	
	public Professor(String codProf, String nome, String email, String login, String senha){
		super(codProf,nome,email,login,senha);
	}
	
	public void cadastraExProfessor(Exercicio e){
		exProfessor.add(e);
	}
	
	public List<Exercicio> getExProfessor(){
		return exProfessor;
	}
	
}
