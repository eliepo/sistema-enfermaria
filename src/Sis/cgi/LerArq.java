package Sis.cgi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class LerArq {
	
	

	public static void main(String[] args) {
		
		String indicez,data1z,tipoz,val1z,val2z,val3z,val4z,val5z,val6z;
		//Lendo Arquivo
		//Fazer uma entrada no banco de dados e colocar la dentro.
		String Arqzf = "/home/atlanta-nat/Documentos/Senior/Desafio Cidades - Back End.csv";
		BufferedReader Contzf = null;
        String linha = "";
        String Separador = ","
        		+ "";
        try {
        	//Conexão com Postgresql
        	postgresql meupos = new postgresql();
    		String urlZ=meupos.urlz;
    		String usuarioz=meupos.usuarioz;
    		String senhaz=meupos.senhaz;
    		String drivez=meupos.driver;
    		Class.forName(drivez);
    		Connection con;
    		con=DriverManager.getConnection(urlZ,usuarioz,senhaz);
    		Statement st;
    		st = con.createStatement();
    		
    		//Ler arquivo Texto
        	Contzf = new BufferedReader(new FileReader(Arqzf));
        	
        	while ((linha = Contzf.readLine())!= null) {
        		String[] moeda = linha.split(Separador);
        		indicez = moeda[0];
        		data1z = moeda[1];
        		tipoz = moeda[2];
        		val1z = moeda[3];
        		val2z = moeda[4];
        		val3z = moeda[5];
        		val4z = moeda[6];
        		val5z = moeda[7];
        		val6z = moeda[8];
        		System.out.println(indicez+data1z+tipoz+val1z+val2z+val3z+val4z+val5z+val6z);
        		st.executeUpdate("INSERT INTO indice(indice,data1,tipo,val1,val2,val3,val4,val5,val6) VALUES ('"+indicez+"', '"+data1z+"','"+tipoz+"','"+val1z+"','"+val2z+"','"+val3z+"','"+val4z+"','"+val5z+"','"+val6z+"')");   
        	}
		}  catch(Exception event){
            event.printStackTrace();
            JOptionPane.showMessageDialog(null,"Conexão não estabelcida","Mensagem do Programa",JOptionPane.ERROR_MESSAGE);
			
			
		}
        
      
	

  }	
}



