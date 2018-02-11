import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie6.Zadanie6;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class Zadanie6Test {

    private Zadanie6 sut;

    @Test
    @Parameters({
        "(), true",
        "(){}, true",
        "[()], true",
        "(dupa[]cycki[]), true",
        "(b(e)n[{}g]), true",
            ")(, false",
            ")(ALA)MA(KOTA), false",
            "kot)ma(ale, false",
            "ALA(MA[K)OTA], false"
    })

    public void checkPositive(String input, boolean output ) {
        sut = new Zadanie6(input);
        System.out.println(input);
        assertEquals(output, sut.checkBrackets());
    }

}