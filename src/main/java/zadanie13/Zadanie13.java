package zadanie13;

import java.util.*;

public class Zadanie13 {

    public static void main(String[] args) {
        Zadanie13 z = new Zadanie13();
        System.out.println(z.findFirstDuplicate(new int[]{2,2,1,1}));
    }


    public int findFirstDuplicate(int[] inputArray) throws IllegalArgumentException {
        if(inputArray == null || inputArray.length <= 1){
            throw new IllegalArgumentException("Input empty or too short.");
        }
        Map<Integer, Integer> elements = new HashMap<>();
        for (int value : inputArray) {
            if (!elements.containsKey(value)) {
                elements.put(value, 1);
            } else {
                elements.put(value, elements.get(value) + 1);
            }
        }
        for (int value : inputArray) {
            if (elements.get(value) > 1) {
                return value;
            }
        }
        throw new IllegalArgumentException("Cannot find duplicate!");
    }

    public int findFirstDuplicate2(int[] inputArray) throws IllegalArgumentException {
        if(inputArray == null || inputArray.length <= 1){
            throw new IllegalArgumentException("Input empty or too short.");
        }

        Set<Integer> uniqueValues = new HashSet<>();
        int lastIndex = inputArray.length;
        for (int i = inputArray.length-1; i >= 0 ; i--) {
            if(!uniqueValues.add(inputArray[i])) {
                lastIndex = i;
            }
        }
        if(lastIndex != inputArray.length){
            System.out.println(lastIndex);
            return inputArray[lastIndex];
        }else {
            throw new IllegalArgumentException("Cannot find duplicate!");
        }
    }

}
