/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Controller {

    protected Vista unaVista;

    public Controller(Vista unaVista) {
       this.unaVista = unaVista;
    }

    public void Run() {
        Empleado gerente = new Empleado(10000, 1, "Lun-Jue");
        Empleado subgerente = new Empleado(9000, 3, "Lun-Vie");

        gerente.Add(subgerente);

        System.out.println(gerente);
        Math.random();
    }
}