package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {

    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        // создаём мок Feline
        feline = Mockito.mock(Feline.class);

        // настраиваем поведение: при вызове eatMeat() вернуть ["Мясо"]
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Мясо"));

        // создаём льва с этим мок-объектом
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getFoodDelegatesToFeline() throws Exception {
        List<String> expected = Arrays.asList("Мясо");
        assertEquals("Метод getFood должен возвращать список еды из Feline", expected, lion.getFood());
    }

    @Test
    public void doesHaveManeReturnTrueForMale() throws Exception {
        Lion maleLion = new Lion("Самец", feline);
        assertEquals("У самца должна быть грива", true, maleLion.doesHaveMane());
    }

    @Test
    public void doesHaveManeReturnFalseForFemale() throws Exception {
        Lion femaleLion = new Lion("Самка", feline);
        assertEquals("У самки не должно быть гривы", false, femaleLion.doesHaveMane());
    }

    @Test
    public void getKittensDelegatesToFeline() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }
}