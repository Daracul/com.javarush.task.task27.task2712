package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by amalakhov on 14.06.2017.
 */
public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static  String readString() throws IOException {
        return bufferedReader.readLine();
    }
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> chosenDishes = new ArrayList<>();
        List<Dish> allDishes = new ArrayList<>(Arrays.asList(Dish.values()));
        writeMessage(Dish.allDishesToString());
        writeMessage("Выберите блюдо для заказа");
        // string for console read
        String chooseDish="";
        while (!(chooseDish=readString()).equals("exit")){
            //if client typed something like sOUP or soup e.t.c. the final dish will searching in our Enum by name Soup
            chooseDish=chooseDish.substring(0,1).toUpperCase()+chooseDish.substring(1).toLowerCase();
            try {
                chosenDishes.add(Dish.valueOf(chooseDish));
            } catch (IllegalArgumentException e) {
                writeMessage("Данное блюдо отсутствует, выберете другое");
            }

        }
        return chosenDishes;
    }

}
