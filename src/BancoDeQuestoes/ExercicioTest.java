package BancoDeQuestoes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ExercicioTest {

	@Test
	public void test() {
		Exercicio ex = new Exercicio();
		Dissertativa q = new Dissertativa("A cor do cavalo de napoleão:", "branco");
		ex.cadastraQuestaoDissertativa(q);
		List<Questão> quest = ex.getQuestõesEx();
		quest.contains(q);
	}

}
