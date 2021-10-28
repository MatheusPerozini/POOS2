package Ex01;
import javax.swing.JOptionPane;
public class Exercicio {
    private String nome,rg;
    
    public void mostrar(String nome , String rg){
        this.nome = nome;
        this.rg = rg;
        JOptionPane.showMessageDialog(null,"O nome informado foi :" + this.nome + "O rg é : "
                + this.rg);
    }
   
    public void mostrarNome(String nome){
        this.nome = nome;
        JOptionPane.showMessageDialog(null,"O nome é :" + this.nome);
    }
}


