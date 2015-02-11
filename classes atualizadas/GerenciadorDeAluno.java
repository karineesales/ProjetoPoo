package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAluno {
	List<Exercicio> exResolvidos;
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public GerenciadorDeAluno(){
		this.exResolvidos = new ArrayList<Exercicio>(); 
	}
	
	public void cadastraAluno(Aluno a){
		alunos.add(a);
	}
	
	public void cadastraExResolvidosDoAluno(Aluno a, Exercicio e){
		exResolvidos.add(e);
	}
	
	
	
	
	

}
