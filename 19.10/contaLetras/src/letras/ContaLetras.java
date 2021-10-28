/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;
import javax.swing.JOptionPane;
/**
 *
 * @author mathe
 */
public class ContaLetras {
    String[] letras = new String[26];
    int[] quantidades = new int[26];
    
        public void registrarLetras(){
            String comando;
            boolean stop = false;
            int lugaresNovo = 0;
            do{
                comando = JOptionPane.showInputDialog("Digite uma letra");
            if(comando.equalsIgnoreCase("0")){
                stop = true;
            } else {
                for(int i = 0;i < this.letras.length;i++){
                    if(comando.equalsIgnoreCase(this.letras[i])){
                        this.quantidades[i] += 1;
                        break;
                    } else if(this.letras[i] == null && lugaresNovo == i){
                        this.letras[i] = comando;
                        this.quantidades[i] = 1;
                        lugaresNovo++;
                        break;
                    }
                }
            }
            }while(stop == false);
        }
        
        public void mostrarLetras(){
            for(int i = 0;this.letras.length > i;i++){
                if(this.letras[i] != null){
                    JOptionPane.showMessageDialog(null,"A letra " + this.letras[i] + " foi digitada " + this.quantidades[i] + " vez");
                }
            }
        }
}
