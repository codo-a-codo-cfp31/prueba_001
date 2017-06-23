//Este sera nuestro archivo prinipal 

//Manejo de datos java 
//POO, Contructor, Super, new

//Los demas seran objetos que creamos para darles los atos que necesitamos 
package poo;

//Se debe tener en cuenta de indicar el paquete de donde va a Importar la informacion que solicitemos "Import"
import poo.objetos.Persona;
import poo.objetos.Carpintero;
import poo.objetos.Futbolista;


public class POO {

    public static void main(String[] args) {
        
        
        
        
        //PERSONA//////////////
        
        //Ropa de persona
        Persona unaPersona = new Persona("Talle: XL ","Color: ROJO ","Tipo: JEAN ");
        
        //------------------------------------------------
        unaPersona.ahoraTeLlamas("Pirulo");
        unaPersona.tuApellido("Galvan");
        unaPersona.tuEdad (29);
        unaPersona.tuDni (123456);
        
        System.out.println("Datos de PERSONA");
        System.out.println("Tu nombre es: " + unaPersona.comoTeLlamas());
        System.out.println("Tu apellido es: " + unaPersona.cualEsTuApellido());
        System.out.println("Tu edad es: " + unaPersona.cualEsTuEdad());
        System.out.println("Tu DNI es: " + unaPersona.cualEsTuDni());
        
        System.out.println("-------------------------------------------");
        
        
        //CARPINTERO//////////////
        
        
        
        //------------------------------------------------
        Carpintero unCarpintero = new Carpintero();
        
        unCarpintero.ahoraTeLlamas("Pedro el carpintero");
        unCarpintero.tuApellido("Gonzalez");
        unCarpintero.tuEdad (45);
        unCarpintero.tuDni (0234567);
        
        System.out.println("Datos de CARPINTERO");
        System.out.println("Tu nombre es: " + unCarpintero.comoTeLlamas());
        System.out.println("Tu apellido es: " + unCarpintero.cualEsTuApellido());
        System.out.println("Tu edad es: " + unCarpintero.cualEsTuEdad());
        System.out.println("Tu DNI es: " + unCarpintero.cualEsTuDni());
        System.out.println("-------------------------------------------");
        
        
        //FUTBOLISTA//////////////
        
        
        
        //------------------------------------------------
        Futbolista unFutbolista = new Futbolista();
        
        unFutbolista.ahoraTeLlamas("Juan el futbolista");
        unCarpintero.tuApellido("Perez");
        unCarpintero.tuEdad (39);
        unCarpintero.tuDni (022235);
        
        System.out.println("Datos de FUTBOLISTA");
        System.out.println("Tu nombre es: " + unFutbolista.comoTeLlamas());
        System.out.println("Tu apellido es: " + unFutbolista.cualEsTuApellido());
        System.out.println("Tu edad es: " + unFutbolista.cualEsTuEdad());
        System.out.println("Tu DNI es: " + unFutbolista.cualEsTuDni());
        System.out.println("-------------------------------------------");
    }
    
}
