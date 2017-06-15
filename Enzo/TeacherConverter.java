import java.io.*;

public class TeacherConverter {
public static void imprimirmenu() {
System.out.println("*************************************");
System.out.println(" Seleccione una de las opciones");
System.out.println("*************************************");
System.out.println(" 1- Registrar Usuario");
System.out.println(" 0- Salir del programa");}

public static boolean checklogin(String function_user, String function_password) {
		boolean islogincorrect;
		String password_defined;
		String user_defined;
		user_defined = "Alejandro";
		password_defined = "CodoACodo";
		islogincorrect = (function_user.equals(user_defined) && function_password.equals(password_defined));
                return islogincorrect;}
        
public static void menu(String opcion) throws IOException {
                String nombre;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double count;
		boolean is_correct;
		String password;
		String user;
		count = 0;
                switch (opcion) {
                    case "0":
			System.out.println("Gracias por usar este programa. Saliendo...");
			break;
		case "1":
		do {
			System.out.println("Ingrese usuario");
			user = br.readLine();
			System.out.println("Ingrese contraseña");
			password = br.readLine();
			is_correct = checklogin(user,password);
			count = count+1;
                        if (is_correct) {
			System.out.println("Bienvenido "+user);
                        break;}
			if (count>=3 && !is_correct) {
            System.out.println("Usuario bloquead");}
    if (!is_correct) {
            System.out.println("Usuario y/o contrase�a incorrectos, reintente");}
                } while (is_correct || count<3);
                break;
	default:
      System.out.println("Opcion invalida, presione de vuelta su opcion"); }	
	}
   
	public static void main(String args[]) throws IOException {
    String opcion;
    do {
    imprimirmenu();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    opcion = br.readLine();
    menu(opcion);
    System.out.println("Presione una tecla para continuar...");
    String tecla;
    tecla=br.readLine();
    System.out.println("");
		} while ((opcion)!=("0"));}
}

