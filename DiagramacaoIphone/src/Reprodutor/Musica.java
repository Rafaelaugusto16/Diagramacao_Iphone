package Reprodutor;

public class Musica {
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String artista;
    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Musica(String nome, String artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public String toString() {
        return nome + ", " + artista;
    }
    
}
