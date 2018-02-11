package zadanie2;

import GeneralFunctions.GeneralFunctions;

public class Zadanie2 {

    private static int[] array;

    public Zadanie2(int[] array) {
        this.array = array;
        GeneralFunctions.printArray(array);
    }

    private int[] addElement(int[] array, int element){
        int[] temp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[temp.length - 1] = element;
        return temp;
    }

    public int[] getIndexes() {
        int[] result = new int[0];
        if(array.length < 3 ) { return result; }

        for (int i = 1; i < array.length-1 ; i++) {
            if(array[i] == array[i-1] + 2 && array[i+1] % 3 == 0){
                result = addElement(result, i);
            }
        }
        return result;
    }
}
