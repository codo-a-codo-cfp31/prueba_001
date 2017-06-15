import java.io.*;
public class Credenciales {
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double pass1;
		double pass2;
		String user1;
		String user2;
		System.out.println("PROGRAMA PARA VALIDAR CREDENCIALES");
                
		user1 = "Codo";
                user2="";
		pass1 = 1234;
		pass2 = 0;
		while (!user1.equals(user2)|pass1!=pass2) {
    System.out.println("");
    System.out.println("Ingrese NOMBRE DE USUARIO (en letras minusculas):");
    user2 = bufEntrada.readLine();
    System.out.println("Ingrese CONTRASEÑA (en numero):");
    pass2 = Double.parseDouble(bufEntrada.readLine());
    if (user1.equals(user2) && pass1==pass2) {
            System.out.println("CREDENCIALES CORRECTAS. BIENVENIDO");
    } else {
            System.out.println("ERROR EN CREDENCIALES. FALLA EN INGRESO");}
		}
	}
}