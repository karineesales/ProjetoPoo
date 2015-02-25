package BancoDeQuestões;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestPesquisaController implements ActionListener{
	BancoDeQuestõesFacade QuestFacade = new BancoDeQuestõesFacade();
	JFrame janelaPrincipal;
	
	public QuestPesquisaController(BancoDeQuestõesFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String cod = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código da pergunta: ");
		try {
			String retorno = QuestFacade.retornaRepresQuestãoD(cod);
			JOptionPane.showMessageDialog(janelaPrincipal, retorno);
		} catch (PerguntaInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
