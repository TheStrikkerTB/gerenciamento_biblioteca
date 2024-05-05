package modelos;

import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private static List<String> livros;

    public void addLivros(Livro livro){
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro);
    }
    
    
}
