package HW.hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут 
//повторяющиеся имена с разными телефонами, их необходимо считать, 
//как одного человека с разными телефонами. Вывод должен быть отсортирован
// по убыванию числа телефонов.

public class hw5_2 {
    
    private static void addNum(String name, int phoneNum, HashMap<String, ArrayList<Integer>> fio) {

        if (fio.containsKey(name)) {
            ArrayList<Integer> phoneNumbers = fio.get(name);
            phoneNumbers.add(phoneNum);
            fio.put (name, phoneNumbers);
        }
        else {
            ArrayList<Integer> phoneNumbers = new ArrayList<>();   
            phoneNumbers.add(phoneNum);
            fio.put (name, phoneNumbers);
        }   
        
    }

    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = " ";
            for(int el: item.getValue()){
                phones = phones + el + "/ ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> bookPhone = new HashMap<>();
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





