package br.com.up.edu;

import java.util.ArrayList;

import br.com.up.edu.gerenciaLivros.Livro;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<Livro>();

        adicionarLivro( livros, "Joao e o pe de feijao2","Joaoz2", "Padarias2", "Acaoz2");
        adicionarLivro( livros, "Joao e o pe de feijao1","Joaoz1", "Padarias1", "Acaoz1");
        listarLivros(livros);
    }

    //metodo para pesquisar os livros
    static Livro pesquisarLivro(String titulo, ArrayList<Livro> livros) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println("Livro encontrado!");
                return livro;
            }
        }
        return null;
    }
    
    //metodo para remover livros
    static void removerLivro(ArrayList<Livro> livros,String livro){
        Livro livroProcurado = pesquisarLivro(livro, livros);
        if (livroProcurado != null){
            livros.remove(livroProcurado);
            System.out.println("Livro removido");

        } else System.out.println("Livro nao encontrado...");
    }

    //metodo para adicionar livros
    static void adicionarLivro(ArrayList<Livro> livros,String titulo, String nome_autor, String nome_editora, String genero_tipo){
        livros.add(new Livro(titulo, nome_autor, nome_editora, genero_tipo));
    }

    //metodo para Listar os livros
    static void listarLivros(ArrayList<Livro> livros){
        for (Livro livro : livros) {
            System.out.println("Livro posição: " + (livros.indexOf(livro) + 1) + "\n" +livro);
        }
    }


    
}
