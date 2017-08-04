/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.*;

/**
 *
 * @author CFP31-21
 */
public class Empleado extends Persona implements IComposite {

    protected List<IComposite> ListaDeEmpleados;
    protected Integer salario;
    protected Integer ID;
    protected Integer horarioLaboral;

    public Empleado(Integer salario, Integer ID, Integer horarioLaboral) {
        this.salario = salario;
        this.ID = ID;
        this.horarioLaboral = horarioLaboral;
        this.ListaDeEmpleados = new ArrayList<>();
    }

    public void Add(IComposite unEmpleado) {
        ListaDeEmpleados.add(unEmpleado);
    }

    public void Remove(IComposite unEmpleado) {
        ListaDeEmpleados.remove(unEmpleado);
    }

    public List GetArray(IComposite unEmpleado) {
        return ListaDeEmpleados;
    }

    public String toString() {
        return "El empleado con el ID " + ID + " gana " + salario + " y trabaja " + horarioLaboral + " y tiene a su cargo a  " + ListaDeEmpleados;
    }
}
