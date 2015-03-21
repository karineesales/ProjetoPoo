package BancoDeQuestoes;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BancoDeQuestoesGUI extends JFrame{
	
	
	   
		public static void main(String args[]) throws FileNotFoundException{
			final BancoDeQuestoesFacade banco;
			Path p1 = Paths.get("Backup");//cria Path - caminho
			if(Files.notExists(p1, LinkOption.NOFOLLOW_LINKS)){//ver se já existe o caminho
				banco = new BancoDeQuestoesFacade();
			}else{
				banco = RestaurarObjeto.restaurar("Backup");//persistência - restaurando sistema
			}JFrame TelaInicial = new TelaInicial(banco);
			TelaInicial.setVisible(true);
			WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
				public void windowClosing(WindowEvent e){
					System.exit(0);
					SalvarObjeto.salvar(banco, "Backup");//persistência - salvando sistema
				}
			};
			TelaInicial.addWindowListener(fechadorDeJanelaPrincipal);
			
	
		}

	

}

