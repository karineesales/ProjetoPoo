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

public class EscolheExercicioController implements ActionListener {
	BancoDeQuestoesFacade fachada = new BancoDeQuestoesFacade();
	JFrame janelaPrincipal;
	Aluno aluno;
	
	public EscolheExercicioController(BancoDeQuestoesFacade fachada, JFrame janela, Aluno aluno){
		this.fachada = fachada;
		this.janelaPrincipal = janela;
		this.aluno = aluno;
	}
	
	public void actionPerformed(ActionEvent arg0) {
		String assunto = JOptionPane.showInputDialog(janelaPrincipal, "Digite o assunto que identifica o exercicio\n exatamente como se encontra na listagem de exercícios:  ");
		if(fachada.escolhaExercício(assunto)!=null){
			Exercicio e = fachada.escolhaExercício(assunto);
			aluno.cadastraExResolvidosDoAluno(e);
			for(Questao q: e.listarQuestoes()){
				try{
				String resp = JOptionPane.showInputDialog(fachada.pesquisaQuestaoCod(q.getTipo(), q.getCodPergunta()));
				RespostaAluno respA = new RespostaAluno(assunto, q.getCodPergunta(), resp);
				JOptionPane.showMessageDialog(null, fachada.corrigeQuestaoCod(q.getTipo(), respA));
				aluno.cadastraRespostasDoAluno(respA);
				SalvarObjeto.salvar(fachada, "Backup");
				}catch(PerguntaInexistenteException ex){
					JOptionPane.showMessageDialog(null, "Pergunta não encontrada no sistema para correção!");
				}
			}
		}else{
			JOptionPane.showMessageDialog(null, "Assunto do exercício está errado, consulte a lista de exercícios \n e tente outra vez!");
		}
		
		
	}
}
