package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTest {

    @Mock
    private Predator mockPredator;

    private String sex;
    private boolean expectedManeResult;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
        });
    }

    public LionTest(String sex, boolean expectedManeResult) {
        this.sex = sex;
        this.expectedManeResult = expectedManeResult;
    }  // Переписал параметризированно

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, mockPredator);
        assertEquals(expectedManeResult, lion.doesHaveMane());
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
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба"); //Убрал дублирование списка
        when(mockPredator.eatMeat()).thenReturn(expectedFood);

        Lion lion = new Lion("Самец", mockPredator);

        List<String> actualFood = lion.getFood();
        assertEquals(expectedFood, actualFood);
    }

}
