package seminars.seminar2;

public class sem2_1 {
    public static void main (String[] args) {
// создать 2 строки, если в первой строке содержится вторая строка
//вывести ее индекс, если содержится несколько раз вывести индекс каждой
// String stringForFind = "qwe";
// String mainString = "asd qwert qwes qwe";

// String[] stringArray = mainString.split (" ");

// int temp = 0;
// // do {
// //     System.out.println(mainString.indexOf(stringForFind,temp));
// //     temp = mainString.indexOf(stringForFind,temp) +1;            // 1 вариант
// // } while (temp < mainString.indexOf(stringForFind,temp));

// while (mainString.indexOf(stringForFind,temp) != -1) {
//     System.out.println(mainString.indexOf(stringForFind, temp));    // 2 вариант
//     temp = mainString.indexOf(stringForFind, temp)+1;
// }

//System.out.println (mainString.indexOf(stringForFind,4));

//mainString = mainString.substring(mainString.indexOf(stringForFind));

//создать 2 строки, если вторая является вращением первой, вывести ОК (реверсом)

// StringBuilder str1 = new StringBuilder("asd");
// StringBuilder str2 = new StringBuilder("dsad");

// if (str1.reverse().toString().equals(str2.toString())){ //equals  это ==
//     System.out.println("OK");
// } 
// else{
//     System.out.println("NOT OK");
// }

// String str1 = "asd";
// String str2 = "dsad";

// if (new StringBuilder(str1).reverse().toString().equals(str2)){
//     System.out.println("OK");
// } 
// else{
//     System.out.println("NOT OK");
// }

//в строке 3+56=59 заменить = на "равно" средствами String и StringBuilder

// String equals = "3 + 56 = 59";
// System.out.println(equals);
// equals = equals.replace("=", "равно");
// System.out.println(equals);
// System.out.println("-".repeat(16));

// StringBuilder eq = new StringBuilder("3 + 56 = 59");
// eq.replace(eq.indexOf("="), eq.indexOf("=") + 1, "равно");
// System.out.println(eq);

//Измерить скорость добавления в Стринг и СтрингБилдер 1000 элеиентов

// long start = System.currentTimeMillis();
// String s = "";
// for(int i = 0; i < 1000; i++){
//     s += Character.getName(i);
// }

// long end = System.currentTimeMillis();
// System.out.println(end-start);

// start = System.currentTimeMillis();
// StringBuilder string = new StringBuilder("");
// for(int i = 0; i < 1000; i++){
//     string.append( Character.getName(i));
// }

// end = System.currentTimeMillis();
// System.out.println(end-start);

//Сравнить время реплейса Стринга и СтринБилдера


String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
long start = System.currentTimeMillis();
string.replace('a', 's');
long end = System.currentTimeMillis();
System.out.println(end-start);

StringBuilder str = new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
start = System.currentTimeMillis();
while (str.toString().contains("a")){
    str.replace(str.indexOf("a"), str.indexOf("a") + 1, "s");
}
end = System.currentTimeMillis();
System.out.println(end-start);
System.out.println(str);

}
}

