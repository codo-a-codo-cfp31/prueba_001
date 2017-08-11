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
 * @author @AnalistaSistok
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
    public void Add(Empleado unEmpleado ){
        listaDeEmeplados.add(unEmpleado);
    }
    
    public void Remove(Empleado unEmpleado){
        listaDeEmeplados.remove(unEmpleado);
    }
    
    public List<Empleado> getListaEmeplados() {
        return listaDeEmeplados;
    }

    @Override
    public String toString() {
        return "ID empleado: " +this.ID+" Lista de subordinados: " + this.listaDeEmeplados;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
