/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine;

/**
 *
 * @author Luis Vera
 */
public class Centro_Comercial {
    
    protected String nombre;
    protected String direccion;
    protected String horario;
    protected SalaCine susSalasDeCine;
    
    public Centro_Comercial (String unNombre, String unaDireccion, String unHorario){
            nombre = unNombre;
            direccion = unaDireccion;
            horario = unHorario;
}   
    public String nombreDeCentroComercial(){
        return nombre;
}   
    public String direccionDeCentroComercial(){
        return direccion;
}
    public String horarioDeCentroComercial(){
        return horario;
    }
}
