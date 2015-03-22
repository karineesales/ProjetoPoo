package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastroPController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public CadastroPController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String codProf = JOptionPane.showInputDialog(janelaPrincipal, "Código do Professor: " );
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Nome: " );
		String email = JOptionPane.showInputDialog(janelaPrincipal, "Email: " );
		String login = JOptionPane.showInputDialog(janelaPrincipal, "Login: " );
		String senha = JOptionPane.showInputDialog(janelaPrincipal, "Senha: " );
		Professor p = new Professor(codProf, nome, email, login, senha);
		try {
			fachada.cadastraProfessor(p);
			SalvarObjeto.salvar(fachada, "Backup");
			JOptionPane.showMessageDialog(janelaPrincipal, "Professor cadastrado com sucesso! "+p.getNome());
		} catch (UsuarioJaExisteException e) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Usuário já consta no sistema: "+p.getCod());
		}
	}
}
