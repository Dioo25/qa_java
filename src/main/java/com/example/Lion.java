package com.example;

import java.util.List;

public class Lion {

    private final Feline feline;
    private final boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            this.hasMane = true;
        } else if ("Самка".equals(sex)) {
            this.hasMane = false;
        } else {
            throw new Exception("Используйте значение \"Самец\" или \"Самка\"");
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }
}


