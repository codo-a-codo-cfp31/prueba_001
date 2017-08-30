/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

/*import javax.swing.JOptionPane;
import javax.swing.JTextField;*/

/**
 *
 * @author AIRAM
 */
public class Juego {

    int oportunidades;
    String letra;
   
   

    public Juego() {

    }

    public void Compara() {

        Palabra unaPalabra = new Palabra();

        unaPalabra.PalabraAleatoria();

        letra = JFrameAhorcado.txtPalabraAdivina11.getText();
        oportunidades = 0;

        for (int x = 0; x < a; x++) {
            if (LetrasDePalabraAdivina[x].equals(letra)) {
                JOptionPane.showInputDialog(null, "Letra Valida");
                oportunidades=0;
            }

        }

    }

}
