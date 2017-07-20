/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @AnalistaSistok 
 */
public class ViewConsole implements IView {
    @Override
    public void Draw(String text) {
        System.out.println(text);
    }

    @Override
    public void Clear() {
  
    } 
}
