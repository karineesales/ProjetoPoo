package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private String assunto;
	private List <Quest�oVouF> quest�oVouF;
	private List <Quest�oMultiplaEscolha> quest�oME;
	private List <Quest�oDissertativa> quest�oD;
	public int qntdResolvida = 0;
	
	public int getQntdResolvida(){
		return qntdResolvida;
	}
	
	public void setQntdResolvida(int qntdResolvida){
		this.qntdResolvida=qntdResolvida;
	}
	
	public Exercicio(String assunto){
		this.assunto = assunto;
		this.quest�oD = new ArrayList<Quest�oDissertativa>();
		this.quest�oME = new ArrayList<Quest�oMultiplaEscolha>();
		this.quest�oVouF = new ArrayList<Quest�oVouF>();
	}
	
	public void cadastraQuest�oDNoExercicio(Quest�oDissertativa q){
		quest�oD.add(q);
	}
	
	public void cadastraQuest�oVouFNoExercicio(Quest�oVouF q){
		quest�oVouF.add(q);
	}
	
	public void cadastraQuest�oMENoExercicio(Quest�oMultiplaEscolha q){
		quest�oME.add(q);
	}
	
	public List<String> getQuest�esExerc�cio(){
		List<String> quest�esEx = new ArrayList<String>();
		for(Quest�oVouF q: this.quest�oVouF){
			String pergunta = q.toStringRepresenta��o();
			quest�esEx.add(pergunta);
		}
		for(Quest�oDissertativa d: this.quest�oD){
			String pergunta1 = d.toStringRepresenta��o();
			quest�esEx.add(pergunta1);
		}
		for(Quest�oMultiplaEscolha e : this.quest�oME){
			String pergunta2 = e.toStringRepresenta��o();
			quest�esEx.add(pergunta2);
		}
		return quest�esEx;
	}

	
	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	

}
