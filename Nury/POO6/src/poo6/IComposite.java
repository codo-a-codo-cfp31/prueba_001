/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.List;

/**
 * Asi se implementa una interface para composite en caso de que quieras usarlo como interface.
 *
 * @author CFP31-21
 * @param <Type>
 */
public interface IComposite <Type extends IComposite> {
    
    public void Add(Type objetoParaAgregar);
    
    public void Remove(Type objetoParaEliminar);
    
    public List<Type> GetArray(Type ObjetoParaLista);
}
