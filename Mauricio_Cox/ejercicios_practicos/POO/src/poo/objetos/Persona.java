package poo.objetos;

public class Persona {
     private String nombre;
     private String apellido;
     private int edad;
     private int dni;
     private Ropa suRopa;
    
      
     //Creamos el constructor en persona para la ropa
     public Persona (String talleRopa, String colorRopa, String tipoRopa){
         
        suRopa = new Ropa (talleRopa, colorRopa, tipoRopa);
                   
     }
                      
     
     //Metodos: por cada uno de los datos que vamos a solicitar debemos crear un nuevo metodo para aa uno
    
     //NOMBRE
     public String comoTeLlamas(){
         return nombre;
     }
     public void ahoraTeLlamas(String tuNuevoNombre){
         nombre = tuNuevoNombre;
     }
     
     //APELLIDO
     public String cualEsTuApellido(){
         return apellido;
     }
     public void tuApellido(String nuevoApellido ){
         apellido = nuevoApellido;
     }
     
     //EDAD
     public int cualEsTuEdad(){
         return edad;
     }
     public void tuEdad(int nuevaEdad ){
         edad = nuevaEdad;
     }
     
     //DNI
     public int cualEsTuDni(){
         return dni;
     }
     public void tuDni(int nuevoDni ){
         dni = nuevoDni;
     }
     
     
     
}