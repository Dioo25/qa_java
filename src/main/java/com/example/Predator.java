package com.example;

import java.util.List;

public interface Predator {
    List<String> getFood(String type) throws Exception;
}
