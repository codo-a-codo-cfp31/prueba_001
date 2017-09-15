/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cfp31-06
 */
public class ConversorKg implements IConversor {

    protected String UnidadDePesoEntrada;
    protected float Valor;

    public ConversorKg() {

        UnidadDePesoEntrada = "";

    }

    public void setValor(float ValorPeso, String unidad) {
        this.Valor = ValorPeso;
        this.UnidadDePesoEntrada = unidad;

    }

    public float getValor(String unidad) {

        if (UnidadDePesoEntrada.equalsIgnoreCase("Lb")) {
            Valor = Valor * 2.2046f;
        } else {
            Valor = Valor;

            if (UnidadDePesoEntrada.equalsIgnoreCase("Kg")) {
                Valor = Valor / 2.2046f;
            } else {
                Valor = Valor;
            }
        }
        return Valor;

    }

    public List<String> getUnitList() {
        List<String> lista = new ArrayList<>();
        lista.add("L");
        lista.add("Kg");
        return lista;
    }

}
