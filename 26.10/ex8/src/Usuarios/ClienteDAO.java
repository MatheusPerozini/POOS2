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
public class ClienteDAO {
    public String showNomeRg(ClienteDTO clienteDTO){
        return "O nome informado foi : " + clienteDTO.getNome() + "\n Rg informado foi : " + clienteDTO.getRg();
    }
    
    public String showNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi : " + clienteDTO.getNome() + "\n Idade informada foi : " + clienteDTO.getIdade();
    }
}
