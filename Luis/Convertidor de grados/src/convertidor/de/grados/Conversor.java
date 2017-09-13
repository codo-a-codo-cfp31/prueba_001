/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidor.de.grados;

/**
 *
 * @author cfp31-06
 */
public class Conversor {
    
    protected String UnidadDeTemperaturaEntrada;
   
    protected Float ValorDeEntrada;
    protected Float ValorSalida;
    
    public Conversor(){
        
        UnidadDeTemperaturaEntrada="";
        ValorDeEntrada=0f;
        ValorSalida=0f;
     
    }

    public Conversor(String UnidadDeTemperaturaEntrada, Float ValorDeEntrada, Float ValorSalida) {
        this.UnidadDeTemperaturaEntrada = UnidadDeTemperaturaEntrada;
        this.ValorDeEntrada = ValorDeEntrada;
        this.ValorSalida = ValorSalida;
    }
    

    public void setUnidadDeTemperaturaEntrada(String UnidadDeTemperaturaEntrada) {
        this.UnidadDeTemperaturaEntrada = UnidadDeTemperaturaEntrada;
    }

    public void setValorDeEntrada(Float ValorDeEntrada) {
        this.ValorDeEntrada = ValorDeEntrada;
    }

    public void setValorSalida(Float ValorSalida) {
        this.ValorSalida = ValorSalida;
    }

    public Float getValorSalida() {
        return ValorSalida;
    }
    
    public String getUnidadDeTemperaturaEntrada() {
        return UnidadDeTemperaturaEntrada;
    }

    public Float getValorDeEntrada() {
        return ValorDeEntrada;
    }
    
    public void Conversion(){
        
        if (UnidadDeTemperaturaEntrada.equalsIgnoreCase("C")){
            ValorSalida = ValorDeEntrada*1.8f+32;
            }
        
        else{
            ValorSalida = ValorDeEntrada;
        
            
        if (UnidadDeTemperaturaEntrada.equalsIgnoreCase("F"))
            ValorSalida = ValorDeEntrada/1.8f-32;
        
        else{
            ValorSalida = ValorDeEntrada;
        }
        }
        
    }
    
       
}
