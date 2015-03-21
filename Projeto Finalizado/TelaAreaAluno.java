package BancoDeQuestoes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaAreaAluno extends JFrame {

	private JPanel contentPane;

	
	public TelaAreaAluno(BancoDeQuestoesFacade fachada, Aluno a) {
		setTitle("\u00C1rea do Aluno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnListarExercicios = new JButton("Listar Exerc\u00EDcios");
		btnListarExercicios.setBounds(139, 52, 146, 23);
		contentPane.add(btnListarExercicios);
		btnListarExercicios.addActionListener(new ListaExerciciosController(fachada, this));
		
		JButton btnEscolherExercicios = new JButton("Escolher Exerc\u00EDcios");
		btnEscolherExercicios.setBounds(139, 86, 146, 23);
		contentPane.add(btnEscolherExercicios);
		btnEscolherExercicios.addActionListener(new EscolheExercicioController(fachada, this, a));
		
		JButton btnSortearExercicios = new JButton("Sortear Exerc\u00EDcios");
		btnSortearExercicios.setBounds(139, 120, 146, 23);
		contentPane.add(btnSortearExercicios);
		btnSortearExercicios.addActionListener(new SorteiaExercicioController(fachada, this, a));
		
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(139, 154, 146, 23);
		contentPane.add(btnSair);
		btnSair.addActionListener(new SairController(fachada, this));
	}

}
