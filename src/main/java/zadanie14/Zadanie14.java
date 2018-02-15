package zadanie14;


import javafx.util.Pair;

import java.util.Arrays;

public class Zadanie14 {

    public int[] findBiggestTwo1(int[] inputArray){
        if (inputArray.length < 2){
            return null;
        }
        if(inputArray.length == 2){
            return inputArray;
        }
        Arrays.sort(inputArray);
        return new int[]{inputArray.length-1, inputArray.length-2};
    }

    public int[] findBiggestTwo2(int[] inputArray){


        Pair<Integer, Integer> pairs = new Pair<>(inputArray[0], inputArray[1]);
        return null;
    }

}
