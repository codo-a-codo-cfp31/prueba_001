/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @AnalistaSistok #CFP31 #SEduca */
public class CentroComercial {
    protected String nombre;
    protected String direccion;
    protected String horario;
    protected SalaCine susSalasDeCine;
    
    public CentroComercial (String unNombre, String unaDireccion, String unHorario){
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