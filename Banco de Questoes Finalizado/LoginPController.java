package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginPController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public LoginPController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String login = JOptionPane.showInputDialog(janelaPrincipal, "Login: " );
		String senha = JOptionPane.showInputDialog(janelaPrincipal, "Senha: " );
		Professor p;
		try {
			p = fachada.pesquisaProfessorPeloLogin(login);
			fachada.autenticaProfessor(login,senha);
			JOptionPane.showMessageDialog(janelaPrincipal, "Bem vindo ao sistema "+p.getNome()+"!");
			SalvarObjeto.salvar(fachada, "Backup");
			JFrame TelaAreaProfessor = new TelaAreaProfessor(fachada,p);
			TelaAreaProfessor.setVisible(true);
		} catch (UsuarioInexistenteException e1) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Professor não foi encontrado no sistema! Cheque seu login!");
		} catch (SenhaNegadaException | LoginInexistenteException e2) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Senha e Login não conferem! ");
		}

	}
}
