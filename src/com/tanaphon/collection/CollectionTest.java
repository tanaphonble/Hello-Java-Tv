package com.tanaphon.collection;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class CollectionTest {
    public static void printMap(Map<String, Object> m) {
        m.forEach((str, o2) -> System.out.println("Key: " + str + ", Value: " + o2));
    }

    //    public static void printMap(Map<String, Object> m) {
//        m.forEach(new BiConsumer<String, Object>() {
//            @Override
//            public void accept(String str, Object o2) {
//                System.out.println("Key: " + str + ", Value: " + o2);
//            }
//        });
//    }
//
    public static void main(String[] args) {
        Set s;
        Set<String> strSet = new HashSet<>();
        strSet.add("fghj");

        List<String> l = new ArrayList<>();
        l.add("34213333wwweeee");
        l.add("134213333wwweeee");
        l.add("1231");
        l.add("1231");
        l.add("1231");

        // l.stream() for using lambda in l

        l.stream()
                .filter(s1 -> s1.length() > 3)
                .map(i -> i.length())
                .forEach(System.out::println);


        Map m;

        Map<String, Object> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");

        //printMap(map);
        System.out.println(map.get("Key1"));
        System.out.println(map.get("Key2"));


        Collections.sort(l, (o1, o2) -> o2.length() - o1.length());

//        Collections.sort(l, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        });

        //printCollection(l);
        //printCollection(strSet);
    }

    public static void printCollection(Collection<String> c) {
        c.forEach(s -> System.out.print(s));
    }
}
