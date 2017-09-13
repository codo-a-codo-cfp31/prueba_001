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
public class PrimerEjClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro = new Libro(); //Creamos libro con constructor Libro()
        libro.setAutor("Stephen King"); //asignamos el autor
        libro.setTitulo("IT"); //asignamos el titulo
        System.out.println("Genero = " + libro.getGenero()); //Mostramos titulo.
        
        System.out.println("Autor = " + libro.getAutor()); //Mostramos autor.
        //Solo podemos comunicarnos con el objeto a traves de sus metodos
        
        //Ahora creamos libro2 con el constructor que definimos con titulo y autor
        Libro libro2 = new Libro("Caperuza Roja", "Anonimus");
        
        System.out.println("Autor = " + libro2.getAutor()); //Mostramos autor.
        System.out.println("Titulo = " + libro2.getTitulo()); //Mostramos titulo.
        System.out.println("Cant Paginas = " + libro2.getCantPags());
    }

}
