package animals;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
<<<<<<< HEAD
    public void eatMeatReturnsPredatorFoodList() throws Exception {
=======
    public void testEatMeatReturnsPredatorFoodList() throws Exception {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
<<<<<<< HEAD
    public void getFamilyReturnsFelineFamily() {
=======
    public void testGetFamilyReturnsFelineFamily() {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
<<<<<<< HEAD
    public void getKittensDefaultOne() {
=======
    public void testGetKittensDefaultOne() {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        assertEquals(1, feline.getKittens());
    }

    @Test
<<<<<<< HEAD
    public void getKittensWithCount() {
=======
    public void testGetKittensWithCount() {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        assertEquals(5, feline.getKittens(5));
    }

    @Test
<<<<<<< HEAD
    public void getFoodHerbivoreReturnsPlantList() throws Exception {
=======
    public void testGetFoodHerbivoreReturnsPlantList() throws Exception {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
    }

    @Test(expected = Exception.class)
<<<<<<< HEAD
    public void getFoodThrowsExceptionForUnknownAnimalKind() throws Exception {
=======
    public void testGetFoodThrowsExceptionForUnknownAnimalKind() throws Exception {
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
        feline.getFood("Неизвестно");
    }
}
