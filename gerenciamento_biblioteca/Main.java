import modelos.*;
import util.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

        

    public static void main(String[] args) {
        Interface menu = new Interface();
        String titulo = menu.getTituloLivro();
        String autor = menu.getAutorLivro();
        String genero = menu.getGeneroLivro();
        String editora = menu.getEditoraLivro();
        boolean menuLoop = true;
        Integer opMenu  = 0;
        
        do{
            menu.imprimirMenu();
            opMenu = scanner.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (opMenu){
                case 1:
                menu.adicionarLivro();
                Livro novoLivro = new Livro(titulo, autor, genero, editora);
            }
            menuLoop = false;

        }while(menuLoop);

    }
}
