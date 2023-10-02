package seminars.seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Sem6 {

 // реализовать методы из set HashSet
 // Реализовать HashSet обобщение Integer

    public static void main(String[] args) {
    MySet<Integer> mySet = new MySet();
    System.out.println(mySet.add(7));
    System.out.println(mySet.add(4));
    System.out.println(mySet.add(3));
    System.out.println(mySet.add(6));
    System.out.println(mySet.add(9));
    System.out.println(mySet.add(2));
    System.out.println(mySet.add(7));
    System.out.println(mySet.remove(6));
    System.out.println(mySet.remove(99));
    HashSet h = new HashSet<>();
    h.add(3);
    System.out.println(mySet);
    System.out.println(Arrays.toString(mySet.toArray));
    }

}

class MySet <E> {

    // @Override
    // public String toString() {
    //     return "MySet []";
    // }

    //реализовать метод add
    //добавляет в список инты
    private HashMap<E, Object> mySet;
    private static final Object PRESENT = new Object();

    public MySet() {
        mySet = new HashMap<>();
    }

    public boolean add (E e) {
        
        return mySet.put(e,PRESENT) == null;
    }

    public boolean remove (Object o) {
        return mySet.remove(o) == PRESENT; 
    }

    @Override
    public String toString() {
        return mySet.keySet().toString() ;
    }

    public Object[] toArray() {
        Object[] list = new Object[mySet.size()];
        int i = 0;
        for (E temp : mySet.keySet()) {
            list[i++] = temp;
        }
        return list;
    }


}