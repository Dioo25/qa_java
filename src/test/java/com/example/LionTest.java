package com.example.animals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class LionTest {

    @Test
    void lionConstructorSetsSex() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Lion lion = new Lion("Самец", feline);

        assertEquals("Самец", lion.getSex());
    }

    @Test
    void lionGetFoodReturnsCorrectList() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Мясо", "Птица"));
        Lion lion = new Lion("Самка", feline);

        List<String> food = lion.getFood();
        assertEquals(List.of("Мясо", "Птица"), food);
    }

    @Test
    void lionConstructorThrowsExceptionForInvalidSex() {
        Feline feline = Mockito.mock(Feline.class);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Lion("Неизвестно", feline);
        });

        assertEquals("Некорректный пол льва", exception.getMessage());
    }
}