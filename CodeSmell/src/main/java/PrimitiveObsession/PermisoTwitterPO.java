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
public class PermisoTwitterPO {
    private boolean granted;
 
    private Estado permission;
 
    public PermisoTwitterPO() {
        setState(permission.SOLICITUD);
        granted = false;
    }
 
    public void claimed() {
        if (getState().equals(permission.SOLICITUD))
            setState(Estado.RECLAMAR);
 
    }
 
    public String getState() {
        return permission.toString();
    }
 
    private void setState(Estado permission) {
        this.permission = permission;
        }
}
