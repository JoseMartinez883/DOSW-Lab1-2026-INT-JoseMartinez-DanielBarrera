package Laboratorio1.Reto4;

import java.util.*;
import java.util.stream.Collectors;

public class hashUtils {

    public static Map<String,Integer> listElementsToHashMap(List<Elemento> elements){

        Map<String,Integer> mapElements = elements.stream()
                .collect(Collectors.toMap(
                        Elemento::getElement,
                        Elemento::getValue,
                        (existente,nuevo) -> existente
                ));
        return mapElements;
    }

    public static Hashtable<String, Integer> listElementsToHashTable(List<Elemento> elementos) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        elementos.stream()
                .forEach(elemento -> hashtable.put(elemento.getElement(), elemento.getValue()));
        return hashtable;
    }

    public static Map<String, Integer> combineHashMapAndHashTable(HashMap<String, Integer> hashMap, Hashtable<String, Integer> hashtable) {

        Map<String, Integer> combinado = new HashMap<>(hashMap);
        combinado.putAll(hashtable);

        return combinado.entrySet().stream()
                .map(entry -> Map.entry(entry.getKey().toUpperCase(), entry.getValue()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (existente, nuevo) -> existente,
                        LinkedHashMap::new
                ));
    }

}