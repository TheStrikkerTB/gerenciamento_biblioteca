package modelos;

import java.util.ArrayList;
import java.util.List;

public class Genero {
    private static List<String> nomeGenero;

    static {
        nomeGenero = new ArrayList<>();
        nomeGenero.add("Romance");
        nomeGenero.add("Infantil");
        nomeGenero.add("Ficção");
        nomeGenero.add("Suspense");
        nomeGenero.add("Biografia");
    }

    public static List<String> getGenero(){
        return nomeGenero;
    }
}

