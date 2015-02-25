package BancoDeQuest�es;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class QuestPesquisaController implements ActionListener{
	BancoDeQuest�esFacade QuestFacade = new BancoDeQuest�esFacade();
	JFrame janelaPrincipal;
	
	public QuestPesquisaController(BancoDeQuest�esFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String cod = JOptionPane.showInputDialog(janelaPrincipal, "Digite o c�digo da pergunta: ");
		try {
			String retorno = QuestFacade.retornaRepresQuest�oD(cod);
			JOptionPane.showMessageDialog(janelaPrincipal, retorno);
		} catch (PerguntaInexistenteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
