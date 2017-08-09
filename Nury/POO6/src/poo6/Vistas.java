/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.List;

/**
 *
 * @author CFP31-21
 */
public class Vistas implements IComposite<Vistas>{
    protected List<Vistas> Lista;
    
    public Vistas(){ 
        vistaSwing = new VistaPrincipal();
        vistaSwing.getjTextField1().setText("Hola");
        vistaSwing.setVisible(true);
    }
    
    protected VistaPrincipal vistaSwing;

    @Override
    public void Add(Vistas objetoParaAgregar) {
    }

    @Override
    public void Remove(Vistas objetoParaEliminar) {
    }

    @Override
    public List GetArray(Vistas ObjetoParaLista) {
        return Lista ;
    }
    
}
