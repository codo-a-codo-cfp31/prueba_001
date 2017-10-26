/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;

/**
 *
 * @author CFP31-10
 */
public class Controlador {

    protected Juego Juego;
    protected Vista unaVista;

    public Controlador() {
        unaVista = new Vista();
        unaVista.setVisible(true);
        Keyboard teclado = new Keyboard();

        unaVista.getjPanel1().add(teclado);
        Juego = new Juego();

        teclado.AddListener(Juego);

    }

    public void Run() {

        Juego.ComenzarJuego();
        // System.out.println(Juego.ObtenerPalabra().PalabraOculta);
        while (!Juego.TerminoElJuego()) {
            if (Juego.Gano() == true) {
                unaVista.getjTextField1().setText("¡Ganaste! era " + Juego.LaPalabra.PalabraElegida +".");
            } else {
                unaVista.getjTextField1().setText(Juego.toString());
             if (Juego.Vidas==5){
                 unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/a1.jpg")));
             }else if(Juego.Vidas==4){
                 unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/a2.jpg")));
             }else if(Juego.Vidas==3){
                 unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/a3.jpg")));
             }else if(Juego.Vidas==2){
                 unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/a4.jpg")));
             }else if(Juego.Vidas==1){
                 unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/a5.jpg")));
             }
            }
        }
        if (Juego.TerminoElJuego() == true) {
            unaVista.getjTextField1().setText("Perdiste, era " + Juego.LaPalabra.PalabraElegida+ ".");
                             unaVista.getjLabel1().setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo7/final.jpg")));

                    }
    }

}
