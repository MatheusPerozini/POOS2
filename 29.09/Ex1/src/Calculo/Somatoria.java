package Calculo;

import javax.swing.JOptionPane;

public class Somatoria {
    int calculo = 0;
    
    public void somar(){
        for(int i = 1;10 >= i;i++){
            int digito = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para somar"));
            this.calculo += digito;
        }
    }
    
    public void resultado(){
        JOptionPane.showMessageDialog(null,"A soma de todos os numeros digitado é : " + this.calculo);
    }
}
