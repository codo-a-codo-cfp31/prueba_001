/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CFP31-15
 */
public class Empleado extends Persona{
    protected List<Empleado> listaDeEmeplados;
    protected Integer salario;
    protected Integer ID;
    protected String horarioLaboral;

    public Empleado(Integer salario, Integer ID, String horarioLaboral) {
        this.salario = salario;
        this.ID = ID;
        this.horarioLaboral = horarioLaboral;
        this.listaDeEmeplados = new ArrayList<>();
    }
    
    
    /// Metodos de Composite
    public void Add(Empleado unEmeplado ){
        listaDeEmeplados.add(unEmeplado);
    }
    
    public void Remove(Empleado unEmeplado){
        listaDeEmeplados.remove(unEmeplado);
    }
    
    public List<Empleado> getListaEmeplados() {
        return listaDeEmeplados;
    }

    @Override
    public String toString() {
        return "ID empleado: " +this.ID + " Lista de subordinados: " + this.listaDeEmeplados; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
