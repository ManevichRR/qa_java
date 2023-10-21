package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testGetSound() {
        Cat cat = new Cat(mockFeline);
        String sound = cat.getSound();
        assertEquals("Мяу", sound);
    }

    @Test
    public void testGetFood() throws Exception {
        Cat cat = new Cat(mockFeline);
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
