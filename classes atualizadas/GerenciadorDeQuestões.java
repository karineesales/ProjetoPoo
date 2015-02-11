package BancoDeQuestões;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeQuestões implements BancoDeQuestõesFacade {
	private List <QuestãoMultiplaEscolha> questõesMultiplaEscolha;
	private List <QuestãoVouF> questõesVouF;
	private List <QuestãoDissertativa> questõesDissertativas;
	
	
	public GerenciadorDeQuestões(){
		this.questõesMultiplaEscolha = new ArrayList<QuestãoMultiplaEscolha>();
		this.questõesVouF = new ArrayList<QuestãoVouF>();
		this.questõesDissertativas = new ArrayList<QuestãoDissertativa>();
	}
	
	public void cadastraQuestãoME(QuestãoMultiplaEscolha q){
		questõesMultiplaEscolha.add(q);
	}

	public void cadastraQuestãoD(String pergunta, String resposta){
		QuestãoDissertativa qD = new QuestãoDissertativa(pergunta,resposta);
		questõesDissertativas.add(qD);
	}
	
	public String pesquisaQuestãoD(String pergunta){
		for(QuestãoDissertativa d: this.questõesDissertativas){
			if(d.getPergunta().equals(pergunta)){
				return "Questão encontrada"+d.toStringRepresentação();
			}
		}return "Questão não encontrada";
	}
	
	public void cadastraQuestãoVouF(QuestãoVouF q){
		questõesVouF.add(q);
	}
	
	public List<QuestãoMultiplaEscolha> ListarQuestõesME(){
		return questõesMultiplaEscolha;
	}
	
	public String corrigiQuestãoME (QuestãoMultiplaEscolha q){
		if(q.getResposta().equals(q.getResposta())){
			return "Você acertou!";
		}else{
			return "Você não acertou!";
		}
	}
	
	public String corrigiQuestãoVouF (QuestãoVouF aluno, QuestãoVouF prof){
		int qntdAcertos=0;
		for(String s: aluno.getRespostasAluno()){
			String resp1 = s;
			for(String r: prof.getRespostasProfessor()){
				String resp2 = r;
				if(resp1==resp2){
					qntdAcertos++;
				}
			}
		}return "Você acertou "+qntdAcertos+ "alternativas.";
	}
	
	
	public String corrigiQuestãoD(QuestãoDissertativa d){
		return "Sua resposta foi: "+d.getRespostaAluno()+
				"A resposta certa é: "+d.getResposta();
	}

	
}
