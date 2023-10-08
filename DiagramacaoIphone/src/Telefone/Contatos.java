package Telefone;

public class Contatos {
    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Contatos(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        return  nome + ", " + numero;
    }

    
}
