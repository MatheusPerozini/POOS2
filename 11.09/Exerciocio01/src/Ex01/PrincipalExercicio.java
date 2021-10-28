package Ex01;
import javax.swing.JOptionPane;
public class PrincipalExercicio {
    public static void main(String[] args){
        Exercicio exercicio = new Exercicio();
        
        String nome,rg;
        nome = JOptionPane.showInputDialog("Inform o nome");
        rg=JOptionPane.showInputDialog("Inform o rg");
        
         exercicio.mostrar(nome, rg);
         exercicio.mostrarNome(nome);
    }
}
