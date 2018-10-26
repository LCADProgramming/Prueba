/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class ControladoraL {

    private List <Usuario> usuarios;
    
/*------------------------------------------------------------------------------
    
------------------------------------------------------------------------------*/
    public boolean inicio(String usuario, String contrasenia){
        boolean inicio = false;
        
        for(Usuario unUsuario : usuarios){
            if(unUsuario.getUsuario().equals(usuario) && unUsuario.getContrasenia().equals(contrasenia)){
                inicio = true;
            }
        }
        
        return inicio;
    }
    
    public boolean altaUsuario(String usuario, String contrasenia){
        boolean alta = true;
        
        try {
            int id = usuarios.size();
            Usuario unUsuario = new Usuario(id, usuario, contrasenia);
            usuarios.add(unUsuario);
        } catch (Exception e) {
            alta = false;
        }
        
        return alta;
    }
    
    public boolean bajaUsuario(int id){
        boolean baja = true;
        
        try {
            usuarios.remove(id);
        } catch (Exception e) {
            baja = false;
        }
        
        return baja;
    }
    
    public boolean modificarUsuario(int id, String usuario, String contrasenia, String nick, String eslogan, List <Chat> chats){
        boolean modificar = true;
        
        try {
            Usuario unUsuario = usuarios.get(id);
            
            unUsuario.setContrasenia(contrasenia);
            unUsuario.setNick(nick);
            unUsuario.setEslogan(eslogan);
            unUsuario.setChats(chats);
            
            usuarios.set(id, unUsuario);
        } catch (Exception e) {
            modificar = false;
        }
        
        return modificar;
    }
    
    public Usuario obtenerUsuario(int id){
        return usuarios.get(id);
    }
    
    public List<Usuario> obtenerUsuarios(){
        return usuarios;
    }
    
}
