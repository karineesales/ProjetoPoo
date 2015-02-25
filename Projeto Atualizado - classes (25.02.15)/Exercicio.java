package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private String assunto;
	private List <Quest�o> quest�es;

	
	public Exercicio(String assunto){
		this.assunto = assunto;
		this.quest�es = new ArrayList<Quest�o>();
	}
	
	public void cadastraQuest�oDNoExercicio(Quest�oDissertativa q){
		quest�es.add(q);
	}
	
	public void cadastraQuest�oVouFNoExercicio(Quest�oVouF q){
		quest�es.add(q);
	}
	
	public void cadastraQuest�oMENoExercicio(Quest�oMultiplaEscolha q){
		quest�es.add(q);
	}
	
	public List<Quest�o> listarQuest�es(){
		return quest�es;
	}
	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	

}
