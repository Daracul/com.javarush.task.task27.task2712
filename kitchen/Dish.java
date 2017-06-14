package com.javarush.task.task27.task2712.kitchen;

/**
 * Created by amalakhov on 13.06.2017.
 */
public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

    public static String allDishesToString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Dish.values()[0]);
        for (int i=1;i<Dish.values().length;i++){
            stringBuilder.append(", ").append(Dish.values()[i]);
        }
        return stringBuilder.toString();
    }

}
