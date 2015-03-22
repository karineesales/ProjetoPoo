package BancoDeQuestoes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.Window.Type;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class TelaInicial extends JFrame {

	private JPanel contentPane;


	public TelaInicial(BancoDeQuestoesFacade fachada) {
		setTitle("AdKa Questions");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogarAluno = new JButton("Logar Aluno");
		btnLogarAluno.setBounds(136, 31, 130, 23);
		contentPane.add(btnLogarAluno);
		btnLogarAluno.addActionListener(new LoginAController(fachada, this));
		
		JButton btnLogarProfessor = new JButton("Logar Professor");
		btnLogarProfessor.setBounds(136, 92, 130, 23);
		contentPane.add(btnLogarProfessor);
		btnLogarProfessor.addActionListener(new LoginPController(fachada, this));
		
		JButton btnCadastro = new JButton("Cadastro");
		btnCadastro.setBounds(136, 165, 130, 23);
		contentPane.add(btnCadastro);
		btnCadastro.addActionListener(new CadastroController(fachada, this));
	}
}
