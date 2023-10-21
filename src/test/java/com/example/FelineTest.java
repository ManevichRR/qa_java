package com.example;

import org.junit.Before;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {


    private Feline feline; // Убрал неразумный мок

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testGetKittens() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}
