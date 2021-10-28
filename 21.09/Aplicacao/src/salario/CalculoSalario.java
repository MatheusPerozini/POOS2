package salario;

public class CalculoSalario {
    double comissao;
        public double salarioComComissao(float salario , float vendas){
            double salarioFinal = this.comissao + salario;
            
        return salarioFinal;
    }
        public double comissao(float vendas){
            this.comissao = vendas * 0.04;
            
            return this.comissao;
        }
}
