import GeneralFunctions.GeneralFunctions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie8.Zadanie8;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Zadanie8Test {

    private Zadanie8 sut = new Zadanie8();

    static int[][] inputArrays = {
                    {1, 2, 3, 2, 1},
                    {1, 3, 3, 3, 1},
                    {1, 3, 1, 4, 1},
            {2,3},
            {},
            null,
            {2,2,2},
            {1,2,3,4,5},
            {3,1,3,1,3},
            {-1,-3,-2,0,-1},
            {5,5,1,2,5,1}
    };

    @Test
    @Parameters({
            "0, 2",
            "1, -1",
            "2, 3",
            "3, 1",
            "4, -1",
            "5, -1",
            "6, -1",
            "7, 4",
            "8, 0",
            "9, 3",
            "10, 4"
    })

    public void checkPoistion(int index, int output ) {
        int result = sut.getPosition(inputArrays[index]);
        assertEquals(output, result);
    }



}