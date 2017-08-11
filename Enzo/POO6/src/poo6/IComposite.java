/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

import java.util.List;

/**
 *
 * @author @AnalistaSistok
 * @param <Type>
 */
public interface IComposite <Type extends IComposite> {
    public void Add(Type element);
    public void Remove(Type element);
    public List<Type> getElementList();
}
