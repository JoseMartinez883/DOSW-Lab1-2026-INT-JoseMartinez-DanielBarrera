public class IntegerListUtils {

    public static Integer findMinElement(List<Integer> list){
        return list.stream().reduce((a,b) -> Integer.min(a,b)).orElse(0);
    }

    public static Integer amountElements(List<Integer> list){
        return (Integer) (int) list.stream().count();
    }


    public static List<Integer> listAnalysis(List<Integer> list) {
        return List.of(
                findMinElement(list),
                amountElements(list)
        );
    }
}