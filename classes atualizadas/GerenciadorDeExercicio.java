package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExercicio {
	List<Exercicio> exerc�cios;
	
	public GerenciadorDeExercicio(){
		this.exerc�cios = new ArrayList<Exercicio>();
	}
	
	public void cadastraExerc�cio(Exercicio e){
		exerc�cios.add(e);
	}
	
	public Exercicio sorteiaExerc�cio(){
		Collections.shuffle(exerc�cios);
		return exerc�cios.get(1) ;
	}
	
	public Exercicio escolhaExerc�cio(String assuntoNaLista){
		Exercicio e = null;
		for(Exercicio E: this.exerc�cios){
			if(E.getAssunto().equals(assuntoNaLista)){
				e = E;
			}
		}return e;
	}
	
	

}
