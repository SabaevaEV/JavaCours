package seminars.seminar1;

import java.util.Arrays;
import java.util.Random;
// Найти старший значащий бит
public class sem1 {
    public static void main (String[] args) {

        Random random = new Random ();
        int randomNumber = random.nextInt(2001);

        System.out.println(randomNumber);

        //Integer.toBinaryString(randomNumber); //Вывод в двоичном коде, как строка
        System.out.println(Integer.toBinaryString(randomNumber));

        //Integer.toBinaryString(randomNumber).length(); //Вывод номер старшего значащего бита
        System.out.println(Integer.toBinaryString(randomNumber).length());
        int byteNumber = Integer.toBinaryString(randomNumber).length();
        // от 0 до max Short записать все числа кратные byteNumber в массив,
        //массив не должен превышать кол-ва записанных в нем элементов
        int []array = new int[1];
        int arrayCount = 0;
        for (int i = 0; i < Short.MAX_VALUE; i++) {
            if (i % byteNumber == 0){
                array[arrayCount++] = i;
                int [] tempArray = new int [array.length + 1];
                for (int j = 0; j < array.length; j++) {
                  tempArray[j] = array[j];  
                }
                array = tempArray;
            }
        }
        // System.out.println(Arrays.toString(array));

        // SHORT min до 0 сохранить все некратные

        int overlapCount = 0; //Считает количество совпадений
        for (int i = Short.MIN_VALUE; i < 0; i++) {
            if (i% byteNumber !=0) overlapCount++; 
        }
        int [] overlapSizeArray = new int [overlapCount];

        arrayCount = 0; //Счетчик для нумерации
        for (int i = Short.MIN_VALUE; i < 0; i++) {
            if (i% byteNumber !=0){
                overlapSizeArray [arrayCount++] = i;
            }   
        }
        //System.out.println(Arrays.toString(overlapSizeArray));

        int sum = 0;
        for (int i = 0; i < byteNumber; sum += i++);
       // System.out.println(sum);

        int []ints = {1,2,3,4,5,6,7,8,9};
        
        for (int i = 0, counter = ints.length-1; i < ints.length / 2; i++, counter--){
            System.out.println(ints[i] + " - " + ints[counter]);

        }

    }
    
}
