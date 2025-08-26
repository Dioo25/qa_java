package com.example.animals;

import java.util.List;

public class Alex {

    private final Feline feline;

    public Alex(Feline feline) {
        this.feline = feline;
    }

    public int getKittens() {
        return 0;
    }

    public List<String> getFriends() {
        return List.of("Марти", "Мелман", "Глория");
    }
}