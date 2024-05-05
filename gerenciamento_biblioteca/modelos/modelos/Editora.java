package modelos;

import java.util.ArrayList;
import java.util.List;

public class Editora {
    private static List<String> nomeEditora;

    static {
        nomeEditora = new ArrayList<>();
        nomeEditora.add("Companhia das Letras");
        nomeEditora.add("Record");
        nomeEditora.add("Intrínseca");
        nomeEditora.add("Sextante");
        nomeEditora.add("Globo Livros");
    }

    public static List<String> getEditora(){
        return nomeEditora;
    }
}
