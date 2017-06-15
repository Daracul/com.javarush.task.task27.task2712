package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by amalakhov on 15.06.2017.
 */
public class Waiter implements Observer {
    @Override
    public void update(Observable cook, Object order) {
        //here we recieving order from cook
        ConsoleHelper.writeMessage(String.format("%s was cooked by %s",order.toString(),cook));

    }
}
