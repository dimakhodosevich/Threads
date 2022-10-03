package by.itstep.dimakhodosevich.module;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.spi.CurrencyNameProvider;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dima");
        list.add("Tanya");
        list.add("Vika");


//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, "B" + list.get(i).substring(1, list.size() + 1));
//        }
//        System.out.println(list);

        List<String> newList = list.stream().map(l1 -> {
            return "dddd" + l1.substring(1, l1.length());
        }).toList();
        System.out.println(newList);

//        Comparator
    }


}
