package Iphone;

import java.util.ArrayList;
import java.util.List;

import Navegador.NavegadorInternet;
import Reprodutor.Musica;
import Reprodutor.ReprodutorMusical;
import Telefone.Contatos;
import Telefone.Telefone;

public class SistemaIphone implements Telefone,NavegadorInternet,ReprodutorMusical{

    private List <Contatos> listContatos;
    
    public List<Contatos> getListContatos() {
        return listContatos;
    }

    public void setListContatos(List<Contatos> listContatos) {
        this.listContatos = listContatos;
    }

    private List <Musica> listMusica;
    
    public List<Musica> getListMusica() {
        return listMusica;
    }

    public void setListMusica(List<Musica> listMusica) {
        this.listMusica = listMusica;
    }

    public SistemaIphone(List<Contatos> listContatos, List <Musica> listMusica){
        this.listContatos = new ArrayList<>();
        this.listMusica = new ArrayList<>();
    }
   
    //Repodutor Musical

    public void adicionarMusica(String nome, String artista) {
       this.listMusica.add(new Musica(nome, artista));
    }

    public void tocarMusica(String nome) {
        Musica tocarMusica = null;

        if(!listMusica.isEmpty()){
            for (Musica musica : listMusica) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    tocarMusica = musica;    
                }
            }
        
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    System.out.println("Tocando música:" + tocarMusica);
    }

    public void pausarMusica(String nome) {
             Musica pausarMusica = null;

        if(!listMusica.isEmpty()){
            for (Musica musica : listMusica) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    pausarMusica = musica;    
                }
            }
        
        } else {
            throw new RuntimeException("A música não está na playlist!");
        }
    System.out.println("Música: " + pausarMusica + " Pausada");
    }

    public void selecionarMusica(String nome) {
        Musica musicaSelecionada = null;

        if(!listMusica.isEmpty()){
            for (Musica musica : listMusica) {
                if (musica.getNome().equalsIgnoreCase(nome)) {
                    musicaSelecionada = musica;    
                }
            }

        } else {
            throw new RuntimeException("A lista está vazia");
        }
    System.out.println("A música selecionada:" + musicaSelecionada);
    }

    public void pularMusica() {
        System.out.println("Proxima música");
    }
   
    public void voltarMusica() {
        System.out.println("Música anterior");
    }

    //Navegador Internet

    public void adicionarNovaAba(String url) {
            System.out.println("Adicionando nova Aba: " + url);
    }

    public void atualizarPagina(String url) {
          System.out.println("Atualizando pagina: " + url);
    }

    public void exibirPagina(String url) {
        System.out.println("Abrindo pagina: " + url);
    }

    public void fecharPagina(String url) {
          System.out.println("Fechando pagina: " + url);
    }

    //Telefone

    public void liga(String nome) {
       Contatos ligarContato = null;

        if(!listContatos.isEmpty()){
            for (Contatos contato : listContatos) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    ligarContato = contato;    
                }
            }

        } else {
            throw new RuntimeException("A lista está vazia");
        }
        System.out.println("Ligando para: " + ligarContato);
    }

    public void desligar (){
        System.out.println("Desligando chamada.");
    }

    public void atender(String nome) {
        System.out.println("Atendendo: " + nome);
    }

    public void correioDeVoz(String nome) {
       System.out.println("Enviando mensagem de voz para: " + nome);
    }

    public void adicionarContato(String nome, int numero) {
       this.listContatos.add(new Contatos(nome, numero));
    }
    
}
