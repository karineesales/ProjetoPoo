package BancoDeQuestões;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExercicio {
	List<Exercicio> exercícios;
	
	public GerenciadorDeExercicio(){
		this.exercícios = new ArrayList<Exercicio>();
	}
	
	public void cadastraExercício(Exercicio e){
		exercícios.add(e);
	}
	
	public Exercicio sorteiaExercício(){
		Collections.shuffle(exercícios);
		return exercícios.get(1) ;
	}
	
	public Exercicio escolhaExercício(String assuntoNaLista){
		Exercicio e = null;
		for(Exercicio E: this.exercícios){
			if(E.getAssunto().equals(assuntoNaLista)){
				e = E;
			}
		}return e;
	}
	
	

}
