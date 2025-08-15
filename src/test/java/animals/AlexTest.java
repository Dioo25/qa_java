package animals;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;

public class AlexTest {

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
    }
}
