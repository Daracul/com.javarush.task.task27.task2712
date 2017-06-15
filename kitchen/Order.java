package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;

import java.io.IOException;
import java.util.List;

/**
 * Created by amalakhov on 13.06.2017.
 */
public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(Tablet tablet) throws IOException{
        this.tablet = tablet;
        dishes= ConsoleHelper.getAllDishesForOrder();

    }

    public int getTotalCookingTime(){
       int cookTime = 0;
        for (Dish dish:dishes){
            cookTime+=dish.getDuration();
        }

        return cookTime;
    }

    public boolean isEmpty(){
        return dishes.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("");
        if (dishes.isEmpty()){
            return stringBuilder.toString();
        }
        else {
            for (Dish dish:dishes){
                stringBuilder.append(dish).append(", ");
            }
        }
        return String.format("Your order: [%s] of %s",stringBuilder.toString().substring(0,stringBuilder.toString().length()-2),tablet);
    }
}
