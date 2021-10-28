package lesson5;

import java.util.*;

public class Lesson5 {

    public static void main(String[] args) {

        List<String> array = new ArrayList<>(Arrays.asList("Раз", "Два", "Три", "Четыре", "Пять", "Два", "Два", "Два","Пять","Пять","Три","Три","Три","Три"));

        uniqueWords(array);

        countOfWords(array);

        Phones phones = new Phones("Жуков", "79110074825");

        phones.add("Жуков", "79999999999");
        phones.add("Жуков", "79999992999");
        phones.add("Жуков", "79999919999");
        phones.add("Петров", "79999999949");
        phones.add("Иванов", "79999999991");
        phones.add("Сидоров", "79999999992");

        phones.get("Жуков");
    }

    public static void uniqueWords(List<String> array) {
       Set<String> uniqueSet = new HashSet<>();
       if (array.size() > 0) uniqueSet.addAll(array);
       System.out.println(uniqueSet);
   }

   public static void countOfWords(List<String> array) {
        HashMap<String, Integer> count = new HashMap<>();
        for (String item : array) {
            if (count.containsKey(item)) {
                count.put(item, count.get(item) + 1);
            } else {
                count.put(item, 1);
            }
        }
       System.out.println(count.entrySet());
   }
}