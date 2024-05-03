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
    private final boolean expectedTestResult;

    public FelineParametrizedTest(int actualCase, int expectedCase, boolean expectedTestResult) {
        this.actualCase = actualCase;
        this.expectedCase = expectedCase;
        this.expectedTestResult = expectedTestResult;
    }

    @Parameterized.Parameters
    public static Object [][] testDataForGetKittensIntFelineParametrizeTest() {
        return new Object[][] {
                //первое значение - используемое в кейсе, второе - ожидаемое на выходе, третье - ожидаемый результат проверки
                {0, 0, true},
                {1, 1, true},
                {10, 10, true}
        };
    }

    @Test
    public void getKittensIntFelineParametrizeTest ()  {
        Feline feline = new Feline();
        Assert.assertEquals(expectedTestResult, expectedCase == feline.getKittens(actualCase));
    }




}
