package modelos;

import java.util.ArrayList;
import java.util.List;

public class Editora {
    private static List<String> nomeEditora;

    static {
        nomeEditora = new ArrayList<>();
        nomeEditora.add("[1] Companhia das Letras");
        nomeEditora.add("[2] Record");
        nomeEditora.add("[3] Intrinseca");
        nomeEditora.add("[4] Sextante");
        nomeEditora.add("[5] Globo Livros");
    }

    public static List<String> getEditora() {
        return nomeEditora;
    }

}
