/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visual;

/**
 *
 * @author Usuario
 */
public class ControladoraV {
    private final Logica.ControladoraL unaControladora = new Logica.ControladoraL();
    
    public boolean inicio(String usuario, String contrasenia){
        return unaControladora.inicio(usuario, contrasenia);
    }
}
