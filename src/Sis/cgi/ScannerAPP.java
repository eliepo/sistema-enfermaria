
package Sis.cgi;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerAPP {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);
		
		System.out.println("Informe a Nota 1");
		float n1 = entrada.nextFloat();
		System.out.println("Informe a Nota 2");
		float n2 = entrada.nextFloat();
		System.out.println("Informe a Nota 3");
		float n3 = entrada.nextFloat();
		System.out.println("Informe a Nota 4");
		float n4 = entrada.nextFloat();
		float media = (n1+n2+n3+n4)/4;
		saida.format("media=%.2f",media);
		entrada.close();
		saida.close();
	}

}
