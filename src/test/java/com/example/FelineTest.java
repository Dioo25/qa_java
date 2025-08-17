package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void eatMeatReturnsPredatorFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getKittensWithoutArgsReturnsOne() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithArgReturnsThatNumber() {
        assertEquals(5, feline.getKittens(5));
    }
}