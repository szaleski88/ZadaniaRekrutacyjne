import GeneralFunctions.GeneralFunctions;
import zadanie1.Zadanie1;
import zadanie2.Zadanie2;
import zadanie3.Zadanie3;

public class ZadaniaMain {

    public static void main(String[] args) {

//        zadanie1();
//        zadanie2();
        zadanie3();


    }

    private static void zadanie3() {
//        Zadanie3.sum(""+Integer.MAX_VALUE, "12");
        Zadanie3.sum("2147483641", "12");
    }

    private static void zadanie2() {
        int[] array = new int[]{1, 3, 3, 5, 5, 5, 7, 9, 2, 8, 10, 10, 12, 0, 3};
        Zadanie2 zad2 = new Zadanie2(array);
        GeneralFunctions.printArray(array);
        GeneralFunctions.printArray(zad2.getIndexes());
    }

    private static void zadanie1() {
        Zadanie1 zad1 = new Zadanie1(new int[]{1,3,4,5}, 2);
        System.out.println(2 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{2,3,5}, 4);
        System.out.println(4 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{1,3}, 0);
        System.out.println(0 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{1,3}, 3);
        System.out.println(3 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{2}, 3);
        System.out.println(3 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{}, 3);
        System.out.println(3 + ": " + zad1.getIndex());

        zad1 = new Zadanie1(new int[]{-3, -2, 0}, 1);
        System.out.println(1 + ": " + zad1.getIndex());

    }
}
