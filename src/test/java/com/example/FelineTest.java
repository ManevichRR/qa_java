package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    private Feline mockFeline;

    @Before
    public void setUp() {
        mockFeline = Mockito.mock(Feline.class);
    }

    @Test
    public void testGetKittens() {
        when(mockFeline.getKittens()).thenReturn(2);

        int kittens = mockFeline.getKittens();
        assertEquals(2, kittens);
    }

    @Test
    public void testEatMeat() throws Exception {
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы"));

        List<String> expectedFood = List.of("Животные", "Птицы");
        List<String> actualFood = mockFeline.eatMeat();
        assertEquals(expectedFood, actualFood);
    }
}
