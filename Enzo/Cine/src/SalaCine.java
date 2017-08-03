/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @AnalistaSistok
 */
   public class SalaCine extends CentroComercial{
    protected int nrodesalas;
    protected Butacas susButacas;
    protected CategoriadePelicula suCategoriaDePelicula; 
    
    public SalaCine(String unNombre, String unaDireccion, String unHorario, int SalasDeCine){
        super(unNombre, unaDireccion, unHorario);
        nrodesalas = SalasDeCine;       
        }
    
    public int numeroDeSalas(){
        return nrodesalas;
        }  
    }