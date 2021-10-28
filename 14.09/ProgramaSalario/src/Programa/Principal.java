package Programa;
import javax.swing.JOptionPane;

public class Principal {
        public static void main(String[] args){        
        Calculo calculo = new Calculo();
        
        float salario =  Float.parseFloat(JOptionPane.showInputDialog("Digite o salario atual"));
        float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do aumento salarial em porcentagem"));
        
        calculo.calcularEMostrar(salario, porcentagem);
    }
}
