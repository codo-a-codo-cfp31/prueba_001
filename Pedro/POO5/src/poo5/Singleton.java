/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author CFP31-09
 */
public class Singleton {
  private static Singleton datos =null;
  
  private Singleton(){
  }
  
  public static Singleton getinstance(){
        if (datos==null){
            datos=new Singleton();
        }
        return datos;
  }
}
