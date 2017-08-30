/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.*;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Empleado extends Persona{
    protected List<Empleado> listaDeEmpleados;
    protected Integer salario;
    protected Integer ID;
    protected String horarioLaboral;

    public Empleado(Integer salario, Integer ID, String horarioLaboral) {
        this.salario = salario;
        this.ID = ID;
        this.horarioLaboral = horarioLaboral;
        this.listaDeEmpleados = new ArrayList<>();
    }
    
    /// Metodos de Composite
    public void Add(Empleado unEmpleado ){
        listaDeEmpleados.add(unEmpleado);
    }
    
    public void Remove(Empleado unEmpleado){
        listaDeEmpleados.remove(unEmpleado);
    }
    
    public List<Empleado> getListaEmeplados() {
        return listaDeEmpleados;
    }

    @Override
    public String toString() {
        return "ID empleado: " +this.ID+" Lista de subordinados: "+this.listaDeEmpleados;//To change body of generated methods, choose Tools | Templates.
    }
}