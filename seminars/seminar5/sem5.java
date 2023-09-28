package seminars.seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class sem5 {
    public static void main(String[] args) {
        
// Создать мапу, ключ - случайная строка из энумератора,
// значение - индекс первой буквы ключа. В мапу добавить 10 пар значений.

        LinkedHashMap <String,Integer> linkedHashMap = new LinkedHashMap<>();
        HashMap <String,Integer> hashMap = new HashMap<>();
        while (linkedHashMap.size()<10) {
            String s = String.valueOf(test.values()[new Random().nextInt(test.values().length)]);
            linkedHashMap.put(s, (int) s.charAt(0));
            
        }
        linkedHashMap.forEach((k,v) -> hashMap.put(k, v));

        //System.out.println(linkedHashMap);
        //System.out.println(hashMap);

        //Вывести словарь отсортированный по порядку ввода и по хешу ключа

        //Вывести мапу отсортированный по значению
        // System.out.println(map1.values());
        // ArrayList<Integer> list = new ArrayList<>();
        // list.addAll(map1.values());
        // list.sort(Comparator.naturalOrder());
        // System.out.println(list);

        // for (int v : list) {
        //     for (String k : map1.keySet()) {
        //         if (v == map1.get(k)) {
        //             System.out.println(k + " " + v);
        //         }
        //     }
        // }

        hashMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(3)
                .forEach(e -> linkedHashMap.put(e.getKey(),e.getValue()));
        System.out.println(linkedHashMap);

        hashMap.merge("Арсений", 12, (o,n) -> n+o);
        System.out.println(hashMap);
    }
}
