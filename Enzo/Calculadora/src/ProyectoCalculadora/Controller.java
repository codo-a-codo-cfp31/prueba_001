/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoCalculadora;

import Calculadoras.CalculadoraFactory;
import Calculadoras.ICalculadora;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.*;
/**
 *
 * @author CFP31-15
 */
public class Controller implements IViewEventListener {

    protected MasterView main_view;
    protected ICalculadora calculadora;

    public Controller() {
        main_view = new MasterView();
        main_view.setVisible(true);
        main_view.getjPanel2().setVisible(false);
        main_view.AddViewEvenListener(this);

        ConversorListModel model1 = new ConversorListModel(CalculadoraFactory.getListaCalculadoras());
        main_view.getjComboBox3().setModel(model1);
        
        calculadora = CalculadoraFactory.crearCalculadora("Simple");
        main_view.getjPanel2().setVisible(false);
 }

    public void Run() {
  }

    @Override
    public void Listen(Event event) {
        //diferencio los eventos que me llegan que sean del teclado o de la vista
        String EventType = event.target.getClass().getCanonicalName();
        String tecla = "";
        if (EventType.equalsIgnoreCase("java.awt.event.ActionEvent")) {
            ActionEvent ae = (ActionEvent) event.target;
            tecla = ae.getActionCommand();

        } else if (EventType.equalsIgnoreCase("java.awt.event.KeyEvent")) {
            KeyEvent ke = (KeyEvent) event.target;
            tecla = "" + ke.getKeyChar();
        } else {
 String tipo = (String) main_view.getjComboBox3().getModel().getSelectedItem();
if (tipo.equalsIgnoreCase("Simple")) {
                calculadora = CalculadoraFactory.crearCalculadora("Simple");
                main_view.getjPanel2().setVisible(false);
            }
            if (tipo.equals("Cientifica")) {
                calculadora = CalculadoraFactory.crearCalculadora("Cientifica");
                main_view.getjPanel2().setVisible(true);
            }
 }

        //verifica si esta la regular exprecion, en este caso si hay digitos
        if (tecla.matches("\\d")) {
            if (calculadora.getOp().equalsIgnoreCase("=")) {
                main_view.getjTextField1().setText("");
                main_view.getjTextField2().setText("");
                String elemento = main_view.getjTextField1().getText();
                calculadora.BinaryOperation(0, "x", 0);
            } else {

                String elemento = main_view.getjTextField1().getText();
                if (elemento.length() < 12) {
                    elemento = elemento + tecla;
                }
                main_view.getjTextField1().setText(elemento);

            }

            //System.out.println("es numero");
        } else {

            if (tecla.equalsIgnoreCase(".")) {
                String elemento = main_view.getjTextField1().getText();
                if (!elemento.contains(".")) {
                    elemento = elemento + tecla;
                }

                main_view.getjTextField1().setText(elemento);
            }

            if (tecla.equals("C")) {
                main_view.getjTextField1().setText("");
                main_view.getjTextField2().setText("");
                calculadora.setA(0);
                calculadora.setB(0);
                calculadora.setOp("");
                calculadora.BinaryOperation(0, "x", 0);
            }

            if (tecla.equals("CE")) {
                String elemento = main_view.getjTextField1().getText();
                int longitud = elemento.length();

                int limiteLong = Math.max(0, longitud - 1);
                elemento = elemento.substring(0, limiteLong);
  /* if (! elemento.equals("")) {
                    calculadora.setA((float) Double.parseDouble(elemento));
                    //acá obtengo el operador que esta en uso y lo guardo en una variable 
                    String tempOperator = calculadora.getOp();
                    //aca fijo el operador suma para obtener el resultado
                    calculadora.BinaryOperation((float) Double.parseDouble(elemento), "+", 0.f);
                    // aca vuelco a setear el operador que estoy utilizando en realidad (y no es +)
                    calculadora.setOp(tempOperator);
                    /*aca sumo el valor de elemento mas cero que me queda el valor intacto
                    y elemento va a ser lo que sea que este en la pantalla.
                 */
 /*}*/
                main_view.getjTextField1().setText(elemento);
            }
           
            if (tecla.equals("+")) {
calculadora.setOp("+");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
} else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
 String Operacion = calculadora.getA() + calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
main_view.getjTextField1().setText("");
}

            if (tecla.equals("-")) {
 calculadora.setOp("-");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
 calculadora.setA((float) Double.parseDouble(elemento));
} else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
String Operacion = calculadora.getA() + calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
main_view.getjTextField1().setText("");
}

            if (tecla.equals("x")) {
 calculadora.setOp("x");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
 calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
 }
 String Operacion = calculadora.getA() + calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
 main_view.getjTextField1().setText("");
 }

            if (tecla.equals("/")) {
calculadora.setOp("/");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
 calculadora.setA((float) Double.parseDouble(elemento));
} else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
String Operacion = calculadora.getA() + calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
  }

            if (tecla.equals("tan")) {
                calculadora.setOp("tan");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));

                }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
            if (tecla.equals("tan-1")) {
                calculadora.setOp("tan-1");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));

                }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
            if (tecla.equals("cos")) {
                calculadora.setOp("cos");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
 calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
 }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
}

             if (tecla.equals("cos-1")) {
                calculadora.setOp("cos-1");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
 calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
 }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
}
            
            if (tecla.equals("sin")) {
 calculadora.setOp("sin");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
  calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
 }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
}

            if (tecla.equals("sin-1")) {
 calculadora.setOp("sin-1");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
  calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
 }
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
}
          
            if (tecla.equals("log")) {
 calculadora.setOp("log");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }

            if (tecla.equals("10^x")) {
 calculadora.setOp("10^x");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
            if (tecla.equals("ln")) {
calculadora.setOp("ln");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
            if (tecla.equals("e^x")) {
calculadora.setOp("e^x");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
            if (tecla.equals("x!")) {
calculadora.setOp("x!");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
  } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp() + "(" + calculadora.getA() + ")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
             if (tecla.equals("^")) {
  calculadora.setOp("^");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getA() + calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
            
             if (tecla.equals("y√x")) {
  calculadora.setOp("y√x");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getA()+calculadora.getOp();
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
             
              if (tecla.equals("√")) {
  calculadora.setOp("√");
                if (calculadora.getA() == 0) {
                    String elemento = main_view.getjTextField1().getText();
calculadora.setA((float) Double.parseDouble(elemento));
 } else {
                    calculadora.setA((float) Double.parseDouble(calculadora.getResultString()));
}
                String Operacion = calculadora.getOp()+"("+calculadora.getA()+")";
                main_view.getjTextField2().setText(Operacion);
                main_view.getjTextField1().setText("");
            }
             
       if (tecla.equals("inv")) {
     main_view.getjButton19().setText("sin-1");
       main_view.getjButton20().setText("cos-1");
       main_view.getjButton21().setText("tan-1");
        main_view.getjButton23().setText("e^x");
          main_view.getjButton22().setText("10^x");
          main_view.getjButton24().setText("x²");
          main_view.getjButton25().setText("y√x");
          main_view.getjButton28().setText("Inv");
    }
    
    if (tecla.equals("Inv")) {
     main_view.getjButton19().setText("sin");
       main_view.getjButton20().setText("cos");
       main_view.getjButton21().setText("tan");
        main_view.getjButton23().setText("ln");
          main_view.getjButton22().setText("log");
          main_view.getjButton24().setText("√");
          main_view.getjButton25().setText("^");
          main_view.getjButton28().setText("inv");
    }
       
            if (tecla.equals("=")) {
 if (calculadora.getOp().equalsIgnoreCase("+") || calculadora.getOp().equalsIgnoreCase("-") || calculadora.getOp().equalsIgnoreCase("x") || calculadora.getOp().equalsIgnoreCase("/")|| calculadora.getOp().equalsIgnoreCase("^")|| calculadora.getOp().equalsIgnoreCase("y√x")) {
                    String elemento = main_view.getjTextField1().getText();
                    calculadora.setB((float) Double.parseDouble(elemento));

                    String Operacion = calculadora.getA() + calculadora.getOp() + calculadora.getB() + "=";
                    main_view.getjTextField2().setText(Operacion);

                    calculadora.BinaryOperation(calculadora.getA(), calculadora.getOp(), calculadora.getB());
                    main_view.getjTextField1().setText(calculadora.getResultString());
                } else {
                    calculadora.UnaryOperation(calculadora.getA(), calculadora.getOp());
                    main_view.getjTextField1().setText(calculadora.getResultString());
                }
                calculadora.setOp("=");
            }
        }
    }
}