package zadanie12;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Zadanie12 {

    public static void main(String[] args) {
        int[] first = new int[] {1,2,3,4,5};
        int[] second = new int[] {0,2,7,4,8};
        Zadanie12 zadanie12 = new Zadanie12(first, second);
    }

    public Zadanie12(int[] first, int[] second) {
        System.out.println(Arrays.stream(first)
                                 .boxed()
                                 .filter(value -> Arrays.stream(second).boxed().collect(Collectors.toList()).contains(value))
                                 .collect(Collectors.toList()));
    }
}
