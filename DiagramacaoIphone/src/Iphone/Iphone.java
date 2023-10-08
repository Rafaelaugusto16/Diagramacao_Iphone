package Iphone;

import java.util.ArrayList;
import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaIphone iphone = new SistemaIphone(new ArrayList<>(), new ArrayList<>());
        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n1.Telefone\n2.Reprodutor de Música\n3.Navegador\n4.Sair");
            System.out.print("\nEscolha qual opção deseja usar: ");
            opcao = scanner.nextInt();

            switch(opcao){
                //Telefone

                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("              Telefone");
                    System.out.println("----------------------------------------");

                    iphone.adicionarContato("Rafael", 12345678);
                    iphone.adicionarContato("Pedro", 91011121);
                    iphone.adicionarContato("Jorge", 31415161);

                    iphone.liga("Pedro");
                    iphone.desligar();

                    iphone.atender("Rafael");
                    iphone.desligar();

                    iphone.correioDeVoz("Jorge");
                    
                    break;

                //Reprodutor Musical
                case 2:

                    System.out.println("----------------------------------------");
                    System.out.println("               Música");
                    System.out.println("----------------------------------------");

                    iphone.adicionarMusica("Seu Astral", "Jorge e Matheus");
                    iphone.adicionarMusica("Conselho", "Revelação");
                    iphone.adicionarMusica("A vida é desafio", "Racionais");

                    iphone.selecionarMusica("Conselho");
                    iphone.tocarMusica("Conselho");
                    iphone.pausarMusica("Conselho");
                    iphone.pularMusica();
                    iphone.tocarMusica("A vida é desafio");
                    iphone.voltarMusica();
                    iphone.tocarMusica("Conselho");
                    break;
                //Navegador
                case 3:

                    System.out.println("----------------------------------------");
                    System.out.println("             Navegador");
                    System.out.println("----------------------------------------");

                    iphone.exibirPagina("https://www.google.com/");
                    iphone.atualizarPagina("https://www.google.com/");
                    iphone.adicionarNovaAba("https://www.google.com/");
                    iphone.fecharPagina("https://www.google.com/");
                    break;

                case 4:
                    System.out.println("Encerrando sistema!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
            }

            }

        scanner.close();
    }
}
