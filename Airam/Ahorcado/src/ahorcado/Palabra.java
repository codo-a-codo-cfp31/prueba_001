/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

//import javax.swing.JButton;
public class Palabra /*implements ActionListener*/ {

    protected JFrameAhorcado unaVista;

    //private JButton jButton1;
    private List<String> Palabras;
    String PalabraAdivina;
    public static int i;

    public Palabra() {
        unaVista = new JFrameAhorcado();
        unaVista.setVisible(true);
        //jButton1.addActionListener(this);

        ListaDePalabras();

    }

    final public void ListaDePalabras() {
        Palabras = new ArrayList<>();

        Palabras.add("Glaucoma");
        Palabras.add("Arquitecto");
        Palabras.add("Media");
        Palabras.add("Sauna");
        Palabras.add("Ollaiuyt");
        Palabras.add("Pisoiuy");
        Palabras.add("Camaggo");
        Palabras.add("Gorra");
        Palabras.add("Gato");
        Palabras.add("Con");
        Palabras.add("Ga");

    }

    public void PalabraAleatoria() {

        double NumAleatorio = (int) (Math.random() * 10);

        PalabraAdivina = (Palabras.get((int) NumAleatorio));

        String[] LetrasDePalabraAdivina = PalabraAdivina.split("");
        int a = LetrasDePalabraAdivina.length;

        switch (a) {
            case 0: {

                break;
            }
            case 1: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina2.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina3.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina4.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina5.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina6.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);

                break;

            }
            case 2: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina3.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina4.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina5.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina6.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }
            case 3: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina4.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina5.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina6.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }

            case 4: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina5.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina6.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }

            case 5: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina6.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }

            case 6: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina6.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina6.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina7.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }
            case 7: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina6.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina6.setText("?");

                JFrameAhorcado.txtPalabraAdivina7.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina7.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina8.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }
            case 8: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina6.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina6.setText("?");

                JFrameAhorcado.txtPalabraAdivina7.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina7.setText("?");

                JFrameAhorcado.txtPalabraAdivina8.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina8.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina9.setVisible(false);
                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }
            case 9: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina6.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina6.setText("?");

                JFrameAhorcado.txtPalabraAdivina7.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina7.setText("?");

                JFrameAhorcado.txtPalabraAdivina8.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina8.setText("?");

                JFrameAhorcado.txtPalabraAdivina9.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina9.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);

                JFrameAhorcado.txtPalabraAdivina10.setVisible(false);
                break;

            }
            case 10: {
                JFrameAhorcado.txtPalabraAdivina.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina.setText("?");

                JFrameAhorcado.txtPalabraAdivina1.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina1.setText("?");

                JFrameAhorcado.txtPalabraAdivina2.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina2.setText("?");

                JFrameAhorcado.txtPalabraAdivina3.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina3.setText("?");

                JFrameAhorcado.txtPalabraAdivina4.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina4.setText("?");

                JFrameAhorcado.txtPalabraAdivina5.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina5.setText("?");

                JFrameAhorcado.txtPalabraAdivina6.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina6.setText("?");

                JFrameAhorcado.txtPalabraAdivina7.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina7.setText("?");

                JFrameAhorcado.txtPalabraAdivina8.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina8.setText("?");

                JFrameAhorcado.txtPalabraAdivina9.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina9.setText("?");

                JFrameAhorcado.txtPalabraAdivina10.setEnabled(true);
                JFrameAhorcado.txtPalabraAdivina10.setText("?");

                JFrameAhorcado.txtPalabraAdivina11.setEnabled(true);
                break;

            }

        }
    }

}
