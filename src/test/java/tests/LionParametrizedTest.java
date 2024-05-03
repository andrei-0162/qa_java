package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import tests.resources.Constants;

import javax.sound.midi.Soundbank;

@RunWith(Parameterized.class)
public class LionParametrizedTest {

    private final String sex;
    private final boolean mane;

    public LionParametrizedTest(String sex, boolean mane) {
        this.sex = sex;
        this.mane = mane;
    }

    //параметризация для теста doesHaveManeLionTest на пол и наличие гривы
    @Parameterized.Parameters
    public static Object [][] testDataForDoesHaveManeLionTest() {
        return new Object[][] {
                {Constants.ALIEN, false},
                {Constants.MALE, true},
                {Constants.FEMALE, false}
        };
    }
    @Test
    public void doesHaveManeLionTest () throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        try {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
        } catch (Exception exception) {
            Assert.assertEquals(Constants.SEX_ERROR_MESSAGE, exception.getMessage());
        }
        }
}
