package main;

import adapters.ListToMap;
import adapters.MapToList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<String> l = new ListToMap<>(new HashMap<>());

        System.out.println("\nList to map\n");

        l.add(0, "Lucas");
        l.add("Joao");
        l.forEach(System.out::println);
        System.out.println();

        l.add(1, "Maria");
        l.forEach(System.out::println);

        System.out.println(l.size());
        System.out.println(l.isEmpty());

        System.out.println();
        l.remove("Maria");

        for (String s : l.toArray(new String[0])) {
            System.out.println(s);
        }

        System.out.println(l.contains("Maria"));

        l.clear();

        System.out.println(l.isEmpty());

        Map<String, String> m = new MapToList<>(new ArrayList<>());
        System.out.println("\nMap to list\n");

        m.put("nome", "Jose");
        m.put("sobrenome", "Silva");

        System.out.println(m.get("nome"));
        System.out.println(m.get("sobrenome"));
        System.out.println(m.containsValue("Silva"));

        m.values().forEach(System.out::println);
        System.out.println(m.isEmpty());
        m.remove("nome");
        System.out.println(m.containsValue("Jose"));
        System.out.println(m.size());
        m.clear();
    }
}
