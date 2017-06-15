package com.javarush.task.task27.task2712.ad;

/**
 * Created by amalakhov on 15.06.2017.
 */
public class AdvertisementStorage {
    private static AdvertisementStorage ourInstance = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return ourInstance;
    }

    private AdvertisementStorage() {
    }
}
