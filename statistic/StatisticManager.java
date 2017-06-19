package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by amalakhov on 16.06.2017.
 */
public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    public static StatisticManager getInstance() {
        return ourInstance;
    }

    private StatisticManager() {
    }
    private class StatisticStorage{
        private Map<EventType,List<EventDataRow>> storage;

        public StatisticStorage() {
            storage=new HashMap<>();
            for (EventType event:EventType.values()){
                storage.put(event,new ArrayList<EventDataRow>());
            }
        }
    }

    public void register(EventDataRow data){}
}
