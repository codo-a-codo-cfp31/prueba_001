import java.io.*;
import java.util.*;
public class Registro {
    public static void imprimirmenu() {
System.out.println("*************************************");
System.out.println(" Seleccione una de las opciones");
System.out.println("*************************************");
System.out.println(" 1- Registrar Usuario e Correo");
System.out.println(" 0- Salir del programa");}
	
    public static void main(String args[]) throws IOException {
		String opcion_seleccionada;
		do {
               imprimirmenu();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    opcion_seleccionada = br.readLine();
    menu(opcion_seleccionada);
    System.out.println("Presione una tecla para continuar...");
    System.in.read(); // a diferencia del pseudocódigo, espera un Enter, no cualquier tecla
		} while ((opcion_seleccionada)!=("0"));}
public static void confirma_clave() throws IOException {
		String clave;
		String clave2;
		int lon;
	do {
	do {
        lon = 0;
        System.out.println("Ingrese una clave de 8 Caracteres");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        clave = br.readLine();
        lon = clave.length();
        System.out.println("Confirme su clave");
        clave2 = br.readLine();
        if (!clave.equals(clave2)) {
                System.out.println("");
                System.out.println("LAS CLAVES NO COINCIDEN"); }
        if (lon!=8) {
                System.out.println("");
                System.out.println("LONGITUD NO VALIDA");}
			} while (lon!=8);
		} while (!clave.equals(clave2));}

	public static void confirmar_correo() throws IOException {
		String email;
		String email_caract;
		double email_correcto;
		int indice;
		int longitud_email;
		email_correcto = 0;
    do {
    System.out.println("Ingrese un email");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    email = br.readLine();
    longitud_email = email.length();
    for (indice=0;indice<=longitud_email;indice++) {
    email_caract = email.substring(indice-1,indice);//
        if ((email_caract).equals(("@"))) {
        email_correcto = 1;
        indice = longitud_email;
             System.out.println("Email registrado con exito");}
        else {System.out.println("Reingrese su email");}
	}} while (!(email_correcto==1 || indice==longitud_email));}
	
	public static void menu(String opcionseleccionada) throws IOException {
		int lon_name;
                String nombre;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		switch (opcionseleccionada) {
                    
                case "0":
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		case "1":
			do {
         System.out.println("Ingrese su Nombre de Usuario");
          nombre = br.readLine();
         System.out.println("Su nombre de usuario es: "+nombre);
         lon_name = nombre.length();
        if (lon_name<4) {
                System.out.println("");
                System.out.println("LONGITUD de USUARIO ES MENOR 4");
        }} while (lon_name<=4);
    confirma_clave();
    confirmar_correo();
    break;	
    default:
      System.out.println("Opcion invalida, presione de vuelta su opcion"); }
        }}			