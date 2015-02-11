package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProfessor {
	private List<Professor> professores;
	
	public GerenciadorDeProfessor(){
		this.professores = new ArrayList<Professor>();
	}
	
	public void cadastraProfessor(Professor p){
		this.professores.add(p);
	}
	
	public void removeProfessor(Professor p){
		this.professores.remove(p);
	}
	
	//public String enviarFeedBackProfessor(Professor p){
		//fazer
	//}
	
	
}
