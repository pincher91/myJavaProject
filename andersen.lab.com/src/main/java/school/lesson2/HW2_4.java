package school.lesson2;
// Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;

public class HW2_4 {
    public static void main(String[] args) {
        printWordNTimes("Andersen", 6);
    }
        public static void printWordNTimes(String word, int times){
        for (int i = 0; i < times; i++) {
                System.out.println(word);
        }
    }
}
