package zadanie9;

/**

 * Created by Farmer on 2018-02-11.

 */

public class Zadanie9 {

    static int[][] matrtix;
    static int rows = 10;
    static int column = 5;
    static int fillingNumber = 1;
    static int counter = 0;
    static int direction = 0;
    static boolean endOffilling = false;

    public static void main(String[] args) {
        showMatrix(fillTheMatrixSpirally(rows, column));
    }

    public static int[][] fillTheMatrixSpirally(int rows, int column) {
        matrtix = new int[rows][column];
        while (!endOffilling) {
            fillTheLine(direction);
        }
        return matrtix;
    }

    public static void fillTheLine(int dir) {
        switch (dir) {
            case 0:
                endOffilling = true;
                fillRowToRight();
                direction = 1;
                counter++;
                break;
            case 1:
                endOffilling = true;
                fillColumnToDown();
                direction = 2;
                break;
            case 2:
                endOffilling = true;
                fillRowsToLeft();
                direction = 3;
                break;
            case 3:
                endOffilling = true;
                fillColumnToUp();
                direction = 0;
        }
    }

    private static void fillColumnToUp() {
        for (int i = rows - 1 - counter; i >= counter; i--) {
            matrtix[i][counter - 1] = fillingNumber;
            fillingNumber++;
            endOffilling = false;
        }
    }

    private static void fillRowsToLeft() {
        for (int i = column - 1 - counter; i >= counter - 1; i--) {
            matrtix[matrtix.length - counter][i] = fillingNumber;
            fillingNumber++;
            endOffilling = false;
        }
    }

    private static void fillColumnToDown() {
        for (int i = counter; i < rows - counter + 1; i++) {
            matrtix[i][matrtix[i].length - counter] = fillingNumber;
            fillingNumber++;
            endOffilling = false;
        }
    }

    private static void fillRowToRight() {
        for (int i = counter; i < column - counter; i++) {
            matrtix[counter][i] = fillingNumber;
            fillingNumber++;
            endOffilling = false;
        }
    }

    public static void showMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}