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
public class Estado {
     private String nombre;
 
 
    public Estado(String n) {
        this.nombre = n;
    }
    public final static Estado SOLICITUD = new Estado("SOLICITADO");
    public final static Estado RECLAMAR = new Estado("RECLAMADO");
 
    @Override
    public String toString() {
        return nombre;
    }
}
