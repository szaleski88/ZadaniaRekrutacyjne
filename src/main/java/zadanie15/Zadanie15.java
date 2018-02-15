package zadanie15;

import GeneralFunctions.GeneralFunctions;

import java.util.*;

public class Zadanie15 {


    public static void main(String[] args) {
        Zadanie15 z15 = new Zadanie15();
        z15.findFirstThatCannotBeCreated(new Integer[]{1,2,15,5,13,4,17});
    }

    private Integer[] array;
    private static Set<Integer> setOfSums = new HashSet<>();
    private static int currentValue = 1;


    public int findFirstThatCannotBeCreated(Integer[] inputArray){
        Arrays.sort(inputArray);
        array = inputArray;
        if(currentValue < array[0]){
            return currentValue;
        }
        currentValue = array[0];
        getAllSums(array, 0  ,0 );


        for (int i = currentValue; ; i++) {
            if (!setOfSums.contains(i)){
                GeneralFunctions.printArray(array);
                System.out.println("Answer is: " + i);
                return i;
            }
        }
    }


    private static void getAllSums(Integer[] array, int startingValue, int pos)
    {
        for (int i = pos; i < array.length; i++)
        {
            int currentValue = startingValue + array[i];
            setOfSums.add(currentValue);
            getAllSums(array, currentValue, i + 1);
        }
    }

}
