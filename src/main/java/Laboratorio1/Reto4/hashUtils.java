package Laboratorio1.Reto4;

import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashUtils {
    public static Hashtable<String, Integer> listElementsToHashTable(List<Elemento> elementos) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        elementos.stream()
                .forEach(elemento -> hashtable.put(elemento.getElement(), elemento.getValue()));
        return hashtable;
    }

    public static Map<String, Integer> combineHashMapAndHashTable(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashtable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashtable);
        return combinado;
    }
}
