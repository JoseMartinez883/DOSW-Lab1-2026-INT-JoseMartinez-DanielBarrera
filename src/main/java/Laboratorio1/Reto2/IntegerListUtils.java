package Laboratorio1.Reto2;

import java.util.ArrayList;
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

    public static List<Resultado> ListsInformation(List<Integer> list1, List<Integer> list2){

        List<Integer> listAnalysis1 = new ArrayList<>(listAnalysis(list1));
        listAnalysis1.add(maxIsDivideTwo(list1));

        List<Integer> listAnalysis2 = new ArrayList<>(listAnalysis(list2));
        listAnalysis2.add(maxIsDivideTwo(list2));

        return List.of(new Resultado(listAnalysis1), new Resultado(listAnalysis2));
    }
}
