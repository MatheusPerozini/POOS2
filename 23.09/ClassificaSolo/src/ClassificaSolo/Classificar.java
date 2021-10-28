package ClassificaSolo;

public class Classificar {
    private float agua;
    
    public String classificador(float agua){
        this.agua = agua;
        
        if(agua <= 10){
            return "A classificação da água é : Rochosa";
        } else if(agua > 10 && agua <= 40){
            return "A classificação da água é : Firme";
        } else if(agua > 40 && agua <= 80){
            return "A classificação da água é : Pantanosa";
        } else {
            return "Quantidade de água invalida";
        }
    }
}
