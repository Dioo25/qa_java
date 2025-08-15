package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {
    private Feline feline;
    private Alex alex;

    @Before
    public void setUp() throws Exception {
        feline = Mockito.mock(Feline.class);
        alex = new Alex(feline);
    }

    @Test
    public void testAlexHasMane() {
        assertTrue("Алекс должен иметь гриву", alex.doesHaveMane());
    }

    @Test
    public void testAlexHasNoKittens() {
        assertEquals("У Алекса не должно быть котят", 0, alex.getKittens());
    }
}


//SP6