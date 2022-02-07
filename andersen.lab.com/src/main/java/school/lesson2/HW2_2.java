package school.lesson2;
// Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.

public class HW2_2 {
    public static void main(String[] args) {
        isPositiveOrNegative(34);
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
}
