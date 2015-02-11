package BancoDeQuest�es;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuest�es implements BancoDeQuest�esFacade {
	private List <Quest�oMultiplaEscolha> quest�esMultiplaEscolha;
	private List <Quest�oVouF> quest�esVouF;
	private List <Quest�oDissertativa> quest�esDissertativas;
	
	
	public GerenciadorDeQuest�es(){
		this.quest�esMultiplaEscolha = new ArrayList<Quest�oMultiplaEscolha>();
		this.quest�esVouF = new ArrayList<Quest�oVouF>();
		this.quest�esDissertativas = new ArrayList<Quest�oDissertativa>();
	}
	
	public void cadastraQuest�oME(Quest�oMultiplaEscolha q){
		quest�esMultiplaEscolha.add(q);
	}

	public void cadastraQuest�oD(String pergunta, String resposta){
		Quest�oDissertativa qD = new Quest�oDissertativa(pergunta,resposta);
		quest�esDissertativas.add(qD);
	}
	
	public String pesquisaQuest�oD(String pergunta){
		for(Quest�oDissertativa d: this.quest�esDissertativas){
			if(d.getPergunta().equals(pergunta)){
				return "Quest�o encontrada"+d.toStringRepresenta��o();
			}
		}return "Quest�o n�o encontrada";
	}
	
	public void cadastraQuest�oVouF(Quest�oVouF q){
		quest�esVouF.add(q);
	}
	
	public List<Quest�oMultiplaEscolha> ListarQuest�esME(){
		return quest�esMultiplaEscolha;
	}
	
	public String corrigiQuest�oME (Quest�oMultiplaEscolha q){
		if(q.getResposta().equals(q.getResposta())){
			return "Voc� acertou!";
		}else{
			return "Voc� n�o acertou!";
		}
	}
	
	public String corrigiQuest�oVouF (Quest�oVouF aluno, Quest�oVouF prof){
		int qntdAcertos=0;
		for(String s: aluno.getRespostasAluno()){
			String resp1 = s;
			for(String r: prof.getRespostasProfessor()){
				String resp2 = r;
				if(resp1==resp2){
					qntdAcertos++;
				}
			}
		}return "Voc� acertou "+qntdAcertos+ "alternativas.";
	}
	
	
	public String corrigiQuest�oD(Quest�oDissertativa d){
		return "Sua resposta foi: "+d.getRespostaAluno()+
				"A resposta certa �: "+d.getResposta();
	}

	
}
