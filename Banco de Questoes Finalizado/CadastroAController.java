package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastroAController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public CadastroAController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	//String codAluno, String nome, String email, String login, String senha
	public void actionPerformed(ActionEvent arg0) {
		String codAluno = JOptionPane.showInputDialog(janelaPrincipal, "Código do Aluno: " );
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Nome: " );
		String email = JOptionPane.showInputDialog(janelaPrincipal, "Email: " );
		String login = JOptionPane.showInputDialog(janelaPrincipal, "Login: " );
		String senha = JOptionPane.showInputDialog(janelaPrincipal, "Senha: " );
		Aluno a = new Aluno(codAluno, nome, email, login, senha);
		try {
			fachada.cadastraAluno(a);
			SalvarObjeto.salvar(fachada, "Backup");
			JOptionPane.showMessageDialog(janelaPrincipal, "Aluno cadastrado com sucesso! "+a.getNome());
		} catch (UsuarioJaExisteException e) {
			JOptionPane.showMessageDialog(janelaPrincipal, "Usuário já consta no sistema: "+a.getCod());
		}
	}
		
}
