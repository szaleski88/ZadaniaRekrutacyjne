
import GeneralFunctions.GeneralFunctions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import zadanie1.Zadanie1;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)

public class Zadanie1Test {

    private Zadanie1 sut;

    @Test
    @Parameters({
            "1, 1",
            "0, 0",
            "4, 3"
    })
    public void checkIndex(int x, int expected) {
        int[] array = new int[]{1, 2, 3};
        sut = new Zadanie1(array, x);
        int result = sut.getIndex();

        System.out.println(x + ": " + result);
        assertEquals(expected, result);
    }


    @Test
    public void checkIndex1() {
        int inputNumber = 2;
        sut = new Zadanie1(new int[]{1, 2, 3}, inputNumber);
        int result = sut.getIndex();

        System.out.println(inputNumber + ": " + result);
        assertEquals(2, result);
    }

    @Test
    public void checkIndex2() {
        int inputNumber = 2;
        sut = new Zadanie1(new int[]{1, 1, 1}, inputNumber);
        int result = sut.getIndex();
        System.out.println(inputNumber + ": " + result);
        assertEquals(3, result);
    }

    @Test
    public void checkIndex3() {
        int inputNumber = 0;
        sut = new Zadanie1(new int[]{1, 2, 3}, inputNumber);
        int result = sut.getIndex();

        System.out.println(inputNumber + ": " + result);
        assertEquals(0, result);
    }

    @Test
    public void checkIndex4() {
        int inputNumber = 3;
        sut = new Zadanie1(new int[]{1, 2, 4}, inputNumber);
        int result = sut.getIndex();
        System.out.println(inputNumber + ": " + result);
        assertEquals(2,result);
    }

    @Test
    public void checkIndex5() {
        int inputNumber = 3;
        sut = new Zadanie1(new int[0], inputNumber);
        int result = sut.getIndex();
        System.out.println(inputNumber + ": " + result);
        assertEquals(0, result);
    }

    @Test
    public void checkIndex6() {
        int inputNumber = -1;
        sut = new Zadanie1(new int[]{-3, -2, 0}, inputNumber);
        int result = sut.getIndex();
        System.out.println(inputNumber + ": " + result);
        assertEquals(2, result);
    }

}