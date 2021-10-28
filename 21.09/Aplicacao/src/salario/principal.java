package salario;
import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args){
        float salario,vendas;
        
        CalculoSalario calculosalario = new CalculoSalario();
        
        salario = Float.parseFloat(JOptionPane.showInputDialog("Digite o salario"));
        vendas = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor total de vendas"));
        
        JOptionPane.showMessageDialog(null,"O valor da comissão é : " +
                calculosalario.comissao(vendas));
        
        JOptionPane.showMessageDialog(null, "O valor que o funcionário " + 
                "deve receber é : " + 
                calculosalario.salarioComComissao(salario,vendas));
    }
}
