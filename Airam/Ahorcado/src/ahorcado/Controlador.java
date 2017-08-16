/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import static ahorcado.Palabra.EscondePalabraAdivina;



/**
 *
 * @author AIRAM
 */
public class Controlador {
    
    
    //protected VistaPrevia vista;
    
    protected JFrameAhorcado unaVista;
    protected String LetraAdivina;
    
    
   /* public Controlador(VistaPrevia vista){
        this.vista=vista;
    
    }*/
     public Controlador(){
        unaVista= new JFrameAhorcado();
        unaVista.setVisible(true);
    }
    
    public void Run()
    {
        Palabra unaPalabra=new Palabra();
        
        unaPalabra.PalabraAleatoria();
            
        JFrameAhorcado.txtPalabraAdivina.setText(EscondePalabraAdivina);
        LetraAdivina = JFrameAhorcado.txtLetraAdivina.getText();
              
        
        
        //vista.Ver("La Palabra tiene: " +unaPalabra.Enviar()+ " letras");
        //unaPalabra.Enviar();
    
    }
    
  
}
