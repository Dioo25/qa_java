package animals;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {

    @Test(expected = Exception.class)
<<<<<<< HEAD
    public void invalidSexThrowsException() throws Exception {
=======
    public void testInvalidSexThrowsException() throws Exception {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        Feline feline = Mockito.mock(Feline.class);
        new Lion("Неизвестно", feline);
    }

    @Test
<<<<<<< HEAD
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
=======
    public void testGetKittensDelegatesToFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFoodDelegatesToFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
    }
}
