import java.io.*;
/**
 * @author @AnalistaSistok #SEduca #CFP31
 */
public class TeacherConverter {
/**
* 
*@param  args the command line arguments
*/
public static void imprimirmenu() {
System.out.println("*************************************");
System.out.println(" Seleccione una de las opciones");
System.out.println("*************************************");
System.out.println(" 1- Registra tu Usuario");
System.out.println(" 0- Salir del programa");
System.out.println("*************************************");
System.out.println("*************************************");}

public static boolean checklogin(String function_user, String function_password) {
		boolean islogincorrect;
		String password_defined;
		String user_defined;
		user_defined = "Alejandro";
		password_defined = "CodoACodo";
		islogincorrect = (function_user.equals(user_defined) && function_password.equals(password_defined));
                return islogincorrect;}
        
public static void menu(String opcion) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double count;
		boolean is_correct;
		String password;
		String user;
		count = 0;
                int n;
                n = 3;
                switch (opcion) {
                case "0":
                System.out.println("Gracias por usar este programa. Saliendo...");
                break;
		case "1":
		do {
			System.out.println("Ingrese usuario");
			user = bufEntrada.readLine();
			System.out.println("Ingrese contraseña");
			password = bufEntrada.readLine();
			is_correct = checklogin(user,password);
			count = count+1;
                        if (is_correct) {
			System.out.println("Bienvenido "+user);
                        break;}
			
    if (!is_correct) {
       System.out.println("TIENE "+(n-1)+" INTENTOS");
		n = n-1;
       System.out.println("Usuario y/o contraseña incorrectos");}
    if (count>=3 && !is_correct) {
       System.out.println("Se ha bloqueado el usuario");
    }}while (is_correct || count<3);
                break;
	default:
      System.out.println("Opcion invalida, presione de vuelta su opcion"); }	
	}

public static void main(String args[]) throws IOException {
    int n;
    n=0;
    String opcion;
    do {
    imprimirmenu();
    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    opcion = bufEntrada.readLine();
    menu(opcion);
    System.out.println("Presione una tecla para continuar...");
    String tecla;
    tecla=bufEntrada.readLine();
    System.out.println("");
} while (!(opcion=="0"|| n==0));}
}