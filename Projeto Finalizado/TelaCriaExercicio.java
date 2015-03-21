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

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCriaExercicio extends JFrame {

	private JPanel contentPane;


	public TelaCriaExercicio(final BancoDeQuestoesFacade fachada, final Exercicio ex) {
		setTitle("Criando Exerc\u00EDcio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Adicionar quest\u00F5es ao exerc\u00EDcio do tipo:");
		lblNewLabel.setBounds(21, 21, 278, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Dissertativa");
		btnNewButton.setBounds(157, 46, 118, 23);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new QuestaoDController(fachada, this, ex));
		
		JButton btnVOuF = new JButton("V ou F");
		btnVOuF.setBounds(157, 80, 118, 23);
		contentPane.add(btnVOuF);
		btnVOuF.addActionListener(new QuestaoVouFController(fachada, this, ex));
		
		JButton btnMltiplaEscolha = new JButton("M\u00FAltipla Escolha");
		btnMltiplaEscolha.setBounds(157, 114, 118, 23);
		contentPane.add(btnMltiplaEscolha);
		btnMltiplaEscolha.addActionListener(new QuestaoMEController(fachada, this, ex));
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(82, 209, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnCadastrarExerccio = new JButton("Cadastrar Exerc\u00EDcio");
		btnCadastrarExerccio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					fachada.cadastraExercicio(ex);
					SalvarObjeto.salvar(fachada, "Backup");
					JOptionPane.showMessageDialog(contentPane, "Exercício cadastrado com sucesso! "+ex.getAssunto());
				} catch (ExercicioExistenteException e1) {
					JOptionPane.showMessageDialog(contentPane, "Exercício já consta no sistema! "+ex.getAssunto());
				}
			}
		});
		btnCadastrarExerccio.setBounds(237, 209, 137, 23);
		contentPane.add(btnCadastrarExerccio);
		btnVoltar.addActionListener(new SairController(fachada, this));
	}
}
