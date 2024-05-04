package tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import tests.resources.Constants;

public class FelineTest {
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void eatMeatFelineTest () throws Exception {
    Feline feline = new Feline();
    Assert.assertEquals(Constants.PREDATOR_FOOD_LIST, feline.eatMeat());
}
    @Test
    public void getFamilyFelineTest ()  {
        Feline feline = new Feline();
        Assert.assertEquals(Constants.FELINE_FAMILY, feline.getFamily());
    }

    @Test
    public void getKittensFelineTest ()  {
        Feline feline = new Feline();
        Assert.assertEquals(Constants.DEFAULT_FELINE_COUNT, feline.getKittens());
    }

    @Test
    public void getKittensMockFelineTest ()  {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        felineSpy.getKittens();
        Mockito.verify(felineSpy).getKittens(Constants.DEFAULT_FELINE_COUNT);
    }
}
