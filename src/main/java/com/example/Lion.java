package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Predator predator; //Убираем зависимость от Филайн (я на федоре страдаю, не нашел где в гноме раскладку менять)
    //Editing cz texted wrong comment for last commit. Right comment for prev commit is: 'DI done'

    public Lion(String sex, Predator predator) throws Exception {
        this.predator=predator;  //Отредачил конструктор, забыл добавить предатора
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    public int getKittens() {
        return predator.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }
}
