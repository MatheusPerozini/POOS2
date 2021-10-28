package ClassificaSolo;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        float estadoAgua;
        
        Classificar classificar = new Classificar();
        
        estadoAgua = Float.parseFloat(JOptionPane.showInputDialog("Informe a pontuação da água"));
        JOptionPane.showMessageDialog(null,classificar.classificador(estadoAgua));
    }
}
