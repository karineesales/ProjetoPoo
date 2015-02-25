package BancoDeQuestões;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExercicio {
	List<Exercicio> exercícios;
	
	public GerenciadorDeExercicio(){
		this.exercícios = new ArrayList<Exercicio>();
	}
	
	public void cadastraExercício(Exercicio e) throws ExercicioExistenteException{
		for(Exercicio ex: this.exercícios ){
			if(ex.getAssunto().equals(e.getAssunto())){
				throw new ExercicioExistenteException("Exercício já cadastrado"+e.getAssunto());
			}
		}exercícios.add(e);
	}
	
	public Exercicio sorteiaExercício(){
		Collections.shuffle(exercícios);
		return exercícios.get(1) ;
	}
	
	public List<Exercicio> getExercicios(){
		return exercícios;
	}
	
	public Exercicio escolhaExercício(String assuntoNaLista){
		Exercicio e = null;
		for(Exercicio E: this.exercícios){
			if(E.getAssunto().equals(assuntoNaLista)){
				e = E;
			}
		}return e;
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuestões g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		for(Exercicio ex: this.exercícios){
			if(ex.equals(e)){
				for(Questão q: ex.listarQuestões()){
					for(RespostaAluno a: respostas){
						return g.corrigiQuestãoCod(q.getTipo(),a);
					}
				}
			}
		}throw new ExercicioInexistenteException("Exercicio inexistente"+e.getAssunto());
	}
	
	

}
