import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import zadanie8.Zadanie8;
import zadanie9.Zadanie9;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class Zadanie9Test {

    private Zadanie9 sut;

    static int[][][] outputArrays = {{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    },
            {
                    {1, 2, 3, 4, 5, 6,
                            16, 17, 18, 19, 20, 7,
                            15, 24, 23, 22, 21, 8,
                            14, 13, 12, 11, 10, 9
                    }
            }

    };

    @Test
    @Parameters({
            "0, 3, 3",
            "1, 6, 3",
    })

    public void checkPoistion(int index, int row, int column ) {
        sut = new Zadanie9();
        int[][] result = sut.fillTheMatrixSpirally( row, column);
        Assert.assertArrayEquals(outputArrays[index], result);
    }

}