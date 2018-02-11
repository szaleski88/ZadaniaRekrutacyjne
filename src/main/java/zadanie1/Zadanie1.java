package zadanie1;

import GeneralFunctions.GeneralFunctions;

import java.util.Arrays;

public class Zadanie1 {

    private static int[] array;
    private static int number;


    public Zadanie1(int[] inputArray, int inputNumber) {
        Arrays.sort(inputArray);
        array = inputArray;
        number = inputNumber;
        GeneralFunctions.printArray(array);
    }

    public static int getIndex() {
        if (array.length == 0 ){ return 0; }

        int index = 0;
        if(number < array[0]){
            return 0;
        } else if ( number >  array[array.length-1]) {
            return array.length;
        }

        for (int i = 0; i < array.length-1 ; i++) {
            if( array[i] < number && array[i+1] > number) {
                index++;
                return index;
            }

            else if (array[i] == number && array[i+1] > number ){
                return i+1;
            }
            else{
                index++;
            }
        }

        return index;
    }
}
