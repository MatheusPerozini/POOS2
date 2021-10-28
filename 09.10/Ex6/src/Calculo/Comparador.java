/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculo;
import javax.swing.JOptionPane;
/**
 *
 * @author mathe
 */
public class Comparador {
    int numMaior,numMenor;
    
    void comparar(){
        int numDigitado;
        for(int i = 1;i <= 10;i++){
            numDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "° número para comparar"));
            if(i == 1){
                this.numMaior = numDigitado;
                this.numMenor = numDigitado;
            }
            if(numDigitado > this.numMaior){
                this.numMaior = numDigitado;
            } else if(numDigitado < this.numMenor){
                this.numMenor = numDigitado;
            }
        }
    }
}
