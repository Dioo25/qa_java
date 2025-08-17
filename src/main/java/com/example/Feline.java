package com.example;

import java.util.List;

public class Feline implements Predator {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    public List<String> getFood(String animalKind) throws Exception {
        if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        }
        throw new Exception("Неизвестный вид животного: " + animalKind);
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int count) {
        return count;
    }
}