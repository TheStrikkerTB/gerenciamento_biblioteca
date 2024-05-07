package modelos;

import java.util.ArrayList;
import java.util.List;

public class Genero {
    private static List<String> nomeGenero;

    static {
        nomeGenero = new ArrayList<>();
        nomeGenero.add("[1] Romance");
        nomeGenero.add("[2] Infantil");
        nomeGenero.add("[3] Ficcao");
        nomeGenero.add("[4] Suspense");
        nomeGenero.add("[5] Biografia");
    }

    public static List<String> getGenero() {
        return nomeGenero;
    }

}

