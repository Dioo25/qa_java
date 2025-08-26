package com.example.animals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class CatTest {

    @Test
    void getSoundReturnsMeow() {
        Feline feline = Mockito.mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void getFoodDelegatesToFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getFood("кошка")).thenReturn(List.of("молоко", "рыба", "корм"));
        Cat cat = new Cat(feline);

        List<String> food = cat.getFood();
        assertEquals(List.of("молоко", "рыба", "корм"), food);
    }

    @Test
    void getKittensDelegatesToFeline() {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getKittens()).thenReturn(1);
        Cat cat = new Cat(feline);

        assertEquals(1, cat.getKittens());
    }
}