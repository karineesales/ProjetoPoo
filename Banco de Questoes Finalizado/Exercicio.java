package BancoDeQuestoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Exercicio implements Serializable{
	private String assunto;
	private List <Questao> questoes;

	
	public Exercicio(String assunto){
		this.assunto = assunto;
		this.questoes = new ArrayList<Questao>();
	}
	
	public void cadastraQuestaoDNoExercicio(QuestaoDissertativa q){
		questoes.add(q);
	}
	
	public void cadastraQuestaoVouFNoExercicio(QuestaoVouF q){
		questoes.add(q);
	}
	
	public void cadastraQuestaoMENoExercicio(QuestaoMultiplaEscolha q){
		questoes.add(q);
	}
	
	public List<Questao> listarQuestoes(){
		return questoes;
	}
	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	

}
