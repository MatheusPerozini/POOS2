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
public class Principal {
    public static void main(String[] args){
        Comparador comparador = new Comparador();
        
        comparador.comparar();
        JOptionPane.showMessageDialog(null, "O maior valor digitado foi " + comparador.numMaior + 
                ". O menor numero digitado foi " + comparador.numMenor);
    }
}
