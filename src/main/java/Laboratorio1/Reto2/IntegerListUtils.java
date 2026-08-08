package Laboratorio1.Reto2;

import java.util.List;
import java.util.function.Function;

public class IntegerListUtils {

    public static Integer findMinElement(List<Integer> list){
        return list.stream().reduce((a,b) -> Integer.min(a,b)).orElse(0);
    }

    public static Integer amountElements(List<Integer> list){
        return (Integer) (int) list.stream().count();
    }

    public static Integer findMaxElement(List<Integer> list){
        return  list.stream().reduce((a, b) -> Integer.max(a,b)).orElse(0);
    }

    public static List<Integer> listAnalysis(List<Integer> list) {
        return List.of(
                findMaxElement(list),
                findMinElement(list),
                amountElements(list)
        );
    }

    public static Integer maxIsDivideTwo(List<Integer> list){
        Integer max = findMaxElement(list);
        Function<Integer,Integer> maxIsDivisorByTwo = num -> num % 2 == 0 ? 1 : -1;
        return maxIsDivisorByTwo.apply(max);
    }

    public static Integer maxIsMultiplyTwo(List<Integer> list){
        Integer max = findMaxElement(list);
        Function<Integer,Integer> maxIsPair = num -> num % 2 == 0 ? 1 : -1;
        return maxIsPair.apply(max);
    }

    public static List<Resultado> ListsInformation(List<Integer> list1, List<Integer> list2){

        List<Integer> listAnalysis1 = new ArrayList<>(listAnalysis(list1));
        listAnalysis1.add(maxIsMultiplyTwo(list1));

        listAnalysis1.add(amountListIsPair(list1));

        List<Integer> listAnalysis2 = new ArrayList<>(listAnalysis(list2));
        listAnalysis2.add(maxIsMultiplyTwo(list2));

        listAnalysis2.add(amountListIsPair(list2));

        return List.of(new Resultado(listAnalysis1), new Resultado(listAnalysis2));
    }

}
