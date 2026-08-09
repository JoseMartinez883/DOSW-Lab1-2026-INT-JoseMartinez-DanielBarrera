package Laboratorio1.Reto4;

import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Collectors;

public class hashUtils {

    public static Hashtable<String, Integer> listElementsToHashTable(List<Elemento> elementos) {
        return elementos.stream()
                .collect(Collectors.toMap(
                        Elemento::getElement,
                        Elemento::getValue,
                        (existente, nuevo) -> existente,
                        Hashtable::new
                ));
    }

    public static Map<String, Integer> combineHashMapAndHashTable(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashtable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashtable);
        return combinado;
    }
}
