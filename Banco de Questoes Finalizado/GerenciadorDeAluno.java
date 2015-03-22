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
	
	public boolean autenticaAluno(String login, String senha, Aluno a) throws SenhaNegadaException, LoginInexistenteException{
		boolean autenticou = false;
		if(a.getLogin().equals(login)){
			if(a.getSenha().equals(senha)){
				autenticou=true;
				return autenticou;
			}
		}throw new SenhaNegadaException("Senha incorreta" +senha);
	}
	
	public void cadastraAluno(Aluno a) throws UsuarioJaExisteException{
			boolean a1 = pesquisaAluno(a.getCod());
			if(a1==false){
				alunos.add(a);
			}else{
				throw new UsuarioJaExisteException("Aluno já cadastrado"+a.getNome());
			}
	}
	
	public Aluno pesquisaAlunoPeloLogin(String login) throws UsuarioInexistenteException{
		for(Aluno a: this.alunos){
			if(a.getLogin().equals(login)){
				return a;
			}
		}throw new UsuarioInexistenteException("Aluno Inexistente "+login);
	}
	
	public boolean pesquisaAluno(String codAluno){
		boolean encontrou = false;
		for(Aluno a: this.alunos){
			if(a.getCod().equals(codAluno)){
				encontrou=true;
			}
		}return encontrou;
	}
	
	public String acertosDaQuestão(Questao q, GerenciadorDeQuestoes gQ) throws PerguntaInexistenteException, QuestaoInexistenteException{
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
			analiseAcertos = qntdAcertos+" alunos acertaram a questão de pergunta: "+q.getPergunta()+"\n";
		}return analiseAcertos;
	}

}
