package com.example;


import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    private Lion lion;
    private Predator mockPredator;
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");

    @Before
    public void setUp() throws Exception {
        mockPredator = mock(Predator.class);
        when(mockPredator.eatMeat()).thenReturn(expectedFood);
        when(mockPredator.getKittens()).thenReturn(3);
        lion = new Lion("Самец", mockPredator);
    }

    @Test
    public void testGetKittens()  {
        int expectedValue = 3;
        int actualValue = lion.getKittens();
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testGetFood() throws Exception {
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testInvalidSexParameter() {
        assertThrows(Exception.class, () -> new Lion("Невалидный", mockPredator)); //невалидный здесь
    }
}
