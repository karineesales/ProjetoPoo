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

public class SorteiaExercicioController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	Aluno aluno;
	
	public SorteiaExercicioController(BancoDeQuestoesFacade fachada, JFrame janela, Aluno aluno){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
		this.aluno = aluno;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(fachada.getExercicios().size()!=0){
			Exercicio e = fachada.sorteiaExercício();
			JOptionPane.showMessageDialog(null, "Exercício sorteado foi: "+e.getAssunto());
			for(Questao q: e.listarQuestoes()){
				try{
					aluno.cadastraExResolvidosDoAluno(e);
					String resp = JOptionPane.showInputDialog(fachada.pesquisaQuestaoCod(q.getTipo(), q.getCodPergunta()));
					RespostaAluno respA = new RespostaAluno(e.getAssunto(), q.getCodPergunta(), resp);
					JOptionPane.showMessageDialog(null, fachada.corrigeQuestaoCod(q.getTipo(), respA));
					aluno.cadastraRespostasDoAluno(respA);
					SalvarObjeto.salvar(fachada, "Backup");
				}catch (ExercicioExistenteException e1) {
					JOptionPane.showMessageDialog(null, "Você já respondeu esse exercício!");
				}catch(PerguntaInexistenteException ex){
					JOptionPane.showMessageDialog(null, "Pergunta não encontrada no sistema para correção!");
				} catch (RespostaNullException e1) {
					JOptionPane.showMessageDialog(null, "Preencha todas as perguntas! Suas respostas não foram cadastradas.");
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Ainda não há exercícios cadastrados!");
		}
		
		
	}
}
