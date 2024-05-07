package modelos;

public class Livro {
    private String titulo;
    private Autor autor;
    private String genero;
    private String editora;

    public Livro(String titulo, Autor autor, String genero, String editora) {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;   
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora (String editora) {
        this.editora = editora;
    }

}