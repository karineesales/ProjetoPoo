package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestaoMEController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	Exercicio e;
	
	
	public QuestaoMEController(BancoDeQuestoesFacade fachada, JFrame janela, Exercicio e){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
		this.e = e;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String codQuestao = JOptionPane.showInputDialog(janelaPrincipal, "Código da questão: ");
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Pergunta: ");
		int qntdAlternativas = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "Quantidade de alternativas a cadastrar: "));
		List<String> alternativas = new ArrayList<String>();
		for(int k=0; k<qntdAlternativas;k++){
			String alternativa = JOptionPane.showInputDialog(janelaPrincipal, "Alternativa: (modelo: a) Lua) ");
			alternativas.add(alternativa);
		}
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Resposta: (modelo: a) ");
		QuestaoMultiplaEscolha me = new QuestaoMultiplaEscolha(TipoQuestao.M_E, codQuestao, pergunta, alternativas, resposta);
		try{
			fachada.cadastraQuestaoME(me);
			e.cadastraQuestaoMENoExercicio(me);
			SalvarObjeto.salvar(fachada, "Backup");
			JOptionPane.showMessageDialog(janelaPrincipal, "Questão Multipla Escolha cadastrada!");
		}catch(QuestaoJaExisteException e){
			JOptionPane.showMessageDialog(janelaPrincipal, "Questão já cadastrada no sistema"+codQuestao);
		}
		
	}
		
		
}
