package BancoDeQuestoes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteDeExerciciosTest {

	@Test
	public void test() {
		GerenteDeExercicios gerente = new GerenteDeExercicios();
		Exercicio ex = new Exercicio ();
		try{
			gerente.cadastraExercicio(ex);
			Exercicio existente = gerente.pesquisarExercicio(ex);
			assertEquals(existente,ex);
		} catch(Exception e){
			fail("Não Lançou exceção");
		}
		
	
		
	}

}
