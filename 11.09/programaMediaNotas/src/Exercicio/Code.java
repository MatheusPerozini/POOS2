package Exercicio;
import javax.swing.JOptionPane;
public class Code {
    private float nota1,nota2,nota3,peso1,peso2,peso3;
    
    public void mostrarNotas(){
    this.peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da primeira prova"));
    this.nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota da primeira prova"));
    this.peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da segunda prova"));
    this.nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota da segunda prova"));
    this.peso3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso da terceira prova"));
    this.nota3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o nota da terceira prova"));
    
    float multiplicacao = this.peso1 * this.nota1 + this.peso2 * this.nota2 + this.peso3 * this.nota3;
    float somaPesos = this.peso1 + this.peso2 + this.peso3;
    float resultado = multiplicacao/somaPesos;
    JOptionPane.showMessageDialog(null , "A média final foi : " + resultado);
    }
}
