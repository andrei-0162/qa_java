package tests;

import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import com.example.Cat;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import tests.resources.Constants;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getSoundCatTest () {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(Constants.SOUND_CAT, cat.getSound());
    }

    @Test
    public void getFoodCatTest () throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals(Constants.PREDATOR_FOOD_LIST,cat.getFood());
    }

    @Test
    public void getFoodMockCatTest () throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        cat.getFood();
        Mockito.verify(feline).eatMeat();
    }


}
