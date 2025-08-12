package animals;

<<<<<<< HEAD
=======
import org.junit.Before;
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class AlexTest {

<<<<<<< HEAD
    @Test
    public void alexHasMane() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Alex alex = new Alex(feline);
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void alexHasNoKittens() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Alex alex = new Alex(feline);
        assertEquals(0, alex.getKittens());
=======
    private Feline feline;
    private Alex alex;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        alex = new Alex(feline);
    }

    @Test
    public void testAlexHasMane() throws Exception {
        assertTrue("Alex должен иметь гриву (самец)", alex.doesHaveMane());
    }

    @Test
    public void testAlexHasNoKittens() throws Exception {
        assertEquals("У Alex нет львят", 0, alex.getKittens());
>>>>>>> e6b74b9 (fix: правки по замечаниям ревьюера)
    }
}
