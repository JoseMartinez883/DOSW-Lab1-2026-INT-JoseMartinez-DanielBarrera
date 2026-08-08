package org.example.reto02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Lista 1: ");
        String nums1 = sc.nextLine();
        System.out.print("Lista 2: ");
        String nums2 = sc.nextLine();

        Function<String,List<Integer>> stringToIntegerList = numsText ->
                List.of(numsText.replace("[","").replace("]","").split(","))
                        .stream().map(String::trim)
                        .map(numString -> Integer.parseInt(numString))
                        .collect(Collectors.toCollection(ArrayList::new));

        List<Integer> numsList1 = stringToIntegerList.apply(nums1);
        List<Integer> numsList2 = stringToIntegerList.apply(nums2);

        List<Resultado> resultAnalysis = IntegerListUtils.ListsInformation(numsList1,numsList2);

        System.out.println("Lista 1 => " + resultAnalysis.getFirst().toString());
        System.out.println("Lista 2 => " + resultAnalysis.getLast().toString());

        sc.close();
    }

}