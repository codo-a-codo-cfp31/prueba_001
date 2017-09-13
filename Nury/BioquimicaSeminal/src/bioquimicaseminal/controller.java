/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bioquimicaseminal;

/**
 *
 * @author CFP31-10
 */
public class controller {

    protected muestra unaMuestra;

    public controller(){
        unaMuestra= new muestra();
    }
    
    public void Run(){
        
        unaMuestra.setnumero("A234");
        unaMuestra.setVolumen(1.3);
        unaMuestra.setFuctosa(453);
        unaMuestra.setAcCitrico(345);
        unaMuestra.setAlfa(654);
        
        
        System.out.println("Numero de protocolo: "+ unaMuestra.getNumero());
        System.out.println("Volumen: "+ unaMuestra.getVolumen());
        System.out.println("Fructosa: "+unaMuestra.getFructosa());
        System.out.println("Acido Citrico: "+ unaMuestra.getAcCitrico());
        System.out.println("Alfaglucosidasa: "+ unaMuestra.getAlfa());



        
    }
}
