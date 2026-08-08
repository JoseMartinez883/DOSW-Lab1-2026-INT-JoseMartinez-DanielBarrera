package Laboratorio1.Reto2;

import java.util.List;
import java.util.function.Function;

public class IntegerListUtils {

    public static Integer findMaxElement(List<Integer> list){
        return  list.stream().reduce((a, b) -> Integer.max(a,b)).orElse(0);
    }

    public static List<Integer> listAnalysis(List<Integer> list) {
        return List.of(
                findMaxElement(list)
        );
    }

    public static Integer maxIsDivideTwo(List<Integer> list){
        Integer max = findMaxElement(list);
        Function<Integer,Integer> maxIsDivisorByTwo = num -> num % 2 == 0 ? 1 : -1;
        return maxIsDivisorByTwo.apply(max);
    }

}
