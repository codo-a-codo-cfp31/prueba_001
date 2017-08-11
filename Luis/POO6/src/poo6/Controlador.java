/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

/**
 *
 * @author CFP31-15
 */
public class Controlador {

    protected Vista unaVista;

    public Controlador(Vista unaVista) {
        this.unaVista = unaVista;
    }

    public void Run() {
        Empleado gerente = new Empleado(10000, 1, "Lun-Jue");
        Empleado subgerente = new Empleado(9000, 3, "Lun-Vie");

        gerente.Add(subgerente);

        System.out.println(gerente);
    }
}
