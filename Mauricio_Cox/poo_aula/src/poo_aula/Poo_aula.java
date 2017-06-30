//Crear 
package poo_aula;

public class Poo_aula {
 
    public static void main(String[] args) {
        Aula unAula=new Aula();
        
        Alumno unAlumno=new Alumno();
        unAula.addAlumno(unAlumno);
        
        List<Ipersona> lista=unAula.dameLaListaDePersonas();
        
        for(int i=0; i<lista.size(); i++){
            IPersona unaPersona=lista.get(i);
            
            System.out.println();
        }
        
    }
    
}
