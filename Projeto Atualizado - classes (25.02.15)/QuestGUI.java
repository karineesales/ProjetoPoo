package BancoDeQuestões;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class QuestGUI extends JFrame {
	
	JLabel linha1, linha2;
	public QuestGUI(){
	   setTitle("AdKa - Questions");
	   setSize(400, 400); //tamanho da janela
	   setLocation(150, 150);   
	   setResizable(true);
	   getContentPane().setBackground(Color.white);
	   linha1 = new JLabel("Questão Dissertativa",       JLabel.CENTER);
	   linha1.setForeground(Color.red); 
	   linha1.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
	   getContentPane().setLayout(new GridLayout(3, 1));   
	   getContentPane().add(linha1);
	   JButton botaoCadastrar, botaoPesquisar;
	   BancoDeQuestõesFacade QuestFacade = new BancoDeQuestõesFacade();
	   botaoCadastrar = new JButton("Cadastrar Questão Dissertativa");
	   botaoCadastrar.addActionListener(new QuestAddController(QuestFacade, this));
	   botaoPesquisar = new JButton("Pesquisar Questão Dissertativa");
	   botaoPesquisar.addActionListener(new QuestPesquisaController(QuestFacade,this));
	   getContentPane().setLayout(new GridLayout(3,2));
	   getContentPane().add(botaoCadastrar);
	   getContentPane().add(botaoPesquisar);
	}
	
	public static void main(String args[]){
		JFrame janela = new QuestGUI();
		janela.setVisible(true);
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		};
		janela.addWindowListener(fechadorDeJanelaPrincipal);
	}
	



}


