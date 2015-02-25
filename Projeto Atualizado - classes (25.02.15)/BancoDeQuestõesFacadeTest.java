package BancoDeQuest�es;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BancoDeQuest�esFacadeTest {

	@Test
	public void test() throws ExercicioExistenteException  {
		BancoDeQuest�esFacade banco = new BancoDeQuest�esFacade();
		//Alunos e Professores
		Aluno a1 = new Aluno("01", "Adjainy", "adjainy.joseffa@gmail.com", "adjainy.j", "0202");
		Aluno a2 = new Aluno("02", "Daybson", "william.daybson@gamil.com", "william.d", "2008");
		Professor p1 = new Professor("001", "Ayla", "ayla.debora@gmail.com", "ayla.d", "0506");
		try{
			banco.cadastraAluno(a1);
			banco.cadastraAluno(a2);
			banco.cadastraProfessor(p1);
			assertEquals(a1, banco.pesquisaAluno("01"));
		}catch(Exception e){
			e.printStackTrace();
		}
		banco.getAlunos().contains(a1);
		banco.getProfessores().contains(p1);
		assertFalse(banco.getAlunos().size()==3);
		assertTrue(banco.getProfessores().size()==1);
		
		//Quest�es e Exerc�cio
		String perguntaD1 = "Qual o time que Karine torce?";
		String respostaD1 = "Sport";
		String codD1 = "01";
		Quest�oDissertativa d1 = new Quest�oDissertativa(TipoQuest�o.D, codD1, perguntaD1, respostaD1);
		
		String perguntaMe1 = "Quantos anos Karine tem?";
		List<String> alternativas = new ArrayList<String>();
		String me1 = "10";
		String me2 = "16";
		String me3 = "21";
		alternativas.add(me1);
		alternativas.add(me2);
		alternativas.add(me3);
		String respostaMe1 = "21";
		String codMe1 = "02";
		Quest�oMultiplaEscolha mE1 = new Quest�oMultiplaEscolha(TipoQuest�o.M_E, codMe1, perguntaMe1, alternativas, respostaMe1);
		
		Exercicio e1 = new Exercicio("Primeiro teste");
		banco.cadastraExerc�cio(e1);
		e1.cadastraQuest�oDNoExercicio(d1);
		e1.cadastraQuest�oMENoExercicio(mE1);
		
		assertTrue(banco.getExercicios().size()==1);
		banco.getExercicios().contains(e1);
		e1.listarQuest�es().contains(d1);
		assertTrue(e1.listarQuest�es().get(0).getCodPergunta()=="01");
		
		String respD1 = "Sport";
		String respMe1 = "16";
		RespostaAluno resp1 = new RespostaAluno(e1.getAssunto(), "01", respD1);
		RespostaAluno resp2 = new RespostaAluno(e1.getAssunto(), "02", respMe1);
		a1.cadastraExResolvidosDoAluno(e1);
		a1.cadastraRespostasDoAluno(resp1);
		a1.cadastraRespostasDoAluno(resp2);
		assertTrue(a1.getRespostaDoAluno().size()==2);
		assertFalse(mE1.getResposta() == a1.getRespostaDoAluno().get(1).getResposta());
		
		
		
		
	}

}
