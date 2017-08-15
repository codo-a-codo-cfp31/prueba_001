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
    String palabraEscondida;
    
    public Controlador(VistaPrevia vista){
        this.vista=vista;
    
    }
    
    public void Run()
    {
        Palabra unaPalabra=new Palabra();
        
        vista.Ver("La Palabra tiene: " +unaPalabra.Enviar(palabraEscondida)+ " letras");
    
    }
    
  
}
