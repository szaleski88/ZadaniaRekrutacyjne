import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie13.Zadanie13;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Zadanie13Test {

    private Zadanie13 sut;

    static int[][] inputArrays = {
            {1,2,3,2},
            {1,2,4,5,4,2,7,2},
            {7,8,8,9},
            {2,2,1,1},
            {1},
            {},
            null
    };

    @Test
    @Parameters({
            "0, 2",
            "1, 2",
            "2,8",
            "3,2",
    })

    public void checkPoistion(int index, int result ) {
        sut = new Zadanie13();
        assertEquals(result, sut.findFirstDuplicate2(inputArrays[index]));
    }


    @Test(expected = IllegalArgumentException.class)
    public void checkError() {
        sut = new Zadanie13();
        sut.findFirstDuplicate2(new int[]{1, 2, 3});
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"4", "5", "6"})
    public void checkErrors(int index){
        sut = new Zadanie13();
        sut.findFirstDuplicate2(inputArrays[index]);
    }

}