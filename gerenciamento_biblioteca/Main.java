import modelos.*;
import util.*;

import java.util.Scanner;

/*Faz um loop para imprimir o menu enquanto o usuário não selecionar a opção de sair ou o programa finalizar
Recebe os valores inseridos pelo usuário na classe interface para adicionar livros e chama o construtor para ser enviado ao arraylist da classe Biblioteca
*/

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Interface user = new Interface();
        Biblioteca biblioteca = new Biblioteca();
        boolean menuLoop = true;
        Integer opMenu;

        do{
            user.Flush();
            user.imprimirMenu();
            opMenu = scanner.nextInt();
            user.Flush();
            switch (opMenu){
                case 1:
                user.adicionarLivro();
                String titulo = user.get_tituloLivro();
                Autor autor = user.get_autorLivro();
                Genero genero = user.get_generoLivro();
                Editora editora = user.get_editoraLivro();

                Livro novoLivro = new Livro(titulo, autor, genero, editora);
                user.Flush();
                biblioteca.addLivros(novoLivro);
                break;
                case 2:
                menuLoop = false;
                break;
                case 4:
                biblioteca.imprimirLivros();
                break;
            }

        }while(menuLoop);

    }
}
