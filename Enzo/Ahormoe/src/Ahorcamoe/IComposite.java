package Ahorcamoe;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 * 
 */
/*
*@param <Type>
*/
public interface IComposite <Type extends IComposite> {
    public void Add(Type element);
    public void Remove(Type element);
    public List<Type> getElementList();
}