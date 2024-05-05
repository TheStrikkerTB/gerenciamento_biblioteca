package util;

import java.util.ArrayList;

import modelos.*;

public class Interface{

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
        System.out.println("==========================================================\n");
        System.out.println("                 [Adicionar um novo Livro]                \n");
        System.out.println("==========================================================");
        System.out.println();
    }

    public void listaEditora(){

    }

    public void imprimirGenero(){

    }

    public void listaGenero(){
        for(int i = 0; i < nomeGenero.size(); i++){
            System.out.println(nomeGenero.get(i)+ "\n");
        }
    }
}