/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Alex3D
 */
public class saddsd {

    /**
     * @param args the command line arguments
     */
    final static int AGOTADO = 0;
    final static int SIN_MONEDA = 1;
    final static int CON_MONEDA = 2;
    final static int VENDIDO = 3;
    
    static int estado = SIN_MONEDA;
    static int cantidadDeChicles = 10;
    static int cantidadDeMonedas = 0;
    static int ganancia = 0;
    
    public static void main(String[] args) {
       /*
        * Aca pueden llamar a las funciones que programaron, para probarlas, como por ejemplo:
        * insertarMoneda();
        * pueden x ej. llamar 6 veces a insertarMoneda() 
        * para ver que NO deja agregar mas de 5 monedas.
        */
        
        insertarMoneda();
        girarManivela();
        
        //test1();
       // test2();
        //test3();
       // test4();
        
    }
    

    public static void insertarMoneda() {
      
      if(estado == SIN_MONEDA)  {
          estado = CON_MONEDA;
          cantidadDeMonedas++;
          System.out.println("Ingreso una moneda");
      }
      else if(estado == CON_MONEDA) {
            if(cantidadDeMonedas < 5) {
            cantidadDeMonedas++;
            System.out.println("Ingreso otra moneda");
          }
            else
                System.out.println("No puede ingresar mas de 5 monedas!");
          
      }
      else if(estado == AGOTADO) {
          System.out.println("No hay mas chicles");
          eyectarMoneda(cantidadDeMonedas);
      }
      else if(estado == VENDIDO) {
          System.out.println("Espere a que termine de salir el chicle.");
          eyectarMoneda(cantidadDeMonedas);
      }
        
    }
    
    public static void girarManivela() {
        if(estado == SIN_MONEDA) {
          System.out.println("No ha ingresado moneda aun");
      }
      else if(estado == CON_MONEDA) {
            if(cantidadDeChicles < cantidadDeMonedas) {
            System.out.println("No hay chicles suficientes");
          }
            else {
                estado = VENDIDO;
                dispensar(cantidadDeMonedas);
                System.out.println("Sus chicles estan saliendo");
            }
      }
      else if(estado == AGOTADO) {
          System.out.println("No hay mas chicles");
      }
      else if(estado == VENDIDO) {
          System.out.println("Espere a que termine de salir el chicle.");
      }
    }
    
    //NOTAR QUE ESTAS 2 FUNCIONES RECIBEN COMO ARGUMENTO UN INT.
    //cantidad es la cantidad de chicles a dispensar, o la cantidad de chicles a agregar.
    //si los marea pueden ver el ejemplo que hicimos de insertarMoneda, como se utiliza
    //la funcion eyectarMoneda.

    public static void dispensar(int cantidad) {
        if(estado == VENDIDO) {
            ganancia = ganancia + cantidad;
            cantidadDeChicles= cantidadDeChicles - cantidad;
            cantidadDeMonedas =0;
            System.out.println("Aqui estan sus chicles :D");
            if(cantidadDeChicles ==0)
                estado = AGOTADO;
            else
                estado = SIN_MONEDA;
        }
        else
            System.out.println("No se puede dispensar");
    }
    
   


 public static void agregarChicles(int cantidad) {
        //tomi y diego
        cantidadDeChicles += cantidad;
        if (estado == AGOTADO && cantidadDeChicles>0) {
            estado = SIN_MONEDA;
        }

    }











        
    static void test_agregarChicles() {
        
        cantidadDeChicles = 0;
        estado = AGOTADO;
        int c = cantidadDeChicles;
        int agregar = 5;

        insertarMoneda();
        girarManivela();

        agregarChicles(agregar);
        
        if (cantidadDeChicles != c + agregar) {
            System.out.println("Error al agregar chicles!");
        } else {
            System.out.println("Chicles ingresados con exito (" + agregar + ").");
        }
        if (estado == AGOTADO) {
            System.out.println("Error al cambiar el estado!");
        }
}




    
    public static void eyectarMoneda(int cantidad) {
        //las chicas
        if(estado==CON_MONEDA){
            estado=SIN_MONEDA;
            cantidadDeMonedas=cantidadDeMonedas-cantidad;
            System.out.println("Retire sus  " + cantidad + " monedas");
        } 
  

    }


   public static void IncrementarGanancias(int cantidad) {
        //Ramiro
ganancia=ganancia+cantidad; 
    }

  

 static void test1() {
        int c, m, g;
       //variables de test
        c= cantidadDeChicles;
        m= cantidadDeMonedas;
        g = ganancia;
        /* en el main se ejecutan las funciones 
        insertarMoneda();
        girarManivela();
*/

        girarManivela();
        if(cantidadDeChicles != c) {
            System.err.println("Error en girar Manivela! test");
        } else { 
	System.out.println("Päso Test1 Prueba de GirarManivela ");
        }
        
        insertarMoneda();
        if(cantidadDeMonedas != m+1)
        {    System.err.println("Error en ingresar moneda! test1");
        } else {
System.out.println("Paso el  test insertarMoneda test1 incremento la cantidad de monedas en 1");
}
       
girarManivela();
        if(cantidadDeMonedas != m)
            { System.err.println("Error en girar Manivela!! test1 cant_monedas no se restó en función de la cantidad de chicles pedidos");
            } else {
System.out.println("Paso el  test girarManivela 2 test1 decremento las monedas porque ya salieron los chicles");
}
       

        if(cantidadDeChicles != c-1){
            System.err.println("Error en girar Manivela!!! test1 no descontó la cant chicles");
         } else {
System.out.println("Paso el  test  girar Manivela!!! ttest1 - decrementó la cantidad de chicles del stock ");
}
       

        if(ganancia != g+1)
     {       System.err.println("Error en al calcular ganancia!!! test1");
          } else {
System.out.println("Paso el  test  girar Manivela!!!  test1 - incrementó la ganancia");
}
       

}
    
    static void test2() {
        int n = cantidadDeChicles;
        
        dispensar(3);
        if(cantidadDeChicles != n)
            System.err.println("Error en dispensar test2");
        insertarMoneda();
        dispensar(1);
         if(cantidadDeChicles != n)
            System.err.println("Error en dispensar test2");
        girarManivela();
    }

    static void test3() {
        int c = cantidadDeChicles;
        int m = cantidadDeMonedas;
        int g = ganancia;
        
        agregarChicles(6);
        if(cantidadDeChicles != c + 6)
            System.err.println("Error en agregar chicles test3");
        
        for(int i = 0; i< 6; i++) 
            insertarMoneda();
        
        if(cantidadDeMonedas != m+5) 
            System.err.println("Error en insertar moneda test3");
        
        girarManivela();
        
        if(cantidadDeChicles != c + 1) 
            System.err.println("Error en girar Manivela test3");
        
        if(cantidadDeMonedas != m) 
            System.err.println("Error en girar Manivelas! test3");
        
        if(ganancia != g+5)
            System.err.println("Error en al calcular ganancia!!! test3");
        
    }
    
    static void test4() {
        insertarMoneda();
        insertarMoneda();
        girarManivela();
        eyectarMoneda(cantidadDeMonedas);
        insertarMoneda();
        dispensar(cantidadDeChicles);
        girarManivela();
        agregarChicles(5);
        girarManivela();
    }
    
static void testganancia() {
 int  g =ganancia+10 ;        
         System.out.println(" la ganancia es "+ ganancia );  
        insertarMoneda();
        insertarMoneda();
        System.out.println( ganancia  );
        girarManivela();
        System.out.println( ganancia  ) ;
        insertarMoneda();

  System.out.println(" la ganancia es "+ ganancia  );
        System.out.println(" la ganancia es " +(ganancia));
         System.out.println(" la ganancia con 10 + " +(ganancia + g)   );
}


}


