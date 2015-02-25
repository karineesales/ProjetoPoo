package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private String assunto;
	private List <Questão> questões;

	
	public Exercicio(String assunto){
		this.assunto = assunto;
		this.questões = new ArrayList<Questão>();
	}
	
	public void cadastraQuestãoDNoExercicio(QuestãoDissertativa q){
		questões.add(q);
	}
	
	public void cadastraQuestãoVouFNoExercicio(QuestãoVouF q){
		questões.add(q);
	}
	
	public void cadastraQuestãoMENoExercicio(QuestãoMultiplaEscolha q){
		questões.add(q);
	}
	
	public List<Questão> listarQuestões(){
		return questões;
	}
	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	

}
