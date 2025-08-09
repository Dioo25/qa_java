package animals;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {

    @Test(expected = Exception.class)
    public void invalidSexThrowsException() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        new Lion("Неизвестно", feline);
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(3);
        Lion lion = new Lion("Самец", feline);
        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Мясо"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Мясо"), lion.getFood());
    }
}
