programa
{
	
	funcao inicio()
	{     

//Vetores Produtos
 	
 cadeia Bolos[] = {"Bolos Tradicionais"," Bolos Com Cobertura"," Bolos Para Festas"}
 
 cadeia BolosTradicionais[] = {"Bolo de Chocolate","Bolo de Laranja","Bolo de Baunilha "}
 //escreva(BolosTradicionais[0])
 
 cadeia BolosComCobertura[] = {"Bolo Com Cobertura de Chocolate","Bolo Com Cobertura de Baunilha",
"Bolo Com Cobertura de Laranja"}
//escreva(BolosComCobertura[0])

 cadeia BolosFestas[] = {"Bolo Prestigio","Bolo Dressed Cake","Bolo Trufado"}
 //escreva(BolosFestas[0])

 //Carrinho de compras

//Declaração das variaveis carrinho de compras, Total do preço para produtos definidos
//iniciais dos produtos
inteiro CarrinhoCompras,PBC,TotalComprasBC, TotalComprasBB,TotalComprasBL,TotalComprasBCC,TotalComprasBCL,TotalComprasBCB,
TotalComprasBT,TotalComprasP,TotalComprasDK,PBB,PBL,PBT,PBP,PBDK,PBCC,PBCL,PBCB
//Inicialização das Variaveis total de compras
//Inicialização das Variaveis Preço dos Produtos    

TotalComprasBC = 0
TotalComprasBB = 0
TotalComprasBL = 0
TotalComprasBCC = 0
TotalComprasBCB = 0
TotalComprasBCL = 0
TotalComprasBT = 0
TotalComprasP = 0
TotalComprasDK = 0		    
		    
PBC = 13
PBB =14
PBL= 15
PBCC = 22
PBCL = 24
PBCB = 26
PBDK= 90
PBT= 120
PBP= 130

               // Menu

 escreva("Pronto Agora Poderá Fazer Suas Compras Com Segurança.\n")
 escreva("Selecione Uma Opção do Menu que Lhes Agradar\n")
 escreva("1- Bolo Tradicionais:\n"+
  	    "2- Bolo Com Cobertura: \n"+
         "3- Bolo Para Festas:  \n")
         escreva("Digite Neste Campo:")
inteiro MenuCompras1 = 0
leia(MenuCompras1)
escolha(MenuCompras1)
{
caso 1:
 escreva("Voçê Selecionou a Opção 1-"+Bolos[0]+" agora escolha a Opção que mais lhes agrada no Menu:\n")
  escreva("4- Bolo de Chocolate:\n"+
  	     "5- Bolo de Baunilha: \n"+
          "6- Bolo de Laranja:  \n")
         escreva("Digite Neste Campo:")
 

 
inteiro MenuCompras2 = 4
leia(MenuCompras2)
escolha(MenuCompras2)
{
	
	caso 4:
	 escreva("Voçê Selecionou a Opção 4-"+BolosTradicionais[0]+" R$"+PBC+",00 agora escolha a Quantidade  Desejada:\n")
	 //  Estrutura de Repeticao Calculo preço bolo chocolate
para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++)
{
	TotalComprasBC = CarrinhoCompras * PBC
		          
}	

leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto
  escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasBC+ ",00" + "\n")
  escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0\n")
inteiro fluxoPrograma = 1
inteiro FinalizaPrograma = 0
se(fluxoPrograma == 1 ou FinalizaPrograma == 0){
	leia(fluxoPrograma)
	escreva("Passando Para o  Proximo Item do Menu...\n")
	escreva("Voçê Selecionou a Opção 5-"+BolosTradicionais[1]+"R$"+PBB+",00 agora escolha a Quantidade Desejada:\n")
	
	
	//  Estrutura de Repeticao Calculo preço bolo Baunilha
para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++)
{
	TotalComprasBB = CarrinhoCompras * PBB
		          
		          
}
              		 	
leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras              			
escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
+ "de Compras Valor Total R$"+TotalComprasBB+ ",00" + "\n")
//A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto
escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0")
escreva("Digite Neste Campo:")
leia(FinalizaPrograma)

escreva("Voçê Selecionou a Opção 6-"+BolosTradicionais[2]+"R$"+PBL+",00 agora escolha a Quantidade Desejada:\n")

//  Estrutura de Repeticao Calculo preço bolo Laranja
para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++)
{
		          
  TotalComprasBL = CarrinhoCompras * PBL
		          
		          
}

leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
//A variavel PBL MOSTRA o preço do Produto 
//A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto
escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
	   + "de Compras Valor Total R$"+TotalComprasBL+ ",00" + "\n")//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
//A variavel PBC MOSTRA o preço do Produto 
//A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto
escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0")
escreva("Digite Neste Campo:")
leia(fluxoPrograma)
 
	}senao{
		leia(fluxoPrograma)
		escreva("Programa Finalizado!!")
		leia(FinalizaPrograma)
		
		}
		

	pare
	
	
	}
pare
caso 2:
escreva("Voçê Selecionou a Opção 2-"+Bolos[1]+" agora escolha a Opção que mais lhes agrada no Menu:\n")
 escreva("7- Bolo Cobertura Chocolate:\n"+
    	    "8- Bolo Cobertura de Baunilha: \n"+
   	    "9- Bolo Cobertura de Laranja:  \n")
   	   escreva("Digite Neste Campo:")

inteiro fluxoPrograma = 1
inteiro FinalizaPrograma = 0
   	   
inteiro MenuCompras3 = 7
leia(MenuCompras3)
escolha(MenuCompras3)
{
	caso 7:
	escreva("Voçê Selecionou a Opção 7-"+BolosComCobertura[0]+ " R$"+PBCC+",00 agora escolha a Quantidade Desejada:\n")
	 				 inteiro BCC =  7 //BCC =BOLO COM COBERTURA DE CHOCOLATE
                	      inteiro BCL =  8 // BOLO COM COBERTURA DE LARANJA
                	      inteiro BCB  = 9 //BOLO COM COBERTURA DE BAUNILHA
                	      
	 //  Estrutura de Repeticao Calculo preço bolo Cobertura de chocolate
		    	para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasBCC = CarrinhoCompras * PBCC
		          
		          
		    	
		    	
		    	
		    	}
	leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasBCC+ ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(FinalizaPrograma)
	pare
	caso 8:
	escreva("Voçê Selecionou a Opção 8-"+BolosComCobertura[1]+ " R$"+PBCB+",00 agora escolha a Quantidade Desejada:\n")
	 //  Estrutura de Repeticao Calculo preço bolo Cobertura de Baunilha
		    	para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasBCB = CarrinhoCompras * PBCB
		          
		          
		    	
		    	
		    	
		    	}

    leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasBCB+ ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(FinalizaPrograma)		    	
	pare
	caso 9:
	escreva("Voçê Selecionou a Opção 9-"+BolosComCobertura[2]+ " R$"+PBCL+",00 agora escolha a Quantidade Desejada:\n")
	 //  Estrutura de Repeticao Calculo preço bolo Cobertura de Laranja
               para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasBCL = CarrinhoCompras * PBCL
		          
		          
		    	
		    	
		    	
		    	}
     
    leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasBCL+ ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(FinalizaPrograma)		    	
	pare
	
	
	
  }	       
pare
caso 3:
escreva("Voçê Selecionou a Opção 3-"+Bolos[2]+" agora escolha a Opção que mais lhes agrada no Menu:\n")
 escreva("1- Bolo Prestigio:\n"+
    	    "2- Bolo Dressed Cake: \n"+
   	    "3- Bolo  Trufado:  \n")
   	   escreva("Digite Neste Campo:")
inteiro fluxoPrograma2 = 0
inteiro MenuCompras4 = 1
leia(MenuCompras4)
escolha(MenuCompras4){
	caso 1:
	escreva("Voçê Selecionou a Opção 1-"+BolosFestas[0]+" R$"+PBP+",00 agora escolha a Quantidade Desejada:\n")
	 //  Estrutura de Repeticao Calculo preço Bolo Prestigio
		    	para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasP = CarrinhoCompras * PBP
		          
		          
		    	
		    	
		    	
		    	}
     leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasP+ ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(fluxoPrograma2)			    	
	pare
	caso 2:
	escreva("Voçê Selecionou a Opção 2-"+BolosFestas[1]+" R$"+PBDK+",00 agora escolha a Quantidade Desejada:\n")
	 //  Estrutura de Repeticao Calculo preço Bolo Dressed Cake
		    		para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasDK = CarrinhoCompras * PBDK
		          
		          
		    	
		    	
		    	
		    	}
  leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasDK + ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(fluxoPrograma2)		    	
	pare
	caso 3:
	escreva("Voçê Selecionou a Opção 3-"+BolosFestas[2]+" R$"+PBT+",00 agora escolha a Quantidade Desejada:\n")
	//  Estrutura de Repeticao Calculo preço Bolo Trufado 
		    	para(CarrinhoCompras = 0; CarrinhoCompras <= 2; CarrinhoCompras++){
		          TotalComprasBT = CarrinhoCompras * PBT
		          
		          
		    	
		    	
		    	
		    	}
leia(CarrinhoCompras)//Vai ler o Contador de Itens Comprados em sua Lista de compras ou carrinho de compras
   //A variavel PBC MOSTRA o preço do Produto 
  //A variavel TotalCompras o Total o calculo de quantidade Itens x Valor do Produto	    	
	escreva("Voçê Adcionou "+CarrinhoCompras+ " Itens Em seu Carrinho "
		+ "de Compras Valor Total R$"+TotalComprasBT+ ",00" + "\n")	
     escreva("Deseja Algo Mais ? Se Sim Dgite 1, se Não Digite 0:\n")
     escreva("Digite Neste Campo:")
     leia(fluxoPrograma2)			    	
	pare
	
	
	}   
pare
}               

		
	
		
		
		//Percorrendo Indices da Lista 
		//para(inteiro posicao = 0; posicao<=2; posicao++)
		//{
		//	escreva(Bolos[posicao]+"\n")
			
			
		//}
		
		
		
  //Navegação Fluxo do Programa Econf Ecommerce  Testes do algoritmo



	

		
			
}//Função

//Programa	
} 			
			
			
			
		  
		



		
		   
      

         
         


          
	
		
		
		
		
		
          
 
             
        


          
		

		
		
	    

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 11067; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */