import modelos.*;
import util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Interface menu = new Interface();

        boolean menuLoop = true;
        Integer opMenu  = 0;

        String nomeAutor;
        String tituloLivro;
        Genero nomeGenero = new Genero();
        
        do{
            menu.imprimirMenu();
            opMenu = scanner.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (opMenu){
                case 1:
                menu.adicionarLivro();
                System.out.println("Insira o titulo do livro:");
                tituloLivro = scanner.next();
                System.out.println();
                System.out.println("Insira o nome do autor:");
                nomeAutor = scanner.next();
                System.out.println();
                System.out.println("Selecione o genero do livro:");
                menu.listaGenero(nomeGenero);
            }
            menuLoop = false;

        }while(menuLoop);

    }
}
