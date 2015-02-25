package BancoDeQuest�es;

import java.util.List;

public class BancoDeQuest�esFacade {
	private GerenciadorDeQuest�es gerenteQuest�es = new GerenciadorDeQuest�es();
	private GerenciadorDeAluno gerenteAluno = new GerenciadorDeAluno();
	private GerenciadorDeProfessor gerenteProf = new GerenciadorDeProfessor();
	private GerenciadorDeExercicio gerenteExerc = new GerenciadorDeExercicio();
	
	//Aluno
	public List<Aluno> getAlunos(){
		return gerenteAluno.getAlunos();
	}
	public boolean autenticaAluno(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		return gerenteAluno.autenticaAluno(login, senha);
	}
	
	public void cadastraAluno(Aluno a) throws Usu�rioJ�ExisteException{
		gerenteAluno.cadastraAluno(a);
	}
	
	public Aluno pesquisaAluno(String codAluno) throws Usu�rioInexistenteException{
		return gerenteAluno.pesquisaAluno(codAluno);
	}
	
	//Professor
	public List<Professor> getProfessores(){
		return gerenteProf.getProfessores();
	}
	
	public boolean autenticaProfessor(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		return gerenteProf.autenticaProfessor(login, senha);
	}
	
	public void cadastraProfessor(Professor p) throws Usu�rioJ�ExisteException{
		gerenteProf.cadastraProfessor(p);
	}
	
	public Professor pesquisaProfessor(String codProf) throws Usu�rioInexistenteException{
		return gerenteProf.pesquisaProfessor(codProf);
	}
	
	//Quest�es
	//ME
	public void cadastraQuest�oME(Quest�oMultiplaEscolha me) throws Quest�oJ�ExisteException{
		gerenteQuest�es.cadastraQuest�oME(me);
	}
	public String retornaRepresQuest�oME(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuest�es.retornaRepresQuest�oME(codPergunta);
	}
	public List<Quest�oMultiplaEscolha> ListarQuest�esME(){
		return gerenteQuest�es.ListarQuest�esME();
	}
	public Quest�oMultiplaEscolha pesquisaQuest�oMe(String cod) throws PerguntaInexistenteException{
		return gerenteQuest�es.pesquisaQuest�oMe(cod);
	}
	
	//D
	public void cadastraQuest�oD(Quest�oDissertativa d) throws Quest�oJ�ExisteException{
		gerenteQuest�es.cadastraQuest�oD(d);
	}
	public String retornaRepresQuest�oD(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuest�es.retornaRepresQuest�oD(codPergunta);
	}
	public List<Quest�oDissertativa> ListarQuest�esD(){
		return gerenteQuest�es.ListarQuest�esD();
	}
	public Quest�oDissertativa pesquisaQuest�oD(String cod) throws PerguntaInexistenteException{
		return gerenteQuest�es.pesquisaQuest�oD(cod);
	}
	
	//VF
	public void cadastraQuest�oVouF(Quest�oVouF v) throws Quest�oJ�ExisteException{
		gerenteQuest�es.cadastraQuest�oVouF(v);
	}
	public String retornaRepresQuest�oVouF(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuest�es.retornaRepresQuest�oVouF(codPergunta);
	}
	public List<Quest�oVouF> ListarQuest�esVouF(){
		return gerenteQuest�es.ListarQuest�esVouF();
	}
	public Quest�oVouF pesquisaQuest�oVouF(String cod) throws PerguntaInexistenteException{
		return gerenteQuest�es.pesquisaQuest�oVouF(cod);
	}
	
	//gen�ricos
	public String pesquisaQuest�oCod(TipoQuest�o t, String cod) throws PerguntaInexistenteException{
		return gerenteQuest�es.pesquisaQuest�oCod(t, cod);
	}
	
	public String corrigiQuest�oCod(TipoQuest�o t, RespostaAluno resp) throws PerguntaInexistenteException{
		return gerenteQuest�es.corrigiQuest�oCod(t, resp);
	}
	
	//Exerc�cios
	public void cadastraExerc�cio(Exercicio e) throws ExercicioExistenteException{
		gerenteExerc.cadastraExerc�cio(e);
	}
	
	public Exercicio sorteiaExerc�cio(){
		return gerenteExerc.sorteiaExerc�cio();
	}
	
	public List<Exercicio> getExercicios(){
		return gerenteExerc.getExercicios();
	}
	
	public Exercicio escolhaExerc�cio(String assuntoNaLista){
		return gerenteExerc.escolhaExerc�cio(assuntoNaLista);
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuest�es g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		return gerenteExerc.corrigiExercicio(e, respostas, g);
	}
}

