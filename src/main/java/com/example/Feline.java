package com.example.animals;

import java.util.List;

public class Feline {

    // Метод eatMeat должен возвращать реальное поведение для тестов Lion
    public List<String> eatMeat() throws Exception {
        return List.of("Животные", "Птицы", "Рыба");
    }

    // Старый метод: еда в зависимости от животного
    public List<String> getFood(String animalType) throws Exception {
        switch (animalType.toLowerCase()) {
            case "кошка":
                return List.of("молоко", "рыба", "корм");
            case "лев":
                return List.of("мясо", "птица");
            default:
                throw new Exception("Неизвестное животное");
        }
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }
}