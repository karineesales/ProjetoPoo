package BancoDeQuestoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeAluno implements Serializable {
	List<Aluno> alunos;
	
	public GerenciadorDeAluno(){
		this.alunos = new ArrayList<Aluno>();
	}
	
	public List<Aluno> getAlunos(){
		return alunos;
	}
	
	public boolean autenticaAluno(String login, String senha) throws SenhaNegadaException, LoginInexistenteException{
		boolean autenticou = false;
		for(Aluno a: this.alunos){
			if(a.getLogin()==login){
				if(a.getSenha()==senha){
					autenticou=true;
				}else{
					throw new SenhaNegadaException("Senha incorreta" +senha);
				}
			}else{
				throw new LoginInexistenteException("Login n�o existe" +login);
			}
		}
		return autenticou;
	}
	
	public void cadastraAluno(Aluno a) throws UsuarioJaExisteException{
		for(Aluno al: this.alunos){
			if(al.getCod().equals(a.getCod())){
				throw new UsuarioJaExisteException("Aluno j� cadastrado"+a.getNome());
			}
		}alunos.add(a);
	}
	
	public Aluno pesquisaAluno(String codAluno) throws UsuarioInexistenteException{
		for(Aluno a: this.alunos){
			if(a.getCod().equals(codAluno)){
				return a;
			}
		}throw new UsuarioInexistenteException("Aluno Inexistente "+codAluno);
	}
	
	public String acertosDaQuest�o(Questao q, GerenciadorDeQuestoes gQ) throws PerguntaInexistenteException, QuestaoInexistenteException{
		String analiseAcertos = "";
		int qntdAcertos=0;
		for(Aluno a: this.alunos){
			if(q.getTipo().equals(TipoQuestao.D)){
				analiseAcertos += "Aluno(a): "+a.getNome()+", cadastrou a seguinte resposta: "+a.pesquisaRespostaAluno(q.getCodPergunta()).getResposta()+"\npara a pergunta: "+q.getPergunta()+"\n";
			}else{
				if(gQ.corrigeQuestaoParaFeed(q.getTipo(), a.pesquisaRespostaAluno(q.getCodPergunta()))==true){
					qntdAcertos++;
				}
			}
		}if(TipoQuestao.D!=q.getTipo()){
			analiseAcertos = qntdAcertos+" alunos acertaram a quest�o de pergunta: "+q.getPergunta()+"\n";
		}return analiseAcertos;
	}

}
