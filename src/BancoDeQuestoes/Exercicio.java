package BancoDeQuestoes;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	private List<Questão> questõesEx = new ArrayList<Questão> ();
	
	public void cadastraQuestaoDissertativa(Dissertativa d){
		questõesEx.add(d);
	}
	
	public List<Questão> getQuestõesEx(){
		return questõesEx;
	}
}
