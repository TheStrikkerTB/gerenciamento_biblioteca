package br.com.up.edu.gerenciaLivros;

public class Autor {
    String nome;
    
    public Autor(String nome){
        this.nome = nome;
    }
    //get e set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}
