/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertidorkg;

/**
 *
 * @author cfp31-06
 */
public class ConversorKg {
    
    protected String UnidadDePesoEntrada;
   
    protected Float ValorDeEntrada;
    protected Float ValorSalida;
    
    public ConversorKg(){
        
        UnidadDePesoEntrada="";
        ValorDeEntrada=0f;
        ValorSalida=0f;
     
    }

    public ConversorKg(String UnidadDePesoEntrada, Float ValorDeEntrada, Float ValorSalida) {
        this.UnidadDePesoEntrada = UnidadDePesoEntrada;
        this.ValorDeEntrada = ValorDeEntrada;
        this.ValorSalida = ValorSalida;
    }
    

    public void setUnidadDeTemperaturaEntrada(String UnidadDePesoEntrada) {
        this.UnidadDePesoEntrada = UnidadDePesoEntrada;
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
    
    public String getUnidadDePesoEntrada() {
        return UnidadDePesoEntrada;
    }

    public Float getValorDeEntrada() {
        return ValorDeEntrada;
    }
    
    public void Conversion(){
        
        if (UnidadDePesoEntrada.equalsIgnoreCase("Kg")){
            ValorSalida = ValorDeEntrada*2.2046f;
            }
        
        else{
            ValorSalida = ValorDeEntrada;
        
            
        if (UnidadDePesoEntrada.equalsIgnoreCase("Lb"))
            ValorSalida = ValorDeEntrada/2.2046f;
        
        else{
            ValorSalida = ValorDeEntrada;
        }
        }
        
    }
    
       
}
