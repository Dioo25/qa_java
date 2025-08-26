package com.example.animals;

import java.util.List;

public class Lion {

    private final String sex;
    private final Feline feline;

    public Lion(String sex, Feline feline) {
        if (!sex.equals("Самец") && !sex.equals("Самка")) {
            throw new IllegalArgumentException("Некорректный пол льва");
        }
        this.sex = sex;
        this.feline = feline;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }

    public String getSex() {
        return sex;
    }
}