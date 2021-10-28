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
import javax.swing.JOptionPane;
public class ClienteView {
    public static void main(String[] args){
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        try{
            clienteDTO.setNome(JOptionPane.showInputDialog("Digite o nome do cliente"));
            clienteDTO.setRg(JOptionPane.showInputDialog("Digite o RG do cliente"));
            clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente")));
            
            JOptionPane.showMessageDialog(null,clienteCTR.mostrarNomeRg(clienteDTO));
            JOptionPane.showMessageDialog(null,clienteCTR.mostrarNomeIdade(clienteDTO));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro : " + e.getMessage());
        }finally{
            JOptionPane.showMessageDialog(null, "Fim do programa");
        }
    }
}
