package zadanie3;

import GeneralFunctions.GeneralFunctions;

public class Zadanie3 {

    private static String[] result;

    public static String sum(String first, String second){

        String[][] inputValue = new String[][]{first.split(""), second.split("")};
//        int maxSize = Math.max(first.length(), second.length());
        int maxSize = getMaxSize(first,second);
        result = new String[maxSize];
        fillWithStringZeros();
        sumAllRows(inputValue, maxSize);

        GeneralFunctions.printArray(result);

        moveTen();
        return joinResultToString();
    }

    private static int getMaxSize(String first, String second) {
        if (first.length() > second.length()) {
            return first.length();
        }
        return second.length();
    }

    private static void fillWithStringZeros() {
        for (int i = 0; i < result.length; i++) {
            result[i] = "0";
        }
    }

    private static String joinResultToString() {
        StringBuilder str = new StringBuilder("");
        for (String val : result){
            str.append(val);
        }
        return str.toString();
    }

    private static void moveTen() {
        for (int i = result.length - 1; i > 0  ; i--) {
            int currentValue = Integer.parseInt(result[i]);
            // next is previous - different direction
            int nextValue = Integer.parseInt(result[i-1]);
            if(currentValue >= 10) {
                int toMove = currentValue / 10;
                result[i] = "" + currentValue%10;
                result[i-1] = "" + (nextValue + toMove);
            }
        }

        int firstValue = Integer.parseInt(result[0]);
        if (firstValue >= 10 ) {
            // RECURSIVE!!!!!!!
            String[] temp = new String[result.length + 1];
            temp[0] = "0";
            for (int i = 0; i < result.length  ; i++) {
                temp[temp.length - i - 1] = result[result.length -1 - i ];
            }
            result = temp;
            moveTen();
        }
    }

    private static void sumAllRows(String[][] matrix, int maxSize) {
        for (int i = 0; i < matrix.length ; i++) {
            int counter = 0;
            for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                int currentResultValue = Integer.parseInt(result[maxSize - counter - 1]);
                int currentValueInput = Integer.parseInt(matrix[i][j]);
                result[maxSize - counter - 1] = "" + (currentResultValue + currentValueInput);
                counter++;
            }
        }
    }
}
