package stores;

import java.util.Scanner;

import devices.Iphone;
import devices.Ipod;
import devices.Mac;

public class AppleStore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Bem vindo(a) à Apple Store!");
        System.out.println("Qual aparelho você gostaria de experimentar?");

        System.out.println();
        System.out.println("1 - Iphone; 2 - Ipod; 3 - Mac; 4 - Finalizar programa");
        System.out.println();
        int option = sc.nextInt();

        while (option != 4) {
            switch (option) {
                case 1:
                    Iphone iphone = new Iphone();

                    System.out.println("---- IPHONE ----");
                    System.out.println();

                    iphone.selecionarMusica("Chihiro - Billie Eilish");
                    iphone.tocar();
                    iphone.pausar();
                    System.out.println();

                    iphone.ligar("3333-3333");
                    iphone.atender();
                    iphone.iniciarCorreioVoz();
                    System.out.println();

                    iphone.exibirPagina("http://twitter.com/");
                    iphone.adicionarNovaAba();
                    iphone.atualizarPagina();
                    System.out.println();

                    break;
                    
                case 2:
                    Ipod ipod = new Ipod();

                    System.out.println("---- IPOD ----");
                    System.out.println();

                    ipod.selecionarMusica("The Greatest - Billie Eilish");
                    ipod.tocar();
                    ipod.pausar();
                    System.out.println();
                
                break;

                case 3:
                    Mac mac = new Mac();

                    System.out.println("---- MAC ----");
                    System.out.println();

                    mac.exibirPagina("https://google.com/");
                    mac.adicionarNovaAba();
                    mac.atualizarPagina();
                    System.out.println();

                break;

                default:
                    System.out.println("Digite um número entre 1 e 4.");
                break;

            }

        System.out.println("Qual aparelho você gostaria de experimentar agora?");

        System.out.println();
        System.out.println("1 - Iphone; 2 - Ipod; 3 - Mac; 4 - Finalizar programa");
        System.out.println();
        option = sc.nextInt();

        }

        System.out.println("Apresentação finalizada.");
        System.out.println();

        sc.close();

    }

}
