package HW.hw6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class hw6 {
  
    private static void addNum(String name, int phoneNum, HashMap<String, HashSet<Integer>> fio) {

        if (fio.containsKey(name)) {
            HashSet<Integer> phoneNumbers = fio.get(name);
            phoneNumbers.add(phoneNum);
            fio.put (name, phoneNumbers);
        }
        else {
            HashSet<Integer> phoneNumbers = new HashSet<>();   
            phoneNumbers.add(phoneNum);
            fio.put (name, phoneNumbers);
        }   
        
    }

    public static void printBook(Map<String, HashSet<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = " ";
            for(int el: item.getValue()){
                phones = phones + el + "/ ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        HashMap<String, HashSet<Integer>> bookPhone = new HashMap<>();
        addNum("Serova", 31569, bookPhone);
        addNum("Kozlov", 1234, bookPhone);
        addNum("Sergeeva", 546585, bookPhone);
        addNum("Sidorov", 3698423, bookPhone);
        addNum("Kozlov", 1247856, bookPhone);
        addNum("Petrov", 787897, bookPhone);
        addNum("Sergeeva", 52897640, bookPhone);
        addNum("Bormotov", 335784, bookPhone);
        addNum("Sergeeva", 1578, bookPhone);
        printBook(bookPhone); 
    } 
}
