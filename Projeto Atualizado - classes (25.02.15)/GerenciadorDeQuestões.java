package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuestões {
	List <QuestãoMultiplaEscolha> questõesMultiplaEscolha;
	List <QuestãoVouF> questõesVouF;
	List <QuestãoDissertativa> questõesDissertativas;
	
	
	public GerenciadorDeQuestões(){
		this.questõesMultiplaEscolha = new ArrayList<QuestãoMultiplaEscolha>();
		this.questõesVouF = new ArrayList<QuestãoVouF>();
		this.questõesDissertativas = new ArrayList<QuestãoDissertativa>();
	}
	
	//Métodos questão múltipla escolha
	public void cadastraQuestãoME(QuestãoMultiplaEscolha me) throws QuestãoJáExisteException{
		for(QuestãoMultiplaEscolha q: this.questõesMultiplaEscolha){
			if(q.getCodPergunta().equals(me.getCodPergunta())){
				throw new QuestãoJáExisteException("Questão já cadastrada"+me.getPergunta());
			}
		}questõesMultiplaEscolha.add(me);
	}
	
	public String retornaRepresQuestãoME(String codPergunta)throws PerguntaInexistenteException{
		for(QuestãoMultiplaEscolha Me: this.questõesMultiplaEscolha){
			if(Me.getCodPergunta()==codPergunta){
				return Me.toStringRepresentação();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestãoMultiplaEscolha> ListarQuestõesME(){
		return questõesMultiplaEscolha;
	}
	
	public QuestãoMultiplaEscolha pesquisaQuestãoMe(String cod) throws PerguntaInexistenteException{
		for(QuestãoMultiplaEscolha mE: this.questõesMultiplaEscolha){
			if(mE.getCodPergunta()==cod){
				return mE;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigiQuestãoME (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaP;
		for(QuestãoMultiplaEscolha e: this.questõesMultiplaEscolha){
			if(e.getCodPergunta().equals(resposta.getCódigoPergunta())){
				respostaP = e.getResposta();
				if(e.getResposta().equals(resposta.getResposta())){
					return"Você acertou a questão!";
				}else{
					return "Você não acertou a questão! A resposta esperada é: "+respostaP;
				}
			}
		}throw new PerguntaInexistenteException("Questão não encontrada: "+resposta.getCódigoPergunta());
	}
	
	//Métodos questão dissertativa
	public void cadastraQuestãoD(QuestãoDissertativa qD) throws QuestãoJáExisteException{
		for(QuestãoDissertativa d: this.questõesDissertativas){
			if(d.getCodPergunta().equals(qD.getCodPergunta())){
				throw new QuestãoJáExisteException("Questão já cadastrada"+qD.getPergunta());
			}
		}questõesDissertativas.add(qD);
	}
	
	public String retornaRepresQuestãoD(String codPergunta)throws PerguntaInexistenteException{
		for(QuestãoDissertativa d: this.questõesDissertativas){
			if(d.getCodPergunta().equals(codPergunta)){
				return d.toStringRepresentação();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestãoDissertativa> ListarQuestõesD(){
		return questõesDissertativas;
	}
	
	public QuestãoDissertativa pesquisaQuestãoD(String cod) throws PerguntaInexistenteException{
		for(QuestãoDissertativa d: this.questõesDissertativas){
			if(d.getCodPergunta()==cod){
				return d;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigiQuestãoD(RespostaAluno resposta) throws PerguntaInexistenteException {
		for(QuestãoDissertativa d: this.questõesDissertativas){
			if(d.getCodPergunta()==resposta.getCódigoPergunta()){
				return "Sua resposta foi: "+resposta.getResposta() +"A resposta esperada é: "+d.getResposta();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+ resposta.getCódigoPergunta());
	}
	
	//Métodos questãoVouF
	public void cadastraQuestãoVouF(QuestãoVouF vF) throws QuestãoJáExisteException{
		for(QuestãoVouF v: this.questõesVouF){
			if(v.getCodPergunta().equals(vF.getCodPergunta())){
				throw new QuestãoJáExisteException("Questão já cadastrada"+vF.getPergunta());
			}
		}questõesVouF.add(vF);
	}
	
	public String retornaRepresQuestãoVouF(String codPergunta)throws PerguntaInexistenteException{
		for(QuestãoVouF v: this.questõesVouF){
			if(v.getCodPergunta()==codPergunta){
				return v.toStringRepresentação();
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+codPergunta);
	}
	
	public List<QuestãoVouF> ListarQuestõesVouF(){
		return questõesVouF;
	}
	
	public QuestãoVouF pesquisaQuestãoVouF(String cod) throws PerguntaInexistenteException{
		for(QuestãoVouF vF: this.questõesVouF){
			if(vF.getCodPergunta()==cod){
				return vF;
			}
		}throw new PerguntaInexistenteException("Questão inexistente"+cod);
	}
	
	public String corrigiQuestãoVouF (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaV;
		for(QuestãoVouF vF: this.questõesVouF){
			if(vF.getCodPergunta().equals(resposta.getCódigoPergunta())){
				respostaV = vF.getResposta();
				if(vF.getResposta().equals(resposta.getResposta())){
					return "Você acertou a questão!";
				}else{
					return "Você não acertou a questão! A resposta esperada é: "+respostaV;
				}
			}
		}throw new PerguntaInexistenteException("Pergunta não encontrada: "+ resposta.getCódigoPergunta());
	}
	
	
	//Métodos genéricos
	
	public String pesquisaQuestãoCod(TipoQuestão t, String cod) throws PerguntaInexistenteException{
		if(t == TipoQuestão.D){
			return retornaRepresQuestãoD(cod);
		}
		else if(t == TipoQuestão.V_F){
			return retornaRepresQuestãoVouF(cod);
		}
		else{
			return retornaRepresQuestãoME(cod);
		}
	}
	
	public String corrigiQuestãoCod(TipoQuestão t, RespostaAluno resp) throws PerguntaInexistenteException{
		if(t == TipoQuestão.D){
			return corrigiQuestãoD(resp);
		}
		else if(t == TipoQuestão.V_F){
			return corrigiQuestãoVouF(resp);
		}else{
			return corrigiQuestãoME(resp);
		}
	}
}
 