package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Dish;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;

import java.io.IOException;
import java.util.List;

/**
 * Created by amalakhov on 13.06.2017.
 */
public class Restaurant {
    public static void main(String[] args) {

        Tablet tablet=new Tablet(5);
        Cook cook=new Cook("Amigo");
        tablet.addObserver(cook);
        Waiter waiter = new Waiter();
        cook.addObserver(waiter);
        tablet.createOrder();


    }
}
