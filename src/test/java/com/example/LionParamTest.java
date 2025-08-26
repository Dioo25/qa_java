package com.example.animals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class LionParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    void lionGetFoodWithDifferentSexReturnsCorrectFood(String sex) throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        when(feline.getFood("Хищник")).thenReturn(List.of("Мясо", "Птица"));

        Lion lion = new Lion(sex, feline);

        List<String> food = lion.getFood();
        assertEquals(List.of("Мясо", "Птица"), food);
    }
}