programa
{
	
	funcao inicio()
	{

		//Percorrendo Indices da Lista 
		//para(inteiro posicao = 0; posicao<=2; posicao++)
		//{
		//	escreva(Bolos[posicao]+"\n")
			
			
		//}
		
		// opções de Pagamento

escreva("Agora Escolha uma Opção de Pagamento, Crédito,Débito,Pix \n ")
inteiro OpcaoPagamento = 0

leia(OpcaoPagamento)
escolha(OpcaoPagamento){
	
	caso 1:
	
                   	  escreva("Voçê Selecionou a opção Crédito, Agora Informe Numero do cartão\n"+
                   	  "Nome e Codigo de Segurança Para Cadastrar e Finalizar Processo de Compra\n\n")
                   	  inteiro numeroCartao[100]
                   	  inteiro codigoSeguranca[100]
                   	  cadeia  nomeCliente[100]
                   	  
                   	  //Percorrendo Indices da Lista Cartao
		para(inteiro posicao = 0; posicao<=100; posicao++){
		   
              para(inteiro cont = 0; cont<=5; cont++){
              	 escreva("\n")escreva("Nome do Cliente\n")
	         leia(nomeCliente[posicao])	
             escreva("\n")escreva("Numero do cartao:\n")
	         leia(numeroCartao[posicao])
	         escreva("\n")escreva("Informe o Codigo de Segurança:\n")
	         leia(codigoSeguranca[posicao])

	        
	          escreva("\n===================================================\n") 
               escreva("Nome:")
               escreva(nomeCliente[posicao])
               escreva("\n")
               escreva("Cartão:")
               escreva("XXX-XXX-XXX-0"+cont+"\n")
               escreva("Codigo:") 
               escreva("XXX\n")
               escreva("Cartão Cadastrado Com Sucesso!") 
               escreva("\n===================================================\n") 
                  }
               }
	pare
	caso 2:
	
               escreva("Voçê Selecionou a opção Debito, Agora Informe Numero do cartão\n"+
                   	  "Nome e Codigo de Segurança Para Cadastrar e Finalizar Processo de Compra\n\n")
                   	  cadeia  nomeClienteD[100]
                   	  inteiro numeroCartaoD[100]
                   	  inteiro codigoSegurancaD[100]
                   	  
                   
                   	 
                   	  
                   	  //Percorrendo Indices da Lista Cartao
		para(inteiro Posicao = 0; Posicao<=100; Posicao++){
		   
              para(inteiro Cont = 0; Cont<=5; Cont++){
              	 escreva("\n")escreva("Nome do Cliente\n")
	         leia(nomeClienteD[Posicao])	
             escreva("\n")escreva("Numero do cartao:\n")
	         leia(numeroCartaoD[Posicao])
	         escreva("\n")escreva("Informe o Codigo de Segurança:\n")
	         leia(codigoSegurancaD[Posicao])

	        
	          escreva("\n===================================================\n") 
               escreva("Nome:")
               escreva(nomeClienteD[Posicao])
               escreva("\n")
               escreva("Cartão:")
               escreva("XXX-XXX-XXX-0"+Cont+"\n")
               escreva("Codigo:") 
               escreva("XXX\n")
               escreva("Cartão Cadastrado Com Sucesso!") 
               escreva("\n===================================================") 
               
	           
	          
	          }
		}
	pare
	caso 3:
	escreva("Voçê Selecionou a opção Pix, Em seguida Será Gerado um Codigo, Pague e Finalize o Processo de Compra\n\n")
	inteiro Pix[5]
	Pix[0]= 1
	Pix[1]= 2
	Pix[2]= 3
	Pix[3]= 4
	Pix[4]= 5

	
	escreva("Numero do Pix:")
	para(inteiro cont1 = 0; cont1<=1; cont1++){
		
    	escreva(Pix[0])
    	escreva(Pix[1])
    	escreva(Pix[2])
    	escreva(Pix[3])
    	escreva(Pix[4])
    	escreva(Pix[3])
    	escreva(Pix[0])
    	escreva(Pix[1])
    	escreva(cont1)
    	
    	
    	
    
    }
	
	
	
	
	
   
	pare
	
	
	}
                 

	         	

              
                   	  
                

	      
	         
	          

	         
              

		
		    
	       	
	       	
			
			
		
            }

	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */