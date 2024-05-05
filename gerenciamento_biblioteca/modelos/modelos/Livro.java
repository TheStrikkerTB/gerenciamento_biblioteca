package modelos;

import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;
    private ArrayList<Genero> genero;
    private ArrayList<Editora> editora;

    public Livro(String titulo, Autor autor, ArrayList<Genero> genero, ArrayList<Editora> editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public ArrayList<Genero> getGenero() {
        return genero;
    }

    public void setGenero(ArrayList<Genero> genero) {
        this.genero = genero;   
    }

    public ArrayList<Editora> getEditora() {
        return editora;
    }

    public void setEditora (ArrayList<Editora> editora) {
        this.editora = editora;
    }

}