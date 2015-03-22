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

public class FeedController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	
	
	public FeedController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		try {
			JOptionPane.showMessageDialog(janelaPrincipal, fachada.obterFeedBackProfessor(fachada.getGerenciadorDeEx(), fachada.getGerenciadorDeAluno(), fachada.getGerenciadorDeQuestões()));
		} catch (PerguntaInexistenteException | QuestaoInexistenteException e) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Alguma questão não foi encontrada no sistema!");
		}
		
	}
		
		
}
