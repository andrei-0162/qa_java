package tests;


import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineParametrizedTest {

    private final int actualCase;
    private final int expectedCase;

    public FelineParametrizedTest(int actualCase, int expectedCase) {
        this.actualCase = actualCase;
        this.expectedCase = expectedCase;
    }

    @Parameterized.Parameters
    public static Object [][] testDataForGetKittensIntFelineParametrizeTest() {
        return new Object[][] {
                //первое значение - используемое в кейсе, второе - ожидаемое на выходе
                {0, 0},
                {1, 1},
                {10, 10}
        };
    }

    @Test
    public void getKittensIntFelineParametrizeTest ()  {
        Feline feline = new Feline();
        Assert.assertEquals(expectedCase, feline.getKittens(actualCase));
    }




}
