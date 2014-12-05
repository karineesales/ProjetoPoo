package BancoDeQuestoes;

import java.util.ArrayList;
import java.util.List;

public class GerenteDeExercicios {
	private List<Aluno> alunos= new ArrayList <Aluno>();
	private List<Professor> professores= new ArrayList <Professor>();
	private List<Exercicio> exercicios= new ArrayList <Exercicio>();
	
	
	
	public void cadastraAluno( Aluno a){
		alunos.add(a);
	}
	
	public void cadastraProfessor( Professor p){
		professores.add(p);
	}
	
	public void cadastraExercicio( Exercicio e){
		exercicios.add(e);
	}
	
	public Exercicio pesquisarExercicio( Exercicio e)  throws ExercicioInexistenteException{
		for(Exercicio a: exercicios){
			if(a.equals(e)){
				return e;
			}
		}
		throw new ExercicioInexistenteException("Exercício não encontrado.");
	}
	
	public Questão pesquisarQuestaoDeExercicio(String pergunta) throws QuestãoInexistenteException,ExercicioInexistenteException {
		for(Exercicio e: this.exercicios){
			List<Questão> quest = e.getQuestõesEx();
			for(Questão q: quest){
				if(q.getPergunta()==pergunta){
					return q;
				}
			}throw new QuestãoInexistenteException("Questão não encontrada.");
		}
		throw new ExercicioInexistenteException("Exercício não encontrado.");
		
		
	}
}
	


