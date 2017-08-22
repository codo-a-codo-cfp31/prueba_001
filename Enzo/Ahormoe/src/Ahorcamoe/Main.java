package Ahorcamoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @AnalistaSistok #SEducA #CFP31
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public String res[];
    private JLabel jLabel;
    
    public Main() {
        initComponents();
        imgs = new ImageIcon[10];
        btns = new JButton[27];
         msgs = new String[20];
         
        //imagenes del joven ahorcado lol
        imgs[0] = new ImageIcon(getClass().getResource("/Ahorcamoe/1.jpg"));
        imgs[1] = new ImageIcon(getClass().getResource("/Ahorcamoe/2.jpg"));
        imgs[2] = new ImageIcon(getClass().getResource("/Ahorcamoe/3.jpg"));
        imgs[3] = new ImageIcon(getClass().getResource("/Ahorcamoe/4.jpg"));
        imgs[4] = new ImageIcon(getClass().getResource("/Ahorcamoe/5.jpg"));
        imgs[5] = new ImageIcon(getClass().getResource("/Ahorcamoe/6.jpg"));
        imgs[6] = new ImageIcon(getClass().getResource("/Ahorcamoe/Logo.jpg"));
        imgs[7] = new ImageIcon(getClass().getResource("/Ahorcamoe/NetBeans.png"));
        imgs[8] = new ImageIcon(getClass().getResource("/Ahorcamoe/codoacodo.png"));
        imgs[9] = new ImageIcon(getClass().getResource("/Ahorcamoe/seduca.png"));
        
        //botones para las letras
        btns[1] = jButton2;
        btns[2] = jButton3;
        btns[3] = jButton4;
        btns[4] = jButton5;
        btns[5] = jButton6;
        btns[6] = jButton7;
        btns[7] = jButton8;
        btns[8] = jButton9;
        btns[9] = jButton10;
        btns[10] = jButton11;
        btns[11] = jButton12;
        btns[12] = jButton13;
        btns[13] = jButton14;
        btns[14] = jButton15;
        btns[15] = jButton16;
        btns[16] = jButton17;
        btns[17] = jButton18;
        btns[18] = jButton19;
        btns[19] = jButton20;
        btns[20] = jButton21;
        btns[21] = jButton22;
        btns[22] = jButton23;
        btns[23] = jButton24;
        btns[24] = jButton25;
        btns[25] = jButton26;
        btns[26] = jButton27;

        //palabras por advinar, para agregar una nueva palabra sera necesario declararla al inicio
        msgs[0] = "Mexico".toUpperCase();
        msgs[1] = "Pumas".toUpperCase();
        msgs[2] = "Universidad".toUpperCase();
        msgs[3] = "Academia".toUpperCase();
        msgs[4] = "Atlas".toUpperCase();
        msgs[5] = "Tigres".toUpperCase();
        msgs[6] = "Veracruz".toUpperCase();
        msgs[7] = "Michoacan".toUpperCase();
        msgs[8] = "Oaxaca".toUpperCase();
        msgs[9] = "Yucatan".toUpperCase();
        msgs[10] = "Monterrey".toUpperCase();
        msgs[11] = "Guerrero".toUpperCase();
        msgs[12] = "Colima".toUpperCase();
        msgs[13] = "Guadalajara".toUpperCase();
        msgs[14] = "Guanajuato".toUpperCase();
        msgs[15] = "Tlaxcala".toUpperCase();
        msgs[16] = "Argentina".toUpperCase();
        msgs[17] = "Alemania".toUpperCase();
        msgs[18] = "Brasil".toUpperCase();
        msgs[19] = "Uruguay".toUpperCase();
        
//se asigna un evento a cada letra para comprobar que exista en la palabra a adivinar
        for (int i = 1; i < 27; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();
    }

    //funcion para comenzar los parametros del juego o iniciar una nueva partida
    public void iniciar() {
        //ERRORES EN 0
        err = 0;
       
        jButton1.setIcon(imgs[0]);
        jLabel1.setIcon(imgs[9]);
       jLabel2.setIcon(imgs[7]);
       jLabel3.setIcon(imgs[6]);
        jLabel4.setIcon(imgs[8]);
         jLabel1.setText("");
         jLabel2.setText("");
          jLabel3.setText("");
        jLabel4.setText("");
        jButton2.setText("Reiniciar");
        jButton3.setText("A");
        jButton4.setText("B");
        jButton5.setText("C");
        jButton6.setText("D");
        jButton7.setText("E");
        jButton8.setText("F");
        jButton9.setText("G");
        jButton10.setText("H");
        jButton11.setText("J");
        jButton12.setText("K");
        jButton13.setText("L");
        jButton14.setText("Ñ");
        jButton15.setText("Q");
        jButton16.setText("W");
        jButton17.setText("E");
        jButton18.setText("R");
        jButton19.setText("T");
        jButton20.setText("Y");
        jButton21.setText("U");
        jButton22.setText("I");
        jButton23.setText("O");
        jButton24.setText("P");
        jButton25.setText("Z");
        jButton26.setText("X");
        jButton27.setText("C");
        jButton28.setText("V");
        jButton29.setText("B");
        jButton30.setText("N");
        jButton31.setText("M");
        jButton32.setText("S");
        
        //para activar las letras del tablero
        for (int i = 1; i < 27; i++) {
            btns[i].setEnabled(true);
        }
        //para generar una palabra aleatoriamente xD
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
        //SEPARA EL MENSAJE POR PALABRAS
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // seran los guiones que van debajo de las letras como una separacion_
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                jTextPane1.setText(jTextPane1.getText() + "_ ");
                res[j++] = "_";
            }
             jTextPane1.setText(jTextPane1.getText() + "\n");
            res[j++] = " ";
        }
    }

    //al presionar una letra, esta se buscara si pertenece a la palabra, de lo contrario la marcara como error 
    public void checarLetra(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra despues de haber sido presionada
        for (int i = 1; i < 27; i++) {
            if (bt == btns[i]) {
                //la tecla es inicializada
                c = Character.toChars(64 + i);
                //busca si la letra esta en la frase
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[0] == msgs[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                    }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    jTextPane1.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                             jTextPane1.setText(jTextPane1.getText() + "\n");
                        } else {
                            jTextPane1.setText(jTextPane1.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes, en caso de que ya no haya letras sera ganador :D
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                        }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    if (gano) {
                        JOptionPane.showMessageDialog(this, "Ganaste :3 Reclama tu premio con Alexis, Pablo o Ghadiel xD!!!");
                        iniciar();
                        return;
                    }
                    //SI LA LETRA NO ESTA EN EL MENSAGE, SE INCREMENTA EL ERROR Y SE CAMBIA LA IMAGEN
                } else {
                    jButton1.setIcon(imgs[++err]);
                    //SI SE LLEGA A LOS 5 ERRORES ENTONCES SE PIERDE EL JUEGO Y SE MANDA EL MENSAGE DE:
                    if (err == 5) {
                        JOptionPane.showMessageDialog(this, "Intenta con otra palabra la respuesta es: \n" + msgs[ran]);
                        iniciar();
                        return;
                    }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton32 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("jButton5");

        jButton6.setText("jButton6");

        jButton8.setText("jButton8");

        jButton9.setText("jButton9");

        jButton10.setText("jButton10");

        jButton11.setText("jButton11");

        jButton12.setText("jButton12");

        jButton13.setText("jButton13");

        jButton14.setText("jButton14");

        jButton15.setText("jButton15");

        jButton16.setText("jButton16");

        jButton17.setText("jButton17");

        jButton18.setText("jButton18");

        jButton19.setText("jButton19");

        jButton20.setText("jButton20");

        jButton21.setText("jButton21");

        jButton22.setText("jButton22");

        jButton23.setText("jButton23");

        jButton24.setText("jButton24");

        jButton25.setText("jButton25");

        jButton26.setText("jButton26");

        jButton27.setText("jButton27");

        jButton28.setText("jButton28");

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel4.setText("jLabel4");

        jScrollPane1.setViewportView(jTextPane1);

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        jButton4.setText("jButton4");

        jButton7.setText("jButton7");

        jButton29.setText("jButton29");

        jButton30.setText("jButton30");

        jButton31.setText("jButton31");

        jButton1.setText("jButton1");
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel3.setText("jLabel3");

        jButton32.setText("jButton32");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jButton5)
                                    .addComponent(jButton6)
                                    .addComponent(jButton12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11)
                                    .addComponent(jButton4)
                                    .addComponent(jButton13)
                                    .addComponent(jButton14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton15)
                                    .addComponent(jButton16)
                                    .addComponent(jButton17)
                                    .addComponent(jButton18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton19)
                                    .addComponent(jButton20)
                                    .addComponent(jButton21)
                                    .addComponent(jButton22))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton26)
                                    .addComponent(jButton25)
                                    .addComponent(jButton24)
                                    .addComponent(jButton23)
                                    .addComponent(jButton31))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27)
                            .addComponent(jButton28)
                            .addComponent(jButton29)
                            .addComponent(jButton30)
                            .addComponent(jButton32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(304, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JTextPane getjTextPane1() {
        return jTextPane1;
    }

    public void setjTextPane1(JTextPane jTextPane1) {
        this.jTextPane1 = jTextPane1;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

     public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }
    
    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton7() {
        return jButton7;
    }

    public void setjButton7(JButton jButton7) {
        this.jButton7 = jButton7;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return jButton9;
    }

    public void setjButton9(JButton jButton9) {
        this.jButton9 = jButton9;
    }
    
    public JButton getjButton10() {
        return jButton10;
    }

    public void setjButton10(JButton jButton10) {
        this.jButton10 = jButton10;
    }

    public JButton getjButton11() {
        return jButton11;
    }

    public void setjButton11(JButton jButton11) {
        this.jButton11 = jButton11;
    }

    public JButton getjButton12() {
        return jButton12;
    }

    public void setjButton12(JButton jButton12) {
        this.jButton12 = jButton12;
    }

    public JButton getjButton13() {
        return jButton13;
    }

    public void setjButton13(JButton jButton13) {
        this.jButton13 = jButton13;
    }

    public JButton getjButton14() {
        return jButton14;
    }

    public void setjButton14(JButton jButton14) {
        this.jButton14 = jButton14;
    }

    public JButton getjButton15() {
        return jButton15;
    }

    public void setjButton15(JButton jButton15) {
        this.jButton15 = jButton15;
    }

    public JButton getjButton16() {
        return jButton16;
    }

    public void setjButton16(JButton jButton16) {
        this.jButton16 = jButton16;
    }

    public JButton getjButton17() {
        return jButton17;
    }

    public void setjButton17(JButton jButton17) {
        this.jButton17 = jButton17;
    }

    public JButton getjButton18() {
        return jButton18;
    }

    public void setjButton18(JButton jButton18) {
        this.jButton18 = jButton18;
    }

    public JButton getjButton19() {
        return jButton19;
    }

    public void setjButton19(JButton jButton19) {
        this.jButton19 = jButton19;
    }

    public JButton getjButton20() {
        return jButton20;
    }

    public void setjButton20(JButton jButton20) {
        this.jButton20 = jButton20;
    }

    public JButton getjButton21() {
        return jButton21;
    }

    public void setjButton21(JButton jButton21) {
        this.jButton21 = jButton21;
    }

    public JButton getjButton22() {
        return jButton22;
    }

    public void setjButton22(JButton jButton22) {
        this.jButton22 = jButton22;
    }

    public JButton getjButton23() {
        return jButton23;
    }

    public void setjButton23(JButton jButton23) {
        this.jButton23 = jButton23;
    }

    public JButton getjButton24() {
        return jButton24;
    }

    public void setjButton24(JButton jButton24) {
        this.jButton24 = jButton24;
    }

    public JButton getjButton25() {
        return jButton25;
    }

    public void setjButton25(JButton jButton25) {
        this.jButton25 = jButton25;
    }

    public JButton getjButton26() {
        return jButton26;
    }

    public void setjButton26(JButton jButton26) {
        this.jButton26 = jButton26;
    }

    public JButton getjButton27() {
        return jButton27;
    }

    public void setjButton27(JButton jButton27) {
        this.jButton27 = jButton27;
    }

    public JButton getjButton28() {
        return jButton28;
    }

    public void setjButton28(JButton jButton28) {
        this.jButton28 = jButton28;
    }

    public JButton getjButton29() {
        return jButton29;
    }

    public void setjButton29(JButton jButton29) {
        this.jButton29 = jButton29;
    }

    public JButton getjButton30() {
        return jButton30;
    }

    public void setjButton30(JButton jButton30) {
        this.jButton30 = jButton30;
    }

    public JButton getjButton31() {
        return jButton31;
    }

    public void setjButton31(JButton jButton31) {
        this.jButton31 = jButton31;
    }

    public JButton getjButton32() {
        return jButton32;
    }

    public void setjButton32(JButton jButton32) {
        this.jButton32 = jButton32;
    }

 public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

   

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables

    Object setjButton1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object getjTextArea1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setjTextPane1(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}