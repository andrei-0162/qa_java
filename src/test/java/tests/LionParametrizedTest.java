package tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import tests.resources.Constants;


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
                {Constants.EMPTY_STRING, false},
                {Constants.MALE, true},
                {Constants.FEMALE, false}
        };
    }

    @Test
    public void doesHaveManeLionTest3 () throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        if (sex.equals(Constants.MALE) ||  sex.equals(Constants.FEMALE)) {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(mane, lion.doesHaveMane());
        } else {
            Assert.assertThrows(Exception.class, () -> new Lion(sex, feline));
        }
    }
}

