package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {

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

    public ParameterizedLionTest(String sex, boolean expectedManeResult) {
        this.sex = sex;
        this.expectedManeResult = expectedManeResult;
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, mockPredator);
        assertEquals(expectedManeResult, lion.doesHaveMane());
    } //Спасибо большое! Теперь все понял
}
