/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author CFP31-21
 */
public class ViewConsole implements IView{

    @Override
    public void Draw(String texto) {
        System.out.println(texto);
    }

    @Override
    public void Clear() {
        
    }
    
}
