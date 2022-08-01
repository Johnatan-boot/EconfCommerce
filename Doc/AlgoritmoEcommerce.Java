EconfCommerce - Algoritmo em Java

public class Main //Classe
{
	public static void main(String[] args) { 
	    
	     //Cadastro e Login
	    String Email = "johnatan.quenes@gmail.com";
	    String Senha = "admin123";
	    String cadastrarCliente = Email + Senha;
	    
	    System.out.println("Sejam Bem Vindos A Confeitaria do Jony!!!");
		System.out.println("Para Consumir em Nossa Plataforma Cria uma Conta.\n");
		System.out.println("Informe seu Email:"+Email+";\n");
		System.out.println("Informe sua Senha:"+Senha+";");
	    
	    
	    if (cadastrarCliente == Email + Senha)
	    {
	       System.out.println(Email+Senha+"Conta Criada Com Sucesso!");

	        
	    } 
		
		
	
		
	

	}
}
