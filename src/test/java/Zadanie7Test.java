import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie7.Zadanie7;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class Zadanie7Test {

    private Zadanie7 sut;

    @Test
    @Parameters({
        "4,100",
        "10,1010",
        "22,10110",
        "127, 1111111",
            "128, 10000000",
            "59, 111011",
            "6, 110",
            "13 , 1101",
            "999999999 , 111011100110101100100111111111"
    })

    public void checkPositive(int input, String output ) {
        assertEquals(output, sut.getBinary(input));
    }

}