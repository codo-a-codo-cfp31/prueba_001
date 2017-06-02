/* Este codigo ha sido generado por el modulo psexport 20160506-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "MES.java."

import java.io.*;

public class mes {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String lista_meses[];
		int mes_seleccionado;
		lista_meses = new String[13];
		lista_meses[1] = "Enero";
		lista_meses[2] = "Febrero";
		lista_meses[3] = "Marzo";
		lista_meses[4] = "Abril";
		lista_meses[5] = "Mayo";
		lista_meses[6] = "Junio";
		lista_meses[7] = "Julio";
		lista_meses[8] = "Agosto";
		lista_meses[9] = "Septiembre";
		lista_meses[10] = "Octubre";
		lista_meses[11] = "Noviembre";
		lista_meses[12] = "Diciembe";
		mes_seleccionado = bufEntrada.readLine();
		System.out.println(lista_meses[mes_seleccionado]);
		if (mes_seleccionado<1) {
			System.out.println("SALISTE DEL PROGRAMA");
		}
	}


}

