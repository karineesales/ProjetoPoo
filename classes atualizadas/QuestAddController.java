package BancoDeQuest�es;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuestAddController implements ActionListener {
	BancoDeQuest�esFacade QuestFacade = new GerenciadorDeQuest�es();
	JFrame janelaPrincipal;
	
	public QuestAddController(BancoDeQuest�esFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a resposta esperada: ");
		QuestFacade.cadastraQuest�oD(pergunta,resposta);
		JOptionPane.showMessageDialog(janelaPrincipal, "Quest�o Dissertativa cadastrada com sucesso!");
		
	}

}
