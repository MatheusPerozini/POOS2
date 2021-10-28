package Programa;
import javax.swing.JOptionPane;

public class Calculo {
    public void calcularEMostrar(float salario , float porcentagem){
        float porcetagemFinal = (porcentagem + 100)/100;
        float resultado = salario * porcetagemFinal;
        
        JOptionPane.showMessageDialog(null,"O salario final vai ficar : "+ resultado);
    }
}
