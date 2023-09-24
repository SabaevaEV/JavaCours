package HW;

public class task2 {
    // class Answer {
    //     public void printPrimeNums(){
    //         boolean isPrime;
    //         for(int i = 1; i < 1000; i++) {
    //             isPrime = i == 1;
    //             for(int j = 2; j < 1000; j++) {
    //                 if (i >= j && i % j == 0) {   ///Вариант теста
    //                     if(j == i) {
    //                         isPrime = true;
    //                     }
    //                     break;
    //                 }
    //             }
    //             if(isPrime) System.out.println(i);
    //         }
    //     }
    // }


    public void printPrimeNums(){
        // Напишите свое решение ниже
        int count = 0;
        int temp = 0;
        for (int i = 1; i <= 1001; i++) {
            count = 0;
            temp = 0;
            for (int j = 1; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            temp = count;
            if (temp > 1) {

            } else {
                System.out.println(i);
            }
    }
    }
}

