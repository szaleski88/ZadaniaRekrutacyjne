import GeneralFunctions.GeneralFunctions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie4.Zadanie4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class Zadanie4Test {

    private Zadanie4 sut;
    static int[][][] inputArrays = {
            {
                    {1, 2, 4, 7},
                          {9, 8},
                       {2, 4, 7}
            },
            {
                    {0, 1},
                       {1},
                 {2, 3, 4}
            },
            {
                    {0, 9},
                    {9, 1}
            },
            {
                    {9,9,9}, //1
                    {9,9,9}, //2
                    {9,9,9}, //3
                    {9,9,9}, //4
                    {9,9,9}, //5
                    {9,9,9}, //6
                    {9,9,9}, //7
                    {9,9,9}, //8
                    {9,9,9}, //9
                    {9,9,9}, //10
                    {9,9,9}, //11
                    {9,9,9}, //12
                    {9,9,9}, //13
                    {9,9,9}, //14
                    {9,9,9}, //15
                    {9,9,9}, //16
                    {9,9,9}, //17
                    {9,9,9}, //18
                    {9,9,9}, //19
                    {9,9,9}, //20

            }
    };
    static int[][] outputArrays = {
            {1,5,9,2},
            {2,3,6},
            {1,0,0},
            {1,9,9,8,0}
    };


    @Test

    public void sum1( ) {
        for (int i = 0; i < 4; i++) {
            Assert.assertArrayEquals(outputArrays[i], sut.returnSum(inputArrays[i]));
        }
    }

}