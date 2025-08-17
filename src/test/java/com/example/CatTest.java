package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

public class CatTest {

    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodUsesFelineEatMeat() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные"));
        Cat cat = new Cat(mockFeline);

        assertEquals(List.of("Животные"), cat.getFood());
        verify(mockFeline, times(1)).eatMeat();
    }
}
