//import junitparams.JUnitParamsRunner;
//import junitparams.Parameters;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import zadanie8.Zadanie8;
//import zadanie9.Zadanie9;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(JUnitParamsRunner.class)
//public class Zadanie9Test {
//
//    private Zadanie9 sut = new Zadanie9();
//
//    static int[][][] inputArrays = {{
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    },
//            {
//                    {1, 2, 3, 4, 5, 6,
//                    16, 17, 18, 19, 20, 7,
//                    15, 24, 23, 22, 21, 8,
//                    14, 13, 12, 11, 10, 9
//                    }
//            }
//
//    };
//
//    static int[][] outputArrays = {
//            { 1,2,3,6,9,8,7,4,5},
//            {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24}
//    };
//
//    @Test
//    @Parameters({
//            "0, 2",
//            "1, -1",
//            "2, 3",
//            "3, -1",
//            "4, -1",
//            "5, -1",
//            "6, -1"
//    })
//
//    public void checkPoistion(int index, int output ) {
////        int result = sut.getSnake(inputArrays[index]);
////        assertEquals(output, result);
//    }
//
//}