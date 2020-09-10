package Sis.cgi;

public class Aula12 {

	public static void main(String[] args) {
		String arq = "teste.txt";
		/*
		String texto = "No PlayStation 4 , quem faz a assinatura da PlayStation"
		+"Plus , além de poder jogar online, ganha mensalmente alguns títulos de" 
		+"graça para o seu videogame. Assim, a Sony  divulgou quais são os 3 jogos" 
		+ "+sairão de graça no console para comemorar os seus 10 anos de serviço," 
		+"que ficarão disponíveis no dia 7 de julho e poderão ser obtidos desta"
		+"forma até o dia 3 de agosto.";
		
		if(Arquivo.Write(arq, texto))
			System.out.println("Arquivo salvo com sucesso");
		else
			System.out.println("Erro no Arquivo!");
			
		String texto = Arquivo.Read(arq);
		if(texto.isEmpty())
			System.out.println("Erro ao ler do arquivo");
		else
			System.out.println(texto);
			*/
		String ArqConfig = "conf.con";
		String nome = "Eliezer";
		String login = "admin";
		String versao = "1.0.5";
		String print = nome+";"+login+";"+versao;	
		Arquivo.Write(ArqConfig, print);
		
		
		
				
		}

}
