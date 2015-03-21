package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SairController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public SairController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		janelaPrincipal.setVisible(false);
	}
}