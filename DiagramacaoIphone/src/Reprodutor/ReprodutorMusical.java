package Reprodutor;

public interface ReprodutorMusical {
    
    public void tocarMusica(String nome);
    public void pausarMusica(String nome);
    public void selecionarMusica(String nome);
    public void adicionarMusica(String nome, String artista);
    public void pularMusica();
    public void voltarMusica();
}
