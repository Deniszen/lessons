package lesson5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Phones {

    private final HashMap<String, ArrayList<String>> map = new HashMap<>();

    public Phones(String surname, String phone) {
        this.map.put(surname, new ArrayList<>(List.of(phone)));
    }

    public void add(String surname, String phone) {
        if (!map.containsKey(surname)) {
            this.map.put(surname, new ArrayList<>(List.of(phone)));
        } else {
            this.map.forEach((key, value) -> value.add(phone));
        }
    }

    public void get(String surname) {
        System.out.println(map.get(surname));
    }
}