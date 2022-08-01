package com.ecommerce.login;

public class Login {
    public static void main(String[] args) {
        System.out.println("Sejam Bem Vindos A Confeitaria do Jony!");
        System.out.println("Para Consumir em Nossa Plataforma e necessário Criar uma conta\n" +
                            "Informando Email E Senha");
        System.out.println("Informe o email ");
        System.out.println("Informe uma senha ");

    }
    
}
import java.util.Scanner;
public class Main		//Classe
{
    public static void main (String[]args)
    {

        System.out.println ("Sejam Bem Vindos A Confeitaria do Jony!!!");
        System.out.
                println ("Para Consumir em Nossa Plataforma Crie uma Conta.\n");
        //Scanner scan =  new Scanner(System.in);//Entrada e Saida de Dados

        //Cadastro e Login
        String Email = "johnatan.quenes@gmail.com";
        System.out.println ("Informe seu Email:" + Email + ";\n");
        // Email = scan.nextStr();

        String Senha = "admin123";
        System.out.println ("Informe sua Senha:" + Senha + ";");
        //Senha = scan.nextStr();

        //Retorno
        //String cadastrarCliente = cadastrarCliente(Email,Senha);
        // System.out.println(cadastrarCliente + "Conta Criada Com Sucesso!");

        String cadastrarCliente = Email + "\n" + Senha + "\n";
        String EmailNulo = "";
        String SenhaNula = "";
        String NaoPossuiEmailSenha = EmailNulo + SenhaNula;



        System.out.println ("Aguarde O Processo de Criação de Conta");
        System.out.println ("=======================================");




        if (cadastrarCliente != NaoPossuiEmailSenha)
        {
            System.out.println ("Conta Criada Com Sucesso!");


        }
        else if (NaoPossuiEmailSenha != cadastrarCliente)
        {
            System.out.println (NaoPossuiEmailSenha +
                    "Precisa Informar Email e Senha,Para Criar Conta!");

        }

        System.out.println ("Agora Poderá Consumir em Nossa Plataforma");


    }

    //public static String cadastrarCliente(String Email, String Senha){
    //  return Email + Senha;


    //}
import java.util.Scanner;
    public class Main		//Classe
    {
        public static void main (String[]args)
        {

            System.out.println ("Sejam Bem Vindos A Confeitaria do Jony!!!");
            System.out.
                    println ("Para Consumir em Nossa Plataforma Crie uma Conta.\n");
            //Scanner scan =  new Scanner(System.in);//Entrada e Saida de Dados

            //Cadastro e Login
            String Email = "johnatan.quenes@gmail.com";
            System.out.println ("Informe seu Email:" + Email + ";\n");
            // Email = scan.nextStr();

            String Senha = "admin123";
            System.out.println ("Informe sua Senha:" + Senha + ";");
            //Senha = scan.nextStr();

            //Retorno
            //String cadastrarCliente = cadastrarCliente(Email,Senha);
            // System.out.println(cadastrarCliente + "Conta Criada Com Sucesso!");

            String cadastrarCliente = Email + "\n" + Senha + "\n";
            String EmailNulo = "";
            String SenhaNula = "";
            String NaoPossuiEmailSenha = EmailNulo + SenhaNula;



            System.out.println ("Aguarde O Processo de Criação de Conta");
            System.out.println ("=======================================");




            if (cadastrarCliente != NaoPossuiEmailSenha)
            {
                System.out.println ("Conta Criada Com Sucesso!");


            }
            else if (NaoPossuiEmailSenha != cadastrarCliente)
            {
                System.out.println (NaoPossuiEmailSenha +
                        "Precisa Informar Email e Senha,Para Criar Conta!");

            }

            System.out.println ("Agora Poderá Consumir em Nossa Plataforma");


        }

        //public static String cadastrarCliente(String Email, String Senha){
        //  return Email + Senha;


        //}

    }
}

