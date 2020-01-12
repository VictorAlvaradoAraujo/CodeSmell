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
public class ClientePO {
   
 
    public static void main(String[] args) {
        ClientePO c = new ClientePO();
        c.defaultsToPermissionRequested();
    }
 
    public void defaultsToPermissionRequested() {
        PermisoTwitterPO p = new PermisoTwitterPO();
 
        boolean r =  Estado.SOLICITUD.toString().equals(p.getState());
        System.out.println(r);
    }
 
 
}
