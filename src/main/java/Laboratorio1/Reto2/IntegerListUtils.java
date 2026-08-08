package Laboratorio1.Reto2;

import java.util.List;

public class IntegerListUtils {

    public static Integer findMaxElement(List<Integer> list){
        return  list.stream().reduce((a, b) -> Integer.max(a,b)).orElse(0);
    }

    public static List<Integer> listAnalysis(List<Integer> list) {
        return List.of(
                findMaxElement(list)
        );
    }


}
