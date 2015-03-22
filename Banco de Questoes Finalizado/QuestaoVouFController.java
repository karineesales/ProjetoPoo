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

public class QuestaoVouFController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	Exercicio e;
	
	
	public QuestaoVouFController(BancoDeQuestoesFacade fachada, JFrame janela, Exercicio e){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
		this.e = e;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String codQuestao = JOptionPane.showInputDialog(janelaPrincipal, "Código da questão: ");
		String pergunta = JOptionPane.showInputDialog(janelaPrincipal, "Pergunta: ");
		String resposta = JOptionPane.showInputDialog(janelaPrincipal, "Resposta esperada: (modelo: V) ");
		QuestaoVouF vf = new QuestaoVouF(TipoQuestao.V_F, codQuestao, pergunta, resposta);
		try{
			fachada.cadastraQuestaoVouF(vf);
			e.cadastraQuestaoVouFNoExercicio(vf);
			SalvarObjeto.salvar(fachada, "Backup");
			JOptionPane.showMessageDialog(janelaPrincipal, "Questão V ou F cadastrada!");
		}catch(QuestaoJaExisteException e){
			JOptionPane.showMessageDialog(janelaPrincipal, "Questão já cadastrada no sistema"+codQuestao);
		}
		
	}
		
		
}
