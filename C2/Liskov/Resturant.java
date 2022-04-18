package com.Unit5.C2.Liskov;

public class Resturant extends Chapati{
    public static void main(String[] args) {
        Food food = new Chapati();
        food.readyIngredients("Wheat","Water");
        food.cook();
    }
}
