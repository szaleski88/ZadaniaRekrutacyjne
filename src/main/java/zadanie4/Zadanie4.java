package zadanie4;

public class Zadanie4 {

    private static int[] result;

    public static int[] returnSum(int[][] matrix){
        int maxSize = getMaxSize(matrix);
        result = new int[maxSize];
        sumAllRows(matrix, maxSize);
        moveValueOften();
        return result;
    }

    private static void moveValueOften() {
        for (int i = result.length - 1; i > 0  ; i--) {
            if(result[i] >= 10) {
                int toMove = result[i] / 10;
                result[i] = result[i]%10;
                result[i-1] = result[i-1]+toMove;
            }
        }

        if (result[0] >= 10 ) {
            // RECURSIVE!!!!!!!
            int[] temp = new int[result.length + 1];
            for (int i = 0; i < result.length  ; i++) {
                temp[temp.length - i - 1] = result[result.length -1 - i ];
            }
            result = temp;
            moveValueOften();
        }

    }

    private static void sumAllRows(int[][] matrix, int maxSize) {
        for (int i = 0; i < matrix.length ; i++) {
                int counter = 0;
                for (int j = matrix[i].length - 1; j >= 0 ; j--) {
                    result[maxSize - counter - 1] += matrix[i][j];
                    counter++;
            }
        }
    }

    private static int getMaxSize(int[][] matrix) {
        int maxSize = 0;
        for (int[] subArray: matrix) {
            if (subArray.length > maxSize){
                maxSize = subArray.length;
            }
        }
        return maxSize;
    }
}
