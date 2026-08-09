package Laboratorio1.Reto7;

public class NumberParser {

    public static long parseFormattedString(String stringNum) {

        String str = stringNum.trim().toUpperCase();
        long multiplier = 1;

        if (str.endsWith("K")) {
            multiplier = 1000L;
            str = str.substring(0, str.length() - 1);
        } else if (str.endsWith("M")) {
            multiplier = 1000000L;
            str = str.substring(0, str.length() - 1);
        } else if (str.endsWith("B")) {
            multiplier = 1000000000L;
            str = str.substring(0, str.length() - 1);
        }

        double value = Double.parseDouble(str);
        return (long) (value * multiplier);
    }

}