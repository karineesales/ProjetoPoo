package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorDeExercicio {
	List<Exercicio> exerc�cios;
	
	public GerenciadorDeExercicio(){
		this.exerc�cios = new ArrayList<Exercicio>();
	}
	
	public void cadastraExerc�cio(Exercicio e) throws ExercicioExistenteException{
		for(Exercicio ex: this.exerc�cios ){
			if(ex.getAssunto().equals(e.getAssunto())){
				throw new ExercicioExistenteException("Exerc�cio j� cadastrado"+e.getAssunto());
			}
		}exerc�cios.add(e);
	}
	
	public Exercicio sorteiaExerc�cio(){
		Collections.shuffle(exerc�cios);
		return exerc�cios.get(1) ;
	}
	
	public List<Exercicio> getExercicios(){
		return exerc�cios;
	}
	
	public Exercicio escolhaExerc�cio(String assuntoNaLista){
		Exercicio e = null;
		for(Exercicio E: this.exerc�cios){
			if(E.getAssunto().equals(assuntoNaLista)){
				e = E;
			}
		}return e;
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuest�es g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		for(Exercicio ex: this.exerc�cios){
			if(ex.equals(e)){
				for(Quest�o q: ex.listarQuest�es()){
					for(RespostaAluno a: respostas){
						return g.corrigiQuest�oCod(q.getTipo(),a);
					}
				}
			}
		}throw new ExercicioInexistenteException("Exercicio inexistente"+e.getAssunto());
	}
	
	

}
