package Laboratorio1.Reto4;

import java.util.*;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        List<Elemento> elementosHashTable = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashtable;

        hashtable = hashUtils.listElementsToHashTable(elementosHashTable);

        Map<String,Integer> hashCombine = hashUtils.combineHashMapAndHashTable(hashMap,hashtable);

        hashCombine.forEach((key, value) -> System.out.printf("Clave: %-10s | Valor: %d%n", key, value));

    }
}

