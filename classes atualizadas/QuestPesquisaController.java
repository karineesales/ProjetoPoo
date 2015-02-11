package BancoDeQuestões;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestPesquisaController implements ActionListener{
	BancoDeQuestõesFacade QuestFacade = new GerenciadorDeQuestões();
	JFrame janelaPrincipal;
	
	public QuestPesquisaController(BancoDeQuestõesFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String retorno = QuestFacade.pesquisaQuestãoD(pergunta);
		JOptionPane.showMessageDialog(janelaPrincipal, retorno);
	}

}
