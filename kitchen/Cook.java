package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by amalakhov on 15.06.2017.
 */
public class Cook extends Observable implements Observer{
    private String name;

    public Cook(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable o, Object order) {
        //here we recieving order from Tablet
        ConsoleHelper.writeMessage(String.format("Start cooking - %s, cooking time %dmin",order.toString(),((Order) order).getTotalCookingTime()));
        setChanged();
        notifyObservers(order);
    }
}
