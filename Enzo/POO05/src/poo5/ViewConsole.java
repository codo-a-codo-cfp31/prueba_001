/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author @AnalistaSistok 
 */
public class ViewConsole implements IView {
    @Override
    public void draw(String text) {
        System.out.println(text); }

    @Override
    public void clear() {
  } 
 }