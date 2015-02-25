package BancoDeQuestões;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuestAddController implements ActionListener {
	BancoDeQuestõesFacade QuestFacade = new BancoDeQuestõesFacade();
	JFrame janelaPrincipal;
	
	public QuestAddController(BancoDeQuestõesFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String cod = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código da pergunta: ");
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a resposta esperada: ");
		QuestãoDissertativa d = new QuestãoDissertativa(TipoQuestão.D,cod, pergunta, resposta);
		try {
			QuestFacade.cadastraQuestãoD(d);
		} catch (QuestãoJáExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal, "Questão Dissertativa cadastrada com sucesso!");
		
	}

}
