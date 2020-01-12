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
public class PermisoTwitter {
    private String estado;
    private boolean granted;
    public final static String PEDIDO = "PEDIDO";
    public final static String RECLAMADO = "RECLAMADO";
 
    public PermisoTwitter() {
        estado = PEDIDO;
        granted = false;
    }
 
    public void claimed() {
        if (estado.equals(PEDIDO))
            estado = RECLAMADO;
    }
 
    public String getState() {
        return estado;
    }
}
