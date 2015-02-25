package BancoDeQuestões;

import java.util.List;

public class BancoDeQuestõesFacade {
	private GerenciadorDeQuestões gerenteQuestões = new GerenciadorDeQuestões();
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
	
	public void cadastraAluno(Aluno a) throws UsuárioJáExisteException{
		gerenteAluno.cadastraAluno(a);
	}
	
	public Aluno pesquisaAluno(String codAluno) throws UsuárioInexistenteException{
		return gerenteAluno.pesquisaAluno(codAluno);
	}
	
	//Professor
	public List<Professor> getProfessores(){
		return gerenteProf.getProfessores();
	}
	
	public boolean autenticaProfessor(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		return gerenteProf.autenticaProfessor(login, senha);
	}
	
	public void cadastraProfessor(Professor p) throws UsuárioJáExisteException{
		gerenteProf.cadastraProfessor(p);
	}
	
	public Professor pesquisaProfessor(String codProf) throws UsuárioInexistenteException{
		return gerenteProf.pesquisaProfessor(codProf);
	}
	
	//Questões
	//ME
	public void cadastraQuestãoME(QuestãoMultiplaEscolha me) throws QuestãoJáExisteException{
		gerenteQuestões.cadastraQuestãoME(me);
	}
	public String retornaRepresQuestãoME(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestões.retornaRepresQuestãoME(codPergunta);
	}
	public List<QuestãoMultiplaEscolha> ListarQuestõesME(){
		return gerenteQuestões.ListarQuestõesME();
	}
	public QuestãoMultiplaEscolha pesquisaQuestãoMe(String cod) throws PerguntaInexistenteException{
		return gerenteQuestões.pesquisaQuestãoMe(cod);
	}
	
	//D
	public void cadastraQuestãoD(QuestãoDissertativa d) throws QuestãoJáExisteException{
		gerenteQuestões.cadastraQuestãoD(d);
	}
	public String retornaRepresQuestãoD(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestões.retornaRepresQuestãoD(codPergunta);
	}
	public List<QuestãoDissertativa> ListarQuestõesD(){
		return gerenteQuestões.ListarQuestõesD();
	}
	public QuestãoDissertativa pesquisaQuestãoD(String cod) throws PerguntaInexistenteException{
		return gerenteQuestões.pesquisaQuestãoD(cod);
	}
	
	//VF
	public void cadastraQuestãoVouF(QuestãoVouF v) throws QuestãoJáExisteException{
		gerenteQuestões.cadastraQuestãoVouF(v);
	}
	public String retornaRepresQuestãoVouF(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestões.retornaRepresQuestãoVouF(codPergunta);
	}
	public List<QuestãoVouF> ListarQuestõesVouF(){
		return gerenteQuestões.ListarQuestõesVouF();
	}
	public QuestãoVouF pesquisaQuestãoVouF(String cod) throws PerguntaInexistenteException{
		return gerenteQuestões.pesquisaQuestãoVouF(cod);
	}
	
	//genéricos
	public String pesquisaQuestãoCod(TipoQuestão t, String cod) throws PerguntaInexistenteException{
		return gerenteQuestões.pesquisaQuestãoCod(t, cod);
	}
	
	public String corrigiQuestãoCod(TipoQuestão t, RespostaAluno resp) throws PerguntaInexistenteException{
		return gerenteQuestões.corrigiQuestãoCod(t, resp);
	}
	
	//Exercícios
	public void cadastraExercício(Exercicio e) throws ExercicioExistenteException{
		gerenteExerc.cadastraExercício(e);
	}
	
	public Exercicio sorteiaExercício(){
		return gerenteExerc.sorteiaExercício();
	}
	
	public List<Exercicio> getExercicios(){
		return gerenteExerc.getExercicios();
	}
	
	public Exercicio escolhaExercício(String assuntoNaLista){
		return gerenteExerc.escolhaExercício(assuntoNaLista);
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuestões g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		return gerenteExerc.corrigiExercicio(e, respostas, g);
	}
}

