package BancoDeQuestões;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuestAddController implements ActionListener {
	BancoDeQuestõesFacade QuestFacade = new GerenciadorDeQuestões();
	JFrame janelaPrincipal;
	
	public QuestAddController(BancoDeQuestõesFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a resposta esperada: ");
		QuestFacade.cadastraQuestãoD(pergunta,resposta);
		JOptionPane.showMessageDialog(janelaPrincipal, "Questão Dissertativa cadastrada com sucesso!");
		
	}

}
