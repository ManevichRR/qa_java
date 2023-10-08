package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Predator mockPredator;

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", mockPredator);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testGetKittens() throws Exception {
        when(mockPredator.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", mockPredator);

        int kittens = lion.getKittens();
        assertEquals(3, kittens);
    }

    @Test
    public void testGetFood() throws Exception {
        when(mockPredator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        Lion lion = new Lion("Самец", mockPredator);

        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
