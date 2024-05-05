package br.com.up.edu;

import java.util.ArrayList;

import br.com.up.edu.gerenciaLivros.Livro;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();

        adicionarLivro( livros, "Joao e o pe de feijao2","Joaoz2", "Padarias2", "Acaoz2");
        adicionarLivro( livros, "Joao e o pe de feijao2","Joaoz2", "Padarias2", "Acaoz2");
        removerLivro(livros, "Joao e o pe de feijao2");
        System.out.println(livros);
    }


    public static Livro pesquisarLivro(String titulo, ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
    
    //para remover livros
    static void removerLivro(ArrayList<Livro> livros,String livro){
        Livro livroProcurado = pesquisarLivro(livro, livros);
        livros.remove(livroProcurado);
        System.out.println("Livro removido");
    }

    static void adicionarLivro(ArrayList<Livro> livros,String titulo, String nome_autor, String nome_editora, String genero_tipo){
        livros.add(new Livro(titulo, nome_autor, nome_editora, genero_tipo));
    }


    
}
