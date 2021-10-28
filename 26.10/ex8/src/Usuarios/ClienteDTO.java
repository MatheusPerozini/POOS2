/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

/**
 *
 * @author mathe
 */
public class ClienteDTO {
    private String nome,rg;
    private int idade;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    public int getIdade(){
        return this.idade;
    }
}
