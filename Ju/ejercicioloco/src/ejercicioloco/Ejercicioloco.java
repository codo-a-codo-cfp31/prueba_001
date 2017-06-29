//  ej3:    
/*
dado un numero de dias ingresado por el usuario averiguar cuantos dias meses y años constituye el num ingresado
 */
package ejercicioloco;

import javax.swing.JOptionPane;

/**
 *
 * @author cfp31-06
 */
public class Ejercicioloco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int año = 0;
        int mes = 0;
        int dias = 0;
        String mensaje;

        mensaje = JOptionPane.showInputDialog("Ingrese numero");
        num = Integer.parseInt(mensaje);
        while (num >= 365) {
            num = num - 365;
            año++;
        }
        while (num >= 30) {
            num = num - 30;
            mes++;

            dias = num;
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado suman " + año + " año/os, " + mes + " mes/es, " + dias + " dia/as.", "Respuesta.", JOptionPane.PLAIN_MESSAGE);

    }
    // TODO code application logic here
}
