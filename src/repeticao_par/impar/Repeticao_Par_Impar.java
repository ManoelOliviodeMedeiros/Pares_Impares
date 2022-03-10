
package repeticao_par.impar;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author  Manoel Olivio de Medeiros
 */
public class Repeticao_Par_Impar {

   
    public static void main(String[] args) {
        //IMPRIME NA TELA OS NÚMEROS IMPARES E GRAVA M ARQUIVO OS PARES
        
           int r = 0;
           
           while ( r < 10){
               r++;
               if (r %2 != 0){
                   System.out.println("GLÓRIA A DEUS  = " + r);  
               }else{
                   // System.out.println("JESUS É O MEU SENHOR  = " + r); 
                   
          try {
            FileWriter fw = new FileWriter("c:\\pasta\\cli.txt", true);
              PrintWriter pw = new PrintWriter(fw);
              pw.println("JESUE É O MEU SALVADOR  = " + r);
              pw.flush();
              pw.close(); 
              fw.close();
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null,"erro ao gravar" + erro.getMessage());
        }
   
       }    
     }
        
   }
    
}
