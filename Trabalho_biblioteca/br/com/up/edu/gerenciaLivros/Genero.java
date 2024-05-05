package br.com.up.edu.gerenciaLivros;

public class Genero {
    private String tipo;
    public Genero(String tipo){
        this.tipo = tipo;
    }

    //get e set
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
