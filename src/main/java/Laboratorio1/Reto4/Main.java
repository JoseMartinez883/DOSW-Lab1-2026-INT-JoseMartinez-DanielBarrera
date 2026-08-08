package Laboratorio1.Reto4;

import java.util.*;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, Elemento> stringToElemento = string -> {
            List<String> elementsString = List.of(string.split(":"));
            return new Elemento(elementsString.getFirst().trim(), Integer.parseInt(elementsString.getLast().trim()));
        };


        String element = "";
        Scanner sc = new Scanner(System.in);

        List<Elemento> elementoHashMap = new ArrayList<>();
        System.out.println("HasMap:");
        while (true){
            element = sc.nextLine();
            if(!element.isEmpty()){
                elementoHashMap.add(stringToElemento.apply(element));
            } else {
                break;
            }
        }

        List<Elemento> elementosHashTable = new ArrayList<>();
        System.out.println("Hashtable:");
        while (true){
            element = sc.nextLine();

            if(!element.isEmpty()){
                elementosHashTable.add(stringToElemento.apply(element));
            } else {
                break;
            }
        }


        HashMap<String, Integer> hashMap = new HashMap<>();
        Hashtable<String, Integer> hashtable;
        hashMap = new HashMap<>(hashUtils.listElementsToHashMap(elementoHashMap));
        hashtable = new Hashtable<>(hashUtils.listElementsToHashTable(elementosHashTable));

        Map<String,Integer> hashCombine = hashUtils.combineHashMapAndHashTable(hashMap,hashtable);

        hashCombine.forEach((key, value) -> System.out.printf("Clave: %-10s | Valor: %d%n", key, value));
        sc.close();
    }

}