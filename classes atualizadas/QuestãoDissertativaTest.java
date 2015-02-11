package BancoDeQuest�es;

import static org.junit.Assert.*;

import org.junit.Test;

public class Quest�oDissertativaTest {

	@Test
	public void test() {
		Professor p = new Professor("Jos�", "jose@gmail.com", "joseLm", "010203");
		GerenciadorDeQuest�es q = new GerenciadorDeQuest�es();
		String perguntaProf = "Qual o nome do curso? ";
		String respostaProf = "LCC";
		Quest�oDissertativa d = new Quest�oDissertativa(perguntaProf, respostaProf);
		q.cadastraQuest�oD(d);
		Aluno a = new Aluno("Jeferson", "jef@gmail.com", "jef00", "0099");
		Quest�oDissertativa l = new Quest�oDissertativa(d.getPergunta(),d.getResposta(),"LCC");
		q.corrigiQuest�oD(l);
		
		
	}

}
