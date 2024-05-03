package tests;


import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import tests.resources.Constants;


public class LionTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getKittensLionTest () throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(Constants.MALE, feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion(Constants.FEMALE, feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Constants.PREDATOR);
    }
}
