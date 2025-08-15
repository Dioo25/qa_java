package animals;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFoodList() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensDefaultOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithCount() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void getFoodHerbivoreReturnsPlantList() throws Exception {
        assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
    public void getFoodThrowsExceptionForUnknownAnimalKind() throws Exception {
        feline.getFood("Неизвестно");
    }
}
