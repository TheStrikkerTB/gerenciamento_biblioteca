package modelos;

import java.util.ArrayList;
import java.util.List;

//Classe resposável por administrar a adição e remoção de livros, além de listar os mesmos que já foram inseridos

public class Biblioteca {
    private static List<Livro> livros;

    // Inicializa a lista de livros no construtor
    public Biblioteca() {
        livros = new ArrayList<>(); 
    }

    //Adiciona um objeto livro criado na Main em um arraylist 
    public void addLivros(Livro livro){
        livros.add(livro);

        System.out.println("Livro adicionado com sucesso!\n");
        System.out.println("Voltando para o menu...");

        try {
            Thread.sleep(2000); // Pausa por 2 segundos
            } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            }

        return;
    
    }

    //Verifica se o arraylist de livros está vazio, caso não esteja imprime todos os Livros armazenados no array, com as suas respectivas informações
    public void imprimirLivros() {
        if (livros.isEmpty()) {
            System.out.println("Não há livros na biblioteca.");
        } else {
            System.out.println("Lista de livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    //Criar um metodo para remover e para pesquisar um livro (não sei se precisa ser por autor, genero etc... talvez só titulo)

}
