package BancoDeQuest�es;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class QuestAddController implements ActionListener {
	BancoDeQuest�esFacade QuestFacade = new BancoDeQuest�esFacade();
	JFrame janelaPrincipal;
	
	public QuestAddController(BancoDeQuest�esFacade QuestFacade, JFrame janelaPrincipal){
		this.QuestFacade = QuestFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	public void actionPerformed(ActionEvent arg0) {
		String cod = JOptionPane.showInputDialog(janelaPrincipal, "Digite o c�digo da pergunta: ");
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a pergunta: ");
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Digite a resposta esperada: ");
		Quest�oDissertativa d = new Quest�oDissertativa(TipoQuest�o.D,cod, pergunta, resposta);
		try {
			QuestFacade.cadastraQuest�oD(d);
		} catch (Quest�oJ�ExisteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(janelaPrincipal, "Quest�o Dissertativa cadastrada com sucesso!");
		
	}

}
