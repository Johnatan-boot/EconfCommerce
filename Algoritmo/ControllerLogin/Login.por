programa
{
	
	funcao inicio()
	{
		//Componente Cadastro e Login Testes do algoritmo OK
		
		//Abertura de Conta Na Plataforma
		cadeia CadastrarCliente,CadastrarEmail,CadastrarSenha
		cadeia  ClienteCadastrado
		inteiro FinalizacaoPrograma = 0
		inteiro CadastroEmail = 1
		inteiro CadastroSenha = 2
		inteiro EmailNaoCadastrado = 3
		inteiro SenhaNaoCadastrada = 4

		//Criação de Conta na Plataforma
		escreva("Caro Cliente Para Consumir em nossa Plataforma Crie uma Conta Informando E-mail e Senha.\n")
		//Informando Email
		
	se(CadastroEmail == 1)
		{//1 Condição cadastro EMAIL
		escreva("Digite 1 Para Informar seu Email:\n")
		leia(CadastroEmail)
		escreva(" Informe E-mail:\n")
		leia(CadastrarEmail)//Johnatan.quenes@gmail.com
		
		//Informando Senha
	se(CadastroSenha == 2){ //2 Condição cadastro SENHA
		escreva("Digite 2 Para Informar sua Senha:\n")
		leia(CadastroSenha)	
		escreva(" Informe sua Senha:\n")
		leia(CadastrarSenha)//admin123
		
          // Caso Usuario Informe Email e  Senha
	se(CadastroEmail == 1 e CadastroSenha == 2)
	{//3 Condição cadastro EMAIL e SENHA
		leia(CadastrarEmail)//Johnatan.quenes@gmail.com
		leia(CadastrarSenha)//admin1234	
		escreva("=============================================================================\n")
		escreva("Aguarde enquanto Finalizamos o Processo Abertura de sua  Conta\n")
		leia(ClienteCadastrado)
		escreva("Pronto Agora sua Conta Foi Criada Com Sucesso Poderá Fazer Suas Compras Com Segurança.\n")
		escreva("=============================================================================\n")

 
  }//3 Condição cadastro EMAIL e SENHA
		
  }//2 Condição cadastro SENHA

		
  }//1 Condição cadastro EMAIL
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1812; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */