package BancoDeQuestoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListaExerciciosController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	
	public ListaExerciciosController(BancoDeQuestoesFacade fachada, JFrame janela){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(fachada.getExercicios().size()==0){
			JOptionPane.showMessageDialog(null, "Não há exercícios cadastrados para gerarmos uma lista!");
		}
		else{
			String inicio = "Assuntos (referências) dos Exercicios cadastrados \n";
			for(Exercicio e: fachada.getExercicios()){
			inicio = inicio+e.getAssunto() + "\n";
			}
			JOptionPane.showMessageDialog(null, inicio);
		}
		
	}
}

