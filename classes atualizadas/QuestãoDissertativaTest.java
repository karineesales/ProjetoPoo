package BancoDeQuestões;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestãoDissertativaTest {

	@Test
	public void test() {
		Professor p = new Professor("José", "jose@gmail.com", "joseLm", "010203");
		GerenciadorDeQuestões q = new GerenciadorDeQuestões();
		String perguntaProf = "Qual o nome do curso? ";
		String respostaProf = "LCC";
		QuestãoDissertativa d = new QuestãoDissertativa(perguntaProf, respostaProf);
		q.cadastraQuestãoD(d);
		Aluno a = new Aluno("Jeferson", "jef@gmail.com", "jef00", "0099");
		QuestãoDissertativa l = new QuestãoDissertativa(d.getPergunta(),d.getResposta(),"LCC");
		q.corrigiQuestãoD(l);
		
		
	}

}
