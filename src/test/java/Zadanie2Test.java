import GeneralFunctions.GeneralFunctions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie2.Zadanie2;

import java.util.Random;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class Zadanie2Test {

    private Zadanie2 sut;

    @Test
    public void checkIndex1() {
        int[] inputArray = new int[]{1, 3, 3, 5, 5, 5, 7, 9, 2, 8, 10, 12, 0, 3};
        sut = new Zadanie2(inputArray);
        System.out.println("input: ");
        GeneralFunctions.printArray(inputArray);
        int[] result = sut.getIndexes();
        System.out.println("result: ");
        GeneralFunctions.printArray(result);
        Assert.assertArrayEquals(new int[]{1, 6, 10, 11} , result);
    }

    @Test
    public void checkIndex2() {
        int[] inputArray = new int[]{1, 3, 3};
        sut = new Zadanie2(inputArray);
        System.out.println("input: ");
        GeneralFunctions.printArray(inputArray);
        int[] result = sut.getIndexes();
        System.out.println("result: ");
        GeneralFunctions.printArray(result);
        Assert.assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void checkIndex3() {
        int[] inputArray = new int[]{};
        sut = new Zadanie2(inputArray);
        System.out.println("input: ");
        GeneralFunctions.printArray(inputArray);
        int[] result = sut.getIndexes();
        System.out.println("result: ");
        GeneralFunctions.printArray(result);
        Assert.assertArrayEquals(new int[0], result);
    }

}