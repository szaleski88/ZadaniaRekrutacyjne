import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie5.Zadanie5;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class Zadanie5Test {

    @Test
    @Parameters({
        "MRRRRZZSDAAAA, MR;4;Z;2;SDA;4;",
            "AAAAABBCCCDDDD, A;5;B;2;C;3;D;4;",
            "AB, AB;1;",
            "abcd, abcd;1;",
            ","
    })

    public void sum1(String input, String output ) {
        assertEquals(output, Zadanie5.rle(input));
    }


    @Test
    public void nullOnInput() {
        assertEquals("", Zadanie5.rle(null));
    }
}