package com.example.animals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

class AlexTest {

    @Test
    @DisplayName("Проверка, что у Алекса нет котят")
    void alexHasNoKittens() {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        assertEquals(0, alex.getKittens());
    }

    @Test
    @DisplayName("Проверка списка друзей Алекса")
    void alexHasFriends() {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        List<String> friends = alex.getFriends();
        assertEquals(List.of("Марти", "Мелман", "Глория"), friends);
    }
}