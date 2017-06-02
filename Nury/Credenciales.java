/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo deber�a llamarse "CREDENCIALES.java."
        
import java.io.*;

public class Credenciales {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double n;
		double pass1;
		double pass2;
		String user1;
		String user2;
		System.out.println("PROGRAMA PARA VALIDAR CREDENCIALES");
		user1 = "codo";
		pass1 = 1234;
		n = 3;
		while (n!=0) {
			System.out.println("");
			System.out.println("Ingrese NOMBRE DE USUARIO (en letras minusculas):");
			user2 = bufEntrada.readLine();
			System.out.println("Ingrese CONTRASE�A (en numero):");
			pass2 = Double.parseDouble(bufEntrada.readLine());
			if (user1.equals(user2) && pass1==pass2) {
				System.out.println("CREDENCIALES CORRECTAS. BIENVENIDO");
			} else {
				System.out.println("ERROR EN CREDENCIALES. FALLA EN INGRESO");
				System.out.println("TIENE " + (n-1) + " INTENTOS");
				n = n-1;
			}
		}
	}


}

