/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimitiveObsession;

/**
 *
 * @author User
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente();
        c.defaultsToPermissionRequested();
    }
 
    public void defaultsToPermissionRequested() {
        PermisoTwitter permiso = new PermisoTwitter();
        boolean resultado = permiso.getState().equals("Aceptado");
        System.out.println(resultado);
        resultado = permiso.getState().equals("Aceptado");
        System.out.println(resultado);
    }
    
    
}
