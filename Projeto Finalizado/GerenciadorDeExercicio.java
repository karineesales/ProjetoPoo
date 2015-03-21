package BancoDeQuestoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExercicio implements Serializable {
	List<Exercicio> exercicios;
	
	public GerenciadorDeExercicio(){
		this.exercicios = new ArrayList<Exercicio>();
	}
	
	public void cadastraExercicio(Exercicio e) throws ExercicioExistenteException{
		for(Exercicio ex: this.exercicios ){
			if(ex.getAssunto().equals(e.getAssunto())){
				throw new ExercicioExistenteException("Exercício já cadastrado: "+e.getAssunto());
			}
		}exercicios.add(e);
	}
	
	public Exercicio sorteiaExercicio(){
		Collections.shuffle(exercicios);
		return exercicios.get(0) ;
	}
	
	public List<Exercicio> getExercicios(){
		return exercicios;
	}
	
	public Exercicio escolhaExercicio(String assuntoNaLista){
		Exercicio e = null;
		for(Exercicio E: this.exercicios){
			if(E.getAssunto().equals(assuntoNaLista)){
				e = E;
			}
		}return e;
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuestoes g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		for(Exercicio ex: this.exercicios){
			if(ex.equals(e)){
				for(Questao q: ex.listarQuestoes()){
					for(RespostaAluno a: respostas){
						return g.corrigeQuestaoCod(q.getTipo(),a);
					}
				}
			}
		}throw new ExercicioInexistenteException("Exercicio inexistente"+e.getAssunto());
	}
	
	public String feedBackDoExercicio(Exercicio e, GerenciadorDeAluno gA, GerenciadorDeQuestoes gQ) throws PerguntaInexistenteException, QuestaoInexistenteException{
		String acertosDaQuestão;
		List<String> feedExerc = new ArrayList<String>();
		for (Questao q: e.listarQuestoes()){
			acertosDaQuestão = gA.acertosDaQuestão(q, gQ);
			feedExerc.add(acertosDaQuestão);
		}String feed = "FeedBack do exercicio: "+e.getAssunto()+"\n";
		for(String s: feedExerc){
			feed += s;
		}return feed;
	}

}
