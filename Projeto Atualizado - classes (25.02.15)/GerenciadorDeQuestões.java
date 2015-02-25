package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuest�es {
	List <Quest�oMultiplaEscolha> quest�esMultiplaEscolha;
	List <Quest�oVouF> quest�esVouF;
	List <Quest�oDissertativa> quest�esDissertativas;
	
	
	public GerenciadorDeQuest�es(){
		this.quest�esMultiplaEscolha = new ArrayList<Quest�oMultiplaEscolha>();
		this.quest�esVouF = new ArrayList<Quest�oVouF>();
		this.quest�esDissertativas = new ArrayList<Quest�oDissertativa>();
	}
	
	//M�todos quest�o m�ltipla escolha
	public void cadastraQuest�oME(Quest�oMultiplaEscolha me) throws Quest�oJ�ExisteException{
		for(Quest�oMultiplaEscolha q: this.quest�esMultiplaEscolha){
			if(q.getCodPergunta().equals(me.getCodPergunta())){
				throw new Quest�oJ�ExisteException("Quest�o j� cadastrada"+me.getPergunta());
			}
		}quest�esMultiplaEscolha.add(me);
	}
	
	public String retornaRepresQuest�oME(String codPergunta)throws PerguntaInexistenteException{
		for(Quest�oMultiplaEscolha Me: this.quest�esMultiplaEscolha){
			if(Me.getCodPergunta()==codPergunta){
				return Me.toStringRepresenta��o();
			}
		}throw new PerguntaInexistenteException("Pergunta n�o encontrada: "+codPergunta);
	}
	
	public List<Quest�oMultiplaEscolha> ListarQuest�esME(){
		return quest�esMultiplaEscolha;
	}
	
	public Quest�oMultiplaEscolha pesquisaQuest�oMe(String cod) throws PerguntaInexistenteException{
		for(Quest�oMultiplaEscolha mE: this.quest�esMultiplaEscolha){
			if(mE.getCodPergunta()==cod){
				return mE;
			}
		}throw new PerguntaInexistenteException("Quest�o inexistente"+cod);
	}
	
	public String corrigiQuest�oME (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaP;
		for(Quest�oMultiplaEscolha e: this.quest�esMultiplaEscolha){
			if(e.getCodPergunta().equals(resposta.getC�digoPergunta())){
				respostaP = e.getResposta();
				if(e.getResposta().equals(resposta.getResposta())){
					return"Voc� acertou a quest�o!";
				}else{
					return "Voc� n�o acertou a quest�o! A resposta esperada �: "+respostaP;
				}
			}
		}throw new PerguntaInexistenteException("Quest�o n�o encontrada: "+resposta.getC�digoPergunta());
	}
	
	//M�todos quest�o dissertativa
	public void cadastraQuest�oD(Quest�oDissertativa qD) throws Quest�oJ�ExisteException{
		for(Quest�oDissertativa d: this.quest�esDissertativas){
			if(d.getCodPergunta().equals(qD.getCodPergunta())){
				throw new Quest�oJ�ExisteException("Quest�o j� cadastrada"+qD.getPergunta());
			}
		}quest�esDissertativas.add(qD);
	}
	
	public String retornaRepresQuest�oD(String codPergunta)throws PerguntaInexistenteException{
		for(Quest�oDissertativa d: this.quest�esDissertativas){
			if(d.getCodPergunta().equals(codPergunta)){
				return d.toStringRepresenta��o();
			}
		}throw new PerguntaInexistenteException("Pergunta n�o encontrada: "+codPergunta);
	}
	
	public List<Quest�oDissertativa> ListarQuest�esD(){
		return quest�esDissertativas;
	}
	
	public Quest�oDissertativa pesquisaQuest�oD(String cod) throws PerguntaInexistenteException{
		for(Quest�oDissertativa d: this.quest�esDissertativas){
			if(d.getCodPergunta()==cod){
				return d;
			}
		}throw new PerguntaInexistenteException("Quest�o inexistente"+cod);
	}
	
	public String corrigiQuest�oD(RespostaAluno resposta) throws PerguntaInexistenteException {
		for(Quest�oDissertativa d: this.quest�esDissertativas){
			if(d.getCodPergunta()==resposta.getC�digoPergunta()){
				return "Sua resposta foi: "+resposta.getResposta() +"A resposta esperada �: "+d.getResposta();
			}
		}throw new PerguntaInexistenteException("Pergunta n�o encontrada: "+ resposta.getC�digoPergunta());
	}
	
	//M�todos quest�oVouF
	public void cadastraQuest�oVouF(Quest�oVouF vF) throws Quest�oJ�ExisteException{
		for(Quest�oVouF v: this.quest�esVouF){
			if(v.getCodPergunta().equals(vF.getCodPergunta())){
				throw new Quest�oJ�ExisteException("Quest�o j� cadastrada"+vF.getPergunta());
			}
		}quest�esVouF.add(vF);
	}
	
	public String retornaRepresQuest�oVouF(String codPergunta)throws PerguntaInexistenteException{
		for(Quest�oVouF v: this.quest�esVouF){
			if(v.getCodPergunta()==codPergunta){
				return v.toStringRepresenta��o();
			}
		}throw new PerguntaInexistenteException("Pergunta n�o encontrada: "+codPergunta);
	}
	
	public List<Quest�oVouF> ListarQuest�esVouF(){
		return quest�esVouF;
	}
	
	public Quest�oVouF pesquisaQuest�oVouF(String cod) throws PerguntaInexistenteException{
		for(Quest�oVouF vF: this.quest�esVouF){
			if(vF.getCodPergunta()==cod){
				return vF;
			}
		}throw new PerguntaInexistenteException("Quest�o inexistente"+cod);
	}
	
	public String corrigiQuest�oVouF (RespostaAluno resposta)throws PerguntaInexistenteException{
		String respostaV;
		for(Quest�oVouF vF: this.quest�esVouF){
			if(vF.getCodPergunta().equals(resposta.getC�digoPergunta())){
				respostaV = vF.getResposta();
				if(vF.getResposta().equals(resposta.getResposta())){
					return "Voc� acertou a quest�o!";
				}else{
					return "Voc� n�o acertou a quest�o! A resposta esperada �: "+respostaV;
				}
			}
		}throw new PerguntaInexistenteException("Pergunta n�o encontrada: "+ resposta.getC�digoPergunta());
	}
	
	
	//M�todos gen�ricos
	
	public String pesquisaQuest�oCod(TipoQuest�o t, String cod) throws PerguntaInexistenteException{
		if(t == TipoQuest�o.D){
			return retornaRepresQuest�oD(cod);
		}
		else if(t == TipoQuest�o.V_F){
			return retornaRepresQuest�oVouF(cod);
		}
		else{
			return retornaRepresQuest�oME(cod);
		}
	}
	
	public String corrigiQuest�oCod(TipoQuest�o t, RespostaAluno resp) throws PerguntaInexistenteException{
		if(t == TipoQuest�o.D){
			return corrigiQuest�oD(resp);
		}
		else if(t == TipoQuest�o.V_F){
			return corrigiQuest�oVouF(resp);
		}else{
			return corrigiQuest�oME(resp);
		}
	}
}
 