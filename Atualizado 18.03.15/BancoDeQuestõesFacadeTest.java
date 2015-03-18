package BancoDeQuestoes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BancoDeQuestõesFacadeTest {

	@Test
	public void test() throws ExercicioExistenteException, PerguntaInexistenteException, QuestaoInexistenteException, QuestaoJaExisteException, UsuarioInexistenteException  {
		BancoDeQuestoesFacade banco = RestaurarObjeto.restaurar("BancoDeQuestões");
		System.out.println(banco.obterFeedBackProfessor(banco.getGerenciadorDeEx(), banco.getGerenciadorDeAluno(), banco.getGerenciadorDeQuestões()));  
		System.out.println(banco.pesquisaAluno("01").getNome());
	}

}
