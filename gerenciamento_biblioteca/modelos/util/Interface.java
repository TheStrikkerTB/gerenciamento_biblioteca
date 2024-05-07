package util;

import modelos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interface{
    private static Scanner scanner = new Scanner(System.in);
    private List<String> editoras = Editora.getEditora();
    private List<String> generos = Genero.getGenero();

    private String tituloLivro;
    private Autor autorLivro;
    private String generoLivro;
    private String editoraLivro;

    public void imprimirMenu(){
        System.out.println("==========================================================\n");
        System.out.println("               [Gerenciamento de Biblioteca]              \n");
        System.out.println("==========================================================");
        System.out.println();
        System.out.println("           -> Escolha uma das opções abaixo: <-           ");
        System.out.println();
        System.out.println("==========================================================\n");
        System.out.println("                [1] Adicionar um novo livro               ");
        System.out.println("                [2] Remover um livro                      ");
        System.out.println("                [3] Pesquisar um livro                    ");
        System.out.println("                [4] Listar estoque                        \n");
        System.out.println("==========================================================");
        System.out.println();
        System.out.println();
        System.out.println("Sua escolha: ");
    }

    public void adicionarLivro(){
        Integer opGenero;
        Integer opEditora;

        System.out.println("==========================================================\n");
        System.out.println("                 [Adicionar um novo Livro]                \n");
        System.out.println("==========================================================");
        System.out.println();
        System.out.println("                  Insira o titulo do livro:               \n");
        System.out.println("Titulo: ");
        tituloLivro = scanner.next();
        System.out.println("                  Insira o autor do livro:                \n");
        System.out.println("Autor: ");
        autorLivro = scanner.next();
        System.out.println("                Selecione o genero do livro:              \n");
        System.out.println("Genero: ");
        listaGenero();
        opGenero = scanner.nextInt();
        switch (opGenero){
            case 1:
            generoLivro = "Romance";
            break;
            case 2:
            generoLivro = "Infantil";
            break;
            case 3:
            generoLivro = "Ficcao";
            break;
            case 4:
            generoLivro = "Suspense";
            break;
            case 5:
            generoLivro = "Biografia";
            break;
            default:
            System.out.println("Opçao invalida, retornando ao menu...");
            //Adicionar sleep 2 seg
        }
        System.out.println("                Selecione a editora do livro:              \n");
        System.out.println("Editora: ");
        listaEditora();
        opEditora = scanner.nextInt();
        switch (opEditora){
            case 1:
            editoraLivro = "Companhia das Letras";
            break;
            case 2:
            editoraLivro = "Infantil";
            break;
            case 3:
            editoraLivro = "Ficcao";
            break;
            case 4:
            editoraLivro = "Suspense";
            break;
            case 5:
            editoraLivro = "Biografia";
            break;
            default:
            System.out.println("Opçao invalida, retornando ao menu...");
            //Adicionar sleep 2 seg
        }

    }

    public void listaEditora(){
        System.out.println("Editoras Disponiveis:");
        System.out.println();

        for (String editora : editoras) {
            System.out.println(editora);
        }
        System.out.println();
    }

    public void listaGenero(){
        System.out.println("Generos Disponiveis:");
        System.out.println();

        for (String genero : generos) {
            System.out.println(genero);
        }

        System.out.println();
    }

    public String getTituloLivro() {
        return tituloLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }
}