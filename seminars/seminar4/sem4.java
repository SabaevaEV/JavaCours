package seminars.seminar4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        
// написать программу в которой можно будет вводить
// Фамилию Имя Возраст Пол , любое кол-во людей
// енд - выход режима ввода данных и получаем весь список людей
//в порядке их ввода данных
//3 варианта: 1 - выход из приложения
//2 - вывести всех в порядке увеличения возраста и закрыть
//3 - вывести всех в порядке увеличения возраста и пола и закрыть


// реализовать ввод ФИО возраста и пол с консоли и сохранение в удобном виде
        ArrayList <String[]> arr1 = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите данные через пробел (пример: Иванов Иван Иванович 33 мужчина):");
            System.out.println("Чтобы продолжить нажмите ENTER" +
                            "\n Чтобы закончить введите END" +
                            "\n Чтобы отсортировать список по возрасту введите AGE");
            String console = in.nextLine();
            if (console.equalsIgnoreCase("end")){
                break;
            }
            arr1.add(console.split(" "));
        }
        arr1.forEach(n -> System.out.println(Arrays.toString(n)));

        System.out.println("-".repeat(16));
        //реализовать сортировку по возрасту

        arr1.sort(new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]);
            }  
        });
        arr1.forEach(n -> System.out.println(Arrays.toString(n)));
    
        //сортировка по возрасту и полу
        
        arr1.sort(new Comparator<String[]>() {

            @Override
            public int compare(String[] o1, String[] o2) {
                if (o1[4].equals("женщина")){
                return 1;
                }
               else {return -1;} 
            }  
        });
        arr1.forEach(n -> System.out.println(Arrays.toString(n)));



    }
}
