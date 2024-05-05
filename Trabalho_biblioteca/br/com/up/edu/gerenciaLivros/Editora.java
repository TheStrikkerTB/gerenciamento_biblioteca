package br.com.up.edu.gerenciaLivros;

public class Editora {
    private String nome;
    public Editora(String nome){
        this.nome = nome;
    }

    //get e set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
