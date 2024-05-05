package br.com.up.edu.gerenciaLivros;


public class Livro {
    private String titulo;
    private Autor autor;
    private Editora editora;
    private Genero genero;


    //construtor com classes
    public Livro(String titulo,Autor autor, Editora editora, Genero genero){
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
    }
    //construtor que cria as classes somente pedindo o string de cada coisa
    public Livro(String titulo,String nome_autor, String nome_editora, String genero_tipo){
        this.titulo = titulo;
        this.autor = new Autor(nome_autor);
        this.editora = new Editora(nome_editora);
        this.genero = new Genero(genero_tipo);
    }


    //SETS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    //GETS
    public String getTitulo() {
        return titulo;
    }
    public Autor getAutor() {
        return autor;
    }
    public Editora getEditora() {
        return editora;
    }
    public Genero getGenero() {
        return genero;
    }


    //retorno da String do Livro 
    @Override
    public String toString() {
        return "Titulo: " +titulo +
                "\nAutor: " +autor.nome +
                "\nEditora: " + editora.nome +
                "\nGenero: " + genero.tipo;
    }
    
}