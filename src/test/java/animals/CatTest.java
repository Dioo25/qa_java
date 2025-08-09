package animals;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodCallsFelineEatMeat() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Рыба"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Рыба"), cat.getFood());
        Mockito.verify(feline).eatMeat();
    }
}
