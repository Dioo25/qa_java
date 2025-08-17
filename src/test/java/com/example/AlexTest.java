package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class AlexTest {

    @Test
    public void alexAlwaysHasMane() throws Exception {
        Alex alex = new Alex(new Feline());
        assertTrue(alex.doesHaveMane());
    }

    @Test
    public void alexHasZeroKittens() throws Exception {
        Alex alex = new Alex(new Feline());
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void alexHasFriends() throws Exception {
        Alex alex = new Alex(new Feline());
        assertEquals(List.of("Марти", "Глория", "Мелман"), alex.getFriends());
    }

    @Test
    public void alexLivesInZoo() throws Exception {
        Alex alex = new Alex(new Feline());
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}