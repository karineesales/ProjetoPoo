package BancoDeQuestoes;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BancoDeQuest�esFacadeTest {

	@Test
	public void test() throws ExercicioExistenteException, PerguntaInexistenteException, QuestaoInexistenteException, QuestaoJaExisteException, UsuarioInexistenteException  {
		BancoDeQuestoesFacade banco = RestaurarObjeto.restaurar("BancoDeQuest�es");
		System.out.println(banco.obterFeedBackProfessor(banco.getGerenciadorDeEx(), banco.getGerenciadorDeAluno(), banco.getGerenciadorDeQuest�es()));  
		System.out.println(banco.pesquisaAluno("01").getNome());
	}

}
