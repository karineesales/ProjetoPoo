package BancoDeQuestoes;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class SalvarObjeto {
 
    public static void salvar(BancoDeQuestoesFacade objeto, String caminho) {
 
           try {
             FileOutputStream arquivoGrav = new FileOutputStream(caminho);
             ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
 
              // salva o objeto
             objGravar.writeObject(objeto);
             objGravar.flush();
             objGravar.close();
             arquivoGrav.flush();
             arquivoGrav.close();
        
           } catch (Exception exc) {
             exc.printStackTrace();
           }
    }
}

