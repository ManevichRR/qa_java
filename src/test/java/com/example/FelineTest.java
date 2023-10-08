package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.junit.Assert.*;
import java.util.List;
import static org.mockito.Mockito.*;

public class FelineTest {

    @Mock
    private Feline feline;

    @Before
    public void setUp() {
        feline = mock(Feline.class); // Создаем мок
    }

    @Test
    public void testGetKittens() {

        when(feline.getKittens()).thenReturn(1); // Условия для мока

        // Вызываем метод и проверяем результат
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @Test
    public void testEatMeat() throws Exception {

        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));  // Условия для мока

        // Вызываем метод и проверяем результат
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = feline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}