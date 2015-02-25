package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
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
	
	


}
