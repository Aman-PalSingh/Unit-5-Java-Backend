package com.Unit5.C2.Liskov;

public class Chapati implements Food {
    @Override
    public void readyIngredients(String ing1, String ing2) {
        System.out.println("Ingredients are " + ing1 +", "+ ing2);
    }

    @Override
    public void cook() {
        System.out.println("Food is Prepared");
    }
}
