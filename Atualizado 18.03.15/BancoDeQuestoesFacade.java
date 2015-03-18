package BancoDeQuestoes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class BancoDeQuestoesFacade implements Serializable {
	private GerenciadorDeQuestoes gerenteQuestoes = new GerenciadorDeQuestoes();
	private GerenciadorDeAluno gerenteAluno = new GerenciadorDeAluno();
	private GerenciadorDeProfessor gerenteProf = new GerenciadorDeProfessor();
	private GerenciadorDeExercicio gerenteExerc = new GerenciadorDeExercicio();
	
	public GerenciadorDeQuestoes getGerenciadorDeQuestões(){
		return gerenteQuestoes;
	}
	
	public GerenciadorDeAluno  getGerenciadorDeAluno(){
		return gerenteAluno;
	}
	
	public GerenciadorDeProfessor getGerenciadorDeProfessor(){
		return gerenteProf;
	}
	
	public GerenciadorDeExercicio  getGerenciadorDeEx(){
		return gerenteExerc;
	}
	
	
	//Aluno
	public List<Aluno> getAlunos(){
		return gerenteAluno.getAlunos();
	}
	public boolean autenticaAluno(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		return gerenteAluno.autenticaAluno(login, senha);
	}
	
	public void cadastraAluno(Aluno a) throws UsuarioJaExisteException{
		gerenteAluno.cadastraAluno(a);
	}
	
	public Aluno pesquisaAluno(String codAluno) throws UsuarioInexistenteException{
		return gerenteAluno.pesquisaAluno(codAluno);
	}
	
	
	//Professor
	public List<Professor> getProfessores(){
		return gerenteProf.getProfessores();
	}
	
	public boolean autenticaProfessor(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		return gerenteProf.autenticaProfessor(login, senha);
	}
	
	public void cadastraProfessor(Professor p) throws UsuarioJaExisteException{
		gerenteProf.cadastraProfessor(p);
	}
	
	public Professor pesquisaProfessor(String codProf) throws UsuarioInexistenteException{
		return gerenteProf.pesquisaProfessor(codProf);
	}
	
	public String obterFeedBackProfessor(GerenciadorDeExercicio gE, GerenciadorDeAluno gA, GerenciadorDeQuestoes gQ ) throws PerguntaInexistenteException, QuestaoInexistenteException{
		return gerenteProf.obterFeedBackProfessor(gE, gA, gQ);
	}
	
	//Questões
	//ME
	public void cadastraQuestaoME(QuestaoMultiplaEscolha me) throws QuestaoJaExisteException{
		gerenteQuestoes.cadastraQuestaoME(me);
	}
	public String retornaRepresQuestaoME(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestoes.retornaRepresQuestaoME(codPergunta);
	}
	public List<QuestaoMultiplaEscolha> ListarQuestoesME(){
		return gerenteQuestoes.ListarQuestoesME();
	}
	public QuestaoMultiplaEscolha pesquisaQuestaoMe(String cod) throws PerguntaInexistenteException{
		return gerenteQuestoes.pesquisaQuestaoMe(cod);
	}
	
	//D
	public void cadastraQuestaoD(QuestaoDissertativa d) throws QuestaoJaExisteException{
		gerenteQuestoes.cadastraQuestaoD(d);
	}
	public String retornaRepresQuestaoD(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestoes.retornaRepresQuestaoD(codPergunta);
	}
	public List<QuestaoDissertativa> ListarQuestoesD(){
		return gerenteQuestoes.ListarQuestoesD();
	}
	public QuestaoDissertativa pesquisaQuestaoD(String cod) throws PerguntaInexistenteException{
		return gerenteQuestoes.pesquisaQuestaoD(cod);
	}
	
	//VF
	public void cadastraQuestaoVouF(QuestaoVouF v) throws QuestaoJaExisteException{
		gerenteQuestoes.cadastraQuestaoVouF(v);
	}
	public String retornaRepresQuestaoVouF(String codPergunta)throws PerguntaInexistenteException{
	    return	gerenteQuestoes.retornaRepresQuestaoVouF(codPergunta);
	}
	public List<QuestaoVouF> ListarQuestoesVouF(){
		return gerenteQuestoes.ListarQuestoesVouF();
	}
	public QuestaoVouF pesquisaQuestaoVouF(String cod) throws PerguntaInexistenteException{
		return gerenteQuestoes.pesquisaQuestaoVouF(cod);
	}
	
	//genéricos
	public String pesquisaQuestaoCod(TipoQuestao t, String cod) throws PerguntaInexistenteException{
		return gerenteQuestoes.pesquisaQuestaoCod(t, cod);
	}
	
	public String corrigeQuestaoCod(TipoQuestao t, RespostaAluno resp) throws PerguntaInexistenteException{
		return gerenteQuestoes.corrigeQuestaoCod(t, resp);
	}
	
	//Exercícios
	public void cadastraExercicio(Exercicio e) throws ExercicioExistenteException{
		gerenteExerc.cadastraExercicio(e);
	}
	
	public Exercicio sorteiaExercício(){
		return gerenteExerc.sorteiaExercicio();
	}
	
	public List<Exercicio> getExercicios(){
		return gerenteExerc.getExercicios();
	}
	
	public Exercicio escolhaExercício(String assuntoNaLista){
		return gerenteExerc.escolhaExercicio(assuntoNaLista);
	}
	
	public String corrigiExercicio(Exercicio e, List<RespostaAluno> respostas, GerenciadorDeQuestoes g) throws PerguntaInexistenteException, ExercicioInexistenteException{
		return gerenteExerc.corrigiExercicio(e, respostas, g);
	}
	
	public String feedBackDoExercicio(Exercicio e, GerenciadorDeAluno gA, GerenciadorDeQuestoes gQ) throws PerguntaInexistenteException, QuestaoInexistenteException{
		return gerenteExerc.feedBackDoExercicio(e, gA, gQ);
	}
	
	public void gravar(BancoDeQuestoesFacade banco){  
        try{  
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Arquivo.BQ"));  
            out.writeObject(banco);  
            out.close();  
        }catch(Exception e){  
        }  
    }  

	
	public Object recuperar(String nomeArquivo){  
        Object array;  
        try{  
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Arquivo.DBA"));  
            array = in.readObject();  
            in.close();  
            return array;  
        }catch (Exception arq){  
            System.out.println(arq);  
        }finally{  
        }  
        return null;  
    }  
}

