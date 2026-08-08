package Laboratorio1.Reto5;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetUtils {

    public static Set<Integer> removeMultipliesOfThree(HashSet<Integer> integerHashSet){
        return integerHashSet.stream().filter(num -> num % 3 != 0).collect(Collectors.toCollection(HashSet::new));
    }

    public static Set<Integer> removeMultipliesOfFive(TreeSet<Integer> integerHashSet){
        return integerHashSet.stream().filter(num -> num % 5 != 0).collect(Collectors.toCollection(TreeSet::new));
    }

    public static Set<Integer> bindTreeSetAndHashSet(HashSet<Integer> integerHashSet, TreeSet<Integer> integerTreeSet){
        Set<Integer> hashSet = removeMultipliesOfThree(integerHashSet);
        Set<Integer> treeSet = removeMultipliesOfFive(integerTreeSet);
        treeSet.addAll(hashSet);
        return treeSet;
    }
}
