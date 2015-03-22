package BancoDeQuestoes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuestoes implements Serializable{
	List <QuestaoMultiplaEscolha> questoesMultiplaEscolha;
	List <QuestaoVouF> questoesVouF;
	List <QuestaoDissertativa> questoesDissertativas;
	
	
	public GerenciadorDeQuestoes(){
		this.questoesMultiplaEscolha = new ArrayList<QuestaoMultiplaEscolha>();
		this.questoesVouF = new ArrayList<QuestaoVouF>();
		this.questoesDissertativas = new ArrayList<QuestaoDissertativa>();
	}
	
	//Métodos questão múltipla escolha
	public void cadastraQuestaoME(QuestaoMultiplaEscolha me) throws QuestaoJaExisteException{
		for(QuestaoMultiplaEscolha q: this.questoesMultiplaEscolha){
			if(q.getCodPergunta().equals(me.getCodPergunta())){
				throw new QuestaoJaExisteException("Questão já cadastrada"+me.getPergunta());
			}
		}questoesMultiplaEscolha.add(me);
	}
	
	public String retornaRepresQuestaoME(String codPergunta)throws PerguntaInexistenteException{
		for(QuestaoMultiplaEscolha Me: this.questoesMultiplaEscolha){
			if(Me.getCodPergunta()==codPergunta){
				return Me.toStringRepresentaçao();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestaoMultiplaEscolha> ListarQuestoesME(){
		return questoesMultiplaEscolha;
	}
	
	public QuestaoMultiplaEscolha pesquisaQuestaoMe(String cod) throws PerguntaInexistenteException{
		for(QuestaoMultiplaEscolha mE: this.questoesMultiplaEscolha){
			if(mE.getCodPergunta()==cod){
				return mE;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigeQuestaoME (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaP;
		for(QuestaoMultiplaEscolha e: this.questoesMultiplaEscolha){
			if(e.getCodPergunta().equals(resposta.getCodigoPergunta())){
				respostaP = e.getResposta();
				if(e.getResposta().equals(resposta.getResposta())){
					return"Você acertou a questão!";
				}else{
					return "Você não acertou a questão! A resposta esperada é: "+respostaP;
				}
			}
		}throw new PerguntaInexistenteException("Questão não encontrada: "+resposta.getCodigoPergunta());
	}
	
	public boolean corrigeQuestaoMEparaFeed (RespostaAluno resposta)throws PerguntaInexistenteException{
		boolean respostaP=false;
		for(QuestaoMultiplaEscolha e: this.questoesMultiplaEscolha){
			if(e.getCodPergunta().equals(resposta.getCodigoPergunta())){
				if(e.getResposta().equals(resposta.getResposta())){
					respostaP = true;
					return respostaP;
				}else{
					return respostaP;
				}
			}
		}throw new PerguntaInexistenteException("Questão não encontrada: "+resposta.getCodigoPergunta());
	}
	
	//Métodos questão dissertativa
	public void cadastraQuestaoD(QuestaoDissertativa qD) throws QuestaoJaExisteException{
		for(QuestaoDissertativa d: this.questoesDissertativas){
			if(d.getCodPergunta().equals(qD.getCodPergunta())){
				throw new QuestaoJaExisteException("Questão já cadastrada"+qD.getPergunta());
			}
		}questoesDissertativas.add(qD);
	}
	
	public String retornaRepresQuestaoD(String codPergunta)throws PerguntaInexistenteException{
		for(QuestaoDissertativa d: this.questoesDissertativas){
			if(d.getCodPergunta().equals(codPergunta)){
				return d.toStringRepresentaçao();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestaoDissertativa> ListarQuestoesD(){
		return questoesDissertativas;
	}
	
	public QuestaoDissertativa pesquisaQuestaoD(String cod) throws PerguntaInexistenteException{
		for(QuestaoDissertativa d: this.questoesDissertativas){
			if(d.getCodPergunta()==cod){
				return d;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigeQuestaoD(RespostaAluno resposta) throws PerguntaInexistenteException {
		for(QuestaoDissertativa d: this.questoesDissertativas){
			if(d.getCodPergunta()==resposta.getCodigoPergunta()){
				return "Sua resposta foi: "+resposta.getResposta() +"\n A resposta esperada é: "+d.getResposta();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+ resposta.getCodigoPergunta());
	}
	
	//Métodos questãoVouF
	public void cadastraQuestaoVouF(QuestaoVouF vF) throws QuestaoJaExisteException{
		for(QuestaoVouF v: this.questoesVouF){
			if(v.getCodPergunta().equals(vF.getCodPergunta())){
				throw new QuestaoJaExisteException("Questão já cadastrada"+vF.getPergunta());
			}
		}questoesVouF.add(vF);
	}
	
	public String retornaRepresQuestaoVouF(String codPergunta)throws PerguntaInexistenteException{
		for(QuestaoVouF v: this.questoesVouF){
			if(v.getCodPergunta()==codPergunta){
				return v.toStringRepresentaçao();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestaoVouF> ListarQuestoesVouF(){
		return questoesVouF;
	}
	
	public QuestaoVouF pesquisaQuestaoVouF(String cod) throws PerguntaInexistenteException{
		for(QuestaoVouF vF: this.questoesVouF){
			if(vF.getCodPergunta()==cod){
				return vF;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigeQuestaoVouF (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaV;
		for(QuestaoVouF vF: this.questoesVouF){
			if(vF.getCodPergunta().equals(resposta.getCodigoPergunta())){
				respostaV = vF.getResposta();
				if(vF.getResposta().equals(resposta.getResposta())){
					return "Você acertou a questão!";
				}else{
					return "Você não acertou a questão! A resposta esperada é: "+respostaV;
				}
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+ resposta.getCodigoPergunta());
	}
	
	public boolean corrigeQuestaoVouFparaFeed (RespostaAluno resposta)throws PerguntaInexistenteException{
		boolean respostaV = false;
		for(QuestaoVouF vF: this.questoesVouF){
			if(vF.getCodPergunta().equals(resposta.getCodigoPergunta())){
				if(vF.getResposta().equals(resposta.getResposta())){
					respostaV=true;
					return respostaV;
				}else{
					return respostaV;
				}
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+ resposta.getCodigoPergunta());
	}
	
	
	
	//Métodos genéricos
	
	public String pesquisaQuestaoCod(TipoQuestao t, String cod) throws PerguntaInexistenteException{
		if(t == TipoQuestao.D){
			return retornaRepresQuestaoD(cod);
		}
		else if(t == TipoQuestao.V_F){
			return retornaRepresQuestaoVouF(cod);
		}
		else{
			return retornaRepresQuestaoME(cod);
		}
	}
	
	public String corrigeQuestaoCod(TipoQuestao t, RespostaAluno resp) throws PerguntaInexistenteException{
		if(t == TipoQuestao.D){
			return corrigeQuestaoD(resp);
		}
		else if(t == TipoQuestao.V_F){
			return corrigeQuestaoVouF(resp);
		}else{
			return corrigeQuestaoME(resp);
		}
	}
	
	public boolean corrigeQuestaoParaFeed(TipoQuestao t, RespostaAluno resp) throws PerguntaInexistenteException{
		if(t.equals(TipoQuestao.M_E)){
			return corrigeQuestaoMEparaFeed(resp);
		}else{
			return corrigeQuestaoVouFparaFeed(resp);
		}
	}
}

 