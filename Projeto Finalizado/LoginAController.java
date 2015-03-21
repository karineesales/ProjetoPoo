package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LoginAController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public LoginAController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String login = JOptionPane.showInputDialog(janelaPrincipal, "Login: " );
		String senha = JOptionPane.showInputDialog(janelaPrincipal, "Senha: " );
		Aluno a;
		try {
			a = fachada.pesquisaAlunoPeloLogin(login);
			fachada.autenticaAluno(login,senha,a);
			JOptionPane.showMessageDialog(janelaPrincipal, "Bem vindo ao sistema "+a.getNome()+"!");
			SalvarObjeto.salvar(fachada, "Backup");
			JFrame TelaAreaAluno = new TelaAreaAluno(fachada,a);
			TelaAreaAluno.setVisible(true);
		} catch (UsuarioInexistenteException e1) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Aluno não foi encontrado no sistema! Cheque seu login!");
		} catch (SenhaNegadaException | LoginInexistenteException e2) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Senha e Login não conferem! ");
		}

		
	}
		
}
