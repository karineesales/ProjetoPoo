package BancoDeQuestoes;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RestaurarObjeto {

      public static BancoDeQuestoesFacade restaurar(String caminho) {
    	  	BancoDeQuestoesFacade objeto = null;
             try {
                    FileInputStream arquivoLeitura = new FileInputStream(caminho);
                    ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);

                    // recupera o objeto
                    objeto = (BancoDeQuestoesFacade) objLeitura.readObject();

                    objLeitura.close();
                    arquivoLeitura.close();
                    
             } catch (Exception e) {
                    e.printStackTrace();
             }

             return objeto;
      }
}

