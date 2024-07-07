package devices;

import characteristics.NavegadorInternet;

public class Mac implements NavegadorInternet {

    public void exibirPagina(String url) {
        System.out.println("Exibindo página no Mac: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Mac...");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando página no Mac...");
    }
    
}
