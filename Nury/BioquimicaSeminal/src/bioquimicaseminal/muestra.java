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
public class muestra {

    protected String numProtocolo;
    protected int fructosa;
    protected Double factorFructosa;
    protected int acCitrico;
    protected Double factorAcCitrico;
    protected int alfa;
    protected Double factorAlfa;
    protected Double volumen;

    public muestra() {

        numProtocolo = "";
        fructosa = 0;
        factorFructosa=0.0;
        acCitrico = 0;
        factorAcCitrico=0.0;
        alfa = 0;
        factorAlfa=0.0;
        volumen=0.0;
    }

    public void setnumero(String newNumProtocolo) {
        numProtocolo = newNumProtocolo;
    }

    public String getNumero() {
        return numProtocolo;
    }

    public void setVolumen(Double newVolumen) {
        volumen = newVolumen;
    }

    public Double getVolumen() {
        return volumen;
    }
    
    public void setFactorFructosa(Double newFactor){
        
    }
    
    
    
    public void setFuctosa(int newAbs) {
        fructosa = newAbs;
    }

    public int getFructosa() {
        int fructosaResult = 0;
        float factorFructosa = 0.58f;
        fructosaResult = (int)(fructosa * factorFructosa);
        return fructosaResult;
    }

    public void setAcCitrico(int newAbs) {
        acCitrico = newAbs;
    }

    public int getAcCitrico() {
        int acCitricoResult = 0;
        float factorAcCitrico = 1.4f;
        acCitricoResult = (int) (acCitrico * factorAcCitrico);
        return acCitricoResult;
    }

    public void setAlfa(int newAbs) {
        alfa = newAbs;
    }

    public int getAlfa() {
        int alfaResult = 0;
        float factorAlfa = 0.82f;
        alfaResult = (int) (alfa * factorAlfa * volumen);
        return alfaResult;
    }
}
