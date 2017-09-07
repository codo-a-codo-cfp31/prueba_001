/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerejclases;

/**
 *
 * @author CFP31-15
 */
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int cantPags;

    public Libro() {
        this.setCantPags(0);
    }

    public Libro(String titulo, String autor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setCantPags(0);
    }
    
    
    
    //get para obtener, devolver el valor de cierta variable
    public String getTitulo(){
        //Se utililza this para hacer referencia a la propia clase
        return this.titulo;
    }
    
    public void setTitulo(String tit){
        this.titulo = tit;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantPags() {
        return cantPags;
    }

    public void setCantPags(int cantPags) {
        this.cantPags = cantPags;
    }
    
    
}
