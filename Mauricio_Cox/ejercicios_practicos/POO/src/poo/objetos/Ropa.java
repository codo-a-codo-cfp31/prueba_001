
package poo.objetos;

public class Ropa {
    protected String talle;
    protected String color;
    protected String tipo;
    
    public Ropa () {
     
        talle = "XL";
        color = "AZUL";
        tipo = "deortiva";
}
    
    //Constructor - constructor
    public Ropa (String talleRopa, String colorRopa, String tipoRopa){
        
        talle = talleRopa;
        color = colorRopa;
        tipo = tipoRopa;
        
    }
    
}
