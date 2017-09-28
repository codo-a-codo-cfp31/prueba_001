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
public class ConversorTemperatura implements IConversor {

    protected String UnidadDeTemperaturaEntrada;
    protected float Valor;

    public ConversorTemperatura() {

        UnidadDeTemperaturaEntrada = "";

    }

    public void setValor(float ValorTemperatura, String unidad) {
        this.Valor = ValorTemperatura;
        this.UnidadDeTemperaturaEntrada = unidad;

    }

    public float getValor(String unidad) {

        if (UnidadDeTemperaturaEntrada.equalsIgnoreCase("F")) {
            Valor = Valor * 1.8f + 32;
        } else {
            Valor = Valor;

            if (UnidadDeTemperaturaEntrada.equalsIgnoreCase("C")) {
                Valor = (Valor - 32) / 1.8f;
            } else {
                Valor = Valor;
            }
        }
        return Valor;
    }

    public List<String> getUnitList() {
        List<String> lista = new ArrayList<>();
        lista.add("C");
        lista.add("F");
        return lista;
    }

}
