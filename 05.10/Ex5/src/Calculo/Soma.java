package Calculo;
import javax.swing.JOptionPane;

public class Soma {
    int valorSoma;
    
    void somatoria(){  
        for(int i = 1;i <= 10 ; i++){
            this.valorSoma += Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i+"° valor para somar"));
        }
    }
    
    void mostrarValorSoma(){
        JOptionPane.showMessageDialog(null, "O valor da somatória é " + this.valorSoma);
    }
}
