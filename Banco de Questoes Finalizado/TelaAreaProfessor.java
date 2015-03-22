package BancoDeQuestoes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JToggleButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TelaAreaProfessor extends JFrame {

	private JPanel contentPane;


	public TelaAreaProfessor(final BancoDeQuestoesFacade fachada, Professor p) {
		setTitle("\u00C1rea do Professor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Criar Exerc\u00EDcio");
		btnNewButton.setBounds(125, 41, 159, 26);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new CriaExercicioController(fachada, this,p));
		
		JButton btnListarExerccios = new JButton("Listar Exerc\u00EDcios");
		btnListarExerccios.setBounds(125, 82, 159, 26);
		contentPane.add(btnListarExerccios);
		btnListarExerccios.addActionListener(new ListaExerciciosController(fachada, this));
		
		JButton btnObterFeedback = new JButton("Obter FeedBack");
		btnObterFeedback.setBounds(125, 124, 159, 26);
		contentPane.add(btnObterFeedback);
		btnObterFeedback.addActionListener(new FeedController(fachada, this));
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(125, 162, 159, 26);
		contentPane.add(btnSair);
		btnSair.addActionListener(new SairController(fachada, this));
	}
}
