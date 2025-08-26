package com.example.animals;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    private final Feline feline = new Feline();

    @Test
    void getFoodCatTest() throws Exception {
        List<String> food = feline.getFood("кошка");
        assertEquals(List.of("молоко", "рыба", "корм"), food);
    }

    @Test
    void getFoodLionTest() throws Exception {
        List<String> food = feline.getFood("лев");
        assertEquals(List.of("мясо", "птица"), food);
    }

    @Test
    void getKittensDefaultTest() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    void getKittensParameterizedTest() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    void getFoodExceptionTest() {
        Exception exception = assertThrows(Exception.class, () -> feline.getFood("тигр"));
        assertEquals("Неизвестное животное", exception.getMessage());
    }
}