package BancoDeQuest�es;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestPesquisaController implements ActionListener{
	BancoDeQuest�esFacade QuestFacade = new GerenciadorDeQuest�es();
	JFrame janelaPrincipal;
	
	public QuestPesquisaController(BancoDeQuest�esFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String retorno = QuestFacade.pesquisaQuest�oD(pergunta);
		JOptionPane.showMessageDialog(janelaPrincipal, retorno);
	}

}
