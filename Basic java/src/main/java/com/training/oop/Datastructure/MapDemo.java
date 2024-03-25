package main.java.com.training.oop.Datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        MapDemo md = new MapDemo();
        md.execute();
    }
    private void execute() {
        creatingPuttingGettingMap();
        loopsWithMap();
    }

    private void loopsWithMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Messi");
        myMap.put(7, "Ronaldo");
        myMap.put(8,"Kaka");
        myMap.put(10, "Ambappe");
        for(Map.Entry<Integer, String> entry: myMap.entrySet()){
            System.out.println("Key: "+ entry.getKey() + " Value:" + entry.getValue());
        }
        System.out.println("**************************");
        for (Integer key : myMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + myMap.get(key));
        }
    }

    private void creatingPuttingGettingMap() {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(10, "Messi");
        myMap.put(7, "Ronaldo");
        myMap.put(8,"Kaka");
        myMap.put(10, "Ambappe");

        System.out.println(myMap.get(10));
        System.out.println(myMap.get(1));
        System.out.println(myMap.get(7));
        System.out.println(myMap.get(8));
        //This is higly used method.
        System.out.println(myMap.getOrDefault(11, "Zidane"));
    }
}