package Sis.cgi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerAPPv2 {
	public static void main(String[] args) {
		try {
			Scanner entrada = new Scanner(new FileReader("/home/atlanta-nat/eclipse-workspace/ProjctCGI/src/Sis/cgi/numeros.txt"));
		    double soma = 0;
		    String valor;
		    while(entrada.hasNext()) {
		    	valor = entrada.next();
		    	soma = soma + Double.parseDouble(valor);
		    }
		    entrada.close();
		    JOptionPane.showMessageDialog(null, "A soma dos valores e:"+soma);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
	}

}
