/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;



/**
 *
 * @author AIRAM
 */
public class Controlador {
    
    
    protected VistaPrevia vista;
    
    
    public Controlador(VistaPrevia vista){
        this.vista=vista;
    
    }
    
    public void Run()
    {
        Palabra unaPalabra=new Palabra();
        unaPalabra.PalabraAleatoria();
        
        vista.Ver("La Palabra tiene: " +unaPalabra.Enviar()+ " letras");
    
    }
    
  
}
