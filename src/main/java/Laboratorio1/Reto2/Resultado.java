package Laboratorio1.Reto2;

import java.util.List;
import java.util.function.Function;

public class Resultado {

    private int max;
    private int min;
    private int amountElements;
    private int maxIsDivideTwo;
    private int maxIsMultiplyTwo;
    private int amountListIsPair;

    public Resultado() {
    }

    public Resultado(List<Integer> integerList) {
        max = integerList.get(0);
        min = integerList.get(1);
        amountElements = integerList.get(2);
        maxIsMultiplyTwo = integerList.get(3);
        maxIsDivideTwo = integerList.get(4);
        amountListIsPair = integerList.get(5);
    }

    Function<Integer,String> isTrue = num -> num == -1 ? "No" : "Si";
    Function<Integer,String> AmountIsPair = num -> num == 1 ? "par" : "impar";

    @Override
    public String toString() {
        return "max:" + max + " min:" + min + " cant:" + amountElements + "\n"
                + "   ¿" + max + " multiplo de 2? " + isTrue.apply(maxIsMultiplyTwo) + "\n"
                + "   ¿" + max + " divisible entre 2? " + isTrue.apply(maxIsDivideTwo) + "\n"
                + "   ¿Cantidad (" + amountElements + ") es "+ AmountIsPair.apply(amountListIsPair) + "? " + "Si";
    }
}
