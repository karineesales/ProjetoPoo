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

public class TelaCadastroInicial extends JFrame {

	private JPanel contentPane;

	public TelaCadastroInicial(BancoDeQuestoesFacade fachada) {
		setTitle("\u00C1rea de Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCadastrarAluno = new JButton("Cadastrar Aluno");
		btnCadastrarAluno.setBounds(125, 38, 175, 26);
		contentPane.add(btnCadastrarAluno);
		btnCadastrarAluno.addActionListener(new CadastroAController(fachada, this));
		
		JButton btnNewButton = new JButton("Cadastrar Professor");
		btnNewButton.setBounds(125, 99, 175, 26);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new CadastroPController(fachada, this));
		
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.setBounds(125, 169, 175, 26);
		contentPane.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new SairController(fachada, this));
	}

}
