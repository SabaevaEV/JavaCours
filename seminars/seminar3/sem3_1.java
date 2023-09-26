package seminars.seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class sem3_1 {
    public static void main(String[] args) {
        
// // Создать 2 целочисленных списка, заполните случайными числами. В первый список
// // добавить все четные числа из второго
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new ArrayList<>();

//         for (int i = 0; i < 10; i++) {
//             list1.add(new Random().nextInt(100));
//             list2.add(new Random().nextInt(100));
//         }
//         System.out.println(list1);
//         System.out.println(list2);
//         System.out.println("-".repeat(16));

//         // for (int i = 0; i < list2.size(); i++){
//         //     if(list2.get(i)%2 == 0) list1.add(list2.get(i));
//         // }

//         list2.removeIf(n -> n%2 !=0);
//         list1.addAll(list2);

//         System.out.println(list1);


// //Создать 2 списка, 1 - целочисленный, 2 - строковый,
// // первый список заполнить случайными числами, перенести значения во второй список
// // с приведением типа
//     List<Integer> list1 = new ArrayList<>();
//     List<String> list2 = new ArrayList<>();
//     for (int i = 0; i < 10; i++) {
//             list1.add(new Random().nextInt(100));
//             // list2.add(String.valueOf(list1.get(i)));
//            }
//     list1.forEach(n -> list2.add(String.valueOf(n)));
           
//     System.out.println(list1);
//     System.out.println(list2);
//     System.out.println("-".repeat(16));

// // Создать целочисленный список, заполнить случайными числами и развернуть

//     List<Integer> list1 = new ArrayList<>();
//     List<Integer> list2 = new ArrayList<>();

//     for (int i = 0; i < 10; i++) {
//         list1.add(new Random().nextInt(100));
//     }
//     System.out.println(list1);

//     list1.forEach(n -> list2.add(0, n ));
//     list1 = list2;
//     System.out.println(list1);

//Сщздать целочисленный список, заполнить случайными числами
// найти средний по значению элемент

    List<Integer> list1 = new ArrayList<>();
    for (int i = 0; i < 20; i++) {
         list1.add(new Random().nextInt(100));
    }
    System.out.println(list1);

    list1.sort(Comparator.naturalOrder());
    System.out.println(list1);
//  System.out.println(list1.get(list1.size()/2));
    double avg = list1.stream().mapToInt(n -> n).average().getAsDouble();
    // for ( int i : list1) avg += i;
    // avg /= list1.size();
    System.out.println(avg);

    int e1 = list1.get(list1.size()/2);
    int e2 = list1.get(list1.size()/2+1);
    if (Math.abs (avg-e1) < Math.abs(avg-e2)){
      System.out.println(e1);  
    }
    else System.out.println(e2);
    }
}
