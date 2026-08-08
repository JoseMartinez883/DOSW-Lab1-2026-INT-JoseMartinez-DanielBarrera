package Laboratorio1.reto4;

import Laboratorio1.Reto4.Elemento;
import Laboratorio1.Reto4.hashUtils;

import java.util.*;
import java.util.function.Function;

public class Main {

    List<Elemento> elementosHashTable = new ArrayList<>();
    HashMap<String, Integer> hashMap = new HashMap<>();
    Hashtable<String, Integer> hashtable = new Hashtable<>();
    // hashMap = new HashMap<>(hashUtils.listElementsToHashMap(elementoHashMap));
    hashtable = new Hashtable<>(hashUtils.listElementsToHashTable(elementosHashTable));

    Map<String,Integer> hashCombine = hashUtils.combineHashMapAndHashTable(hashMap,hashtable);

        hashCombine.forEach((key, value) -> System.out.printf("Clave: %-10s | Valor: %d%n", key, value));

}