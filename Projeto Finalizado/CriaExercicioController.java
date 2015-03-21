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

public class CriaExercicioController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	
	public CriaExercicioController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String assunto = JOptionPane.showInputDialog(janelaPrincipal, "Digite o assunto que identificará o exercicio: ");
		Exercicio e = new Exercicio(assunto);
		SalvarObjeto.salvar(fachada, "Backup");
		JFrame janela = new TelaCriaExercicio(fachada, e);
		janela.setVisible(true);
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	};
	janela.addWindowListener(fechadorDeJanelaPrincipal);
	}}
