package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private String assunto;
	private List <QuestãoVouF> questãoVouF;
	private List <QuestãoMultiplaEscolha> questãoME;
	private List <QuestãoDissertativa> questãoD;
	public int qntdResolvida = 0;
	
	public int getQntdResolvida(){
		return qntdResolvida;
	}
	
	public void setQntdResolvida(int qntdResolvida){
		this.qntdResolvida=qntdResolvida;
	}
	
	public Exercicio(String assunto){
		this.assunto = assunto;
		this.questãoD = new ArrayList<QuestãoDissertativa>();
		this.questãoME = new ArrayList<QuestãoMultiplaEscolha>();
		this.questãoVouF = new ArrayList<QuestãoVouF>();
	}
	
	public void cadastraQuestãoDNoExercicio(QuestãoDissertativa q){
		questãoD.add(q);
	}
	
	public void cadastraQuestãoVouFNoExercicio(QuestãoVouF q){
		questãoVouF.add(q);
	}
	
	public void cadastraQuestãoMENoExercicio(QuestãoMultiplaEscolha q){
		questãoME.add(q);
	}
	
	public List<String> getQuestõesExercício(){
		List<String> questõesEx = new ArrayList<String>();
		for(QuestãoVouF q: this.questãoVouF){
			String pergunta = q.toStringRepresentação();
			questõesEx.add(pergunta);
		}
		for(QuestãoDissertativa d: this.questãoD){
			String pergunta1 = d.toStringRepresentação();
			questõesEx.add(pergunta1);
		}
		for(QuestãoMultiplaEscolha e : this.questãoME){
			String pergunta2 = e.toStringRepresentação();
			questõesEx.add(pergunta2);
		}
		return questõesEx;
	}

	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	

}
