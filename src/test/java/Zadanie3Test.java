import GeneralFunctions.GeneralFunctions;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie3.Zadanie3;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class Zadanie3Test {

    @Test
    @Parameters({
            "10, 2, 12",
            "0, 0, 0",
            "1123, 456, 1579",
            "1, 999, 1000",
            "999, 1, 1000",
            "100, 1, 101",
            "6161, 1909, 8070",
            "6161, 1909, 8070",
            "515151, 1616161, 2131312",
            "100, 11, 111",
            "9999999999999999999999999999, 1, 10000000000000000000000000000",
            "99999999999999999999999999999999999999999999999999999999, 1, 100000000000000000000000000000000000000000000000000000000"
    })

    public void sum1(String number1, String number2, String result ) {
        assertEquals(result, Zadanie3.sum(number1, number2));
    }

}