programa
{
	
	funcao inicio()
	{
	      //Carrinho de compras


		     //Declaração das variaveis carrinho de compras, Total do preço para produtos definidos
		     //iniciais dos produtos
		    inteiro CarrinhoCompras,PBC,TotalComprasBC, TotalComprasBB,TotalComprasBL,
		    TotalComprasBCC,TotalComprasBCL,TotalComprasBCB,TotalComprasBT,TotalComprasP,TotalComprasDK,
		    PBB,PBL,PBT,PBP,PBDK,PBCC,PBCL,PBCB

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
              
		
		//  Estrutura de Repeticao Calculo preço bolo chocolate
		    para(CarrinhoCompras = 0; CarrinhoCompras <= 0; CarrinhoCompras++){
		          TotalComprasBC = CarrinhoCompras * PBC
		          
		    
  
		          
		    	
		    	
		    	
		    	}
		 cadeia Pedido1 = " Bolo de Chocolate R$"+PBC+",00 "+CarrinhoCompras+" Itens R$"+TotalComprasBC+",00"
	 
		          
		    	
          cadeia Pedido2 = " Bolo Com Cobertura de Laranja R$"+PBCL+",00 "+CarrinhoCompras+" Itens R$"+TotalComprasBCL+",00"
          cadeia Pedido3 = " Bolo Trufado R$"+PBT+",00 "+CarrinhoCompras+" Itens R$"+TotalComprasBT+",00"


          escreva("Então Vamos Revisar Seu Pedido:\n"+
                       	"Voçê Adcionou em Seu Carrinho de Compras:\n"+Pedido1+"\n"
                       	+Pedido2+"\n"+Pedido3+"")
                       	leia(CarrinhoCompras)
                       	
                       	escreva("Se Seu Pedido Estiver Tudo Ok Digite 1 Para Finalizar, Caso Não Digite 2 Para Alterar Compras")

                       	//Revisar Compras || Ou Finalizar Compras
                       	inteiro FinalizarCompras = 3
                       	inteiro RevisarCompras   = 4         
		        //Aqui Possivelmente Colocar uma Parte de Acompanhamento do Pedido

                       	   inteiro ConfirmacaoPagamento,Separacao,Conferencia, Faturamento, Expedicao, EntregaSucesso,EntregaFracasso
                          cadeia ConfirmacaoPagamentoC = "Compra Aguardando Confirmação de Pagamento"
                          cadeia SeparacaoC = "Pedido Em Separação"
                          cadeia ConferenciaC = "Pedido Em Conferência"
                          cadeia FaturamentoC = "Pedido Em Faturamento"
                          cadeia ExpedicaoC = "Pedido Em Expedicao"
                          cadeia EntregaSucessoC = "Pedido Entregue Com Sucesso"
                          cadeia EntregaFracassoC = "Pedido Nao Entregue Por Algum Imprevisto, Favor Contatar a Central de Delivery"

                          ConfirmacaoPagamento = 1
                          Separacao            = 2
                          Conferencia          = 3
                          Faturamento          = 4
                          Expedicao            = 5
                          EntregaSucesso       = 6
                          EntregaFracasso      = 7 
                  
		         
                   	 se(FinalizarCompras == 3 ou RevisarCompras == 4)
                       	{
                       		//Aqui Será Finalizado A Compra Com O Pedido do Cliente Enviado um Email com Nota Fiscal e StatusCodigoRastreio
                              
                       		leia(FinalizarCompras)
                       		escreva("Compra Finalizada Com Sucesso!!! Nota Fiscal + StatusCodigoRastreio Enviado Para Seu Email\n\n")
                                //Faturamento e  Acompanhamento do Pedido
                       		//Aqui Possivelmente Colocar uma Parte de Acompanhamento do Pedido
                                //Condição Do Pedido = STATUS COMPRA
                                //Aqui A Logica Empregada é de Cancelar um Possivel Pedido ou Adcionar Possivel Pedido
                              //Retornando Para Menu Inicial da Aplicação
                       		leia(RevisarCompras)
                       		escreva("Então Vamos Revisar Seu Pedido, Caso Precise Alterar Retorne o Menu Navegação \n")
	}
}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */