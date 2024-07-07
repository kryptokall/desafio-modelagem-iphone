package devices;

import characteristics.AparelhoTelefonico;
import characteristics.NavegadorInternet;
import characteristics.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //caracteristicas de reprodutor musical
    public void tocar() {
        System.out.println("Tocando música no Iphone...");
    }
    public void pausar() {
        System.out.println("Pausando música no Iphone...");
    }
    public void selecionarMusica(String musica){
        System.out.println("Reproduzindo música no Iphone: " + musica);
    }

    //caracteristicas de aparelho telefonico
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " no Iphone.");
    }
    public void atender() {
        System.out.println("Atendendo chamada no Iphone...");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone...");
    }

    //caracteristicas de navegador de internet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Iphone: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página no Iphone...");
    }

}
