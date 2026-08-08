package Laboratorio1.Reto5;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Function<String, Set<Integer>> stringToSet = elements -> List.of(elements.trim().split(","))
                .stream()
                .map(strNum -> strNum.replace("[",""))
                .map(strNum -> strNum.replace("]",""))
                .map(strNum -> strNum.trim())
                .map(strNum -> Integer.parseInt(strNum))
                .collect(Collectors.toSet());

        System.out.print("HashSet: ");
        String elementos = sc.nextLine();
        HashSet<Integer> integerHashSet = new HashSet<>(stringToSet.apply(elementos));

        System.out.print("TreeSet: ");
        elementos = sc.nextLine();
        TreeSet<Integer> integerTreeSet = new TreeSet<>(stringToSet.apply(elementos));

        Set<Integer> setFiltered = SetUtils.bindTreeSetAndHashSet(integerHashSet,integerTreeSet);

        setFiltered.forEach(num -> System.out.println("Numero en arena: " + num));
        sc.close();
    }

}
