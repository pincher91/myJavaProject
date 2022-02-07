package school.lesson2;
// Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
// Замечание: ноль считаем положительным числом.

public class HW2_3 {
    public static void main(String[] args) {
        System.out.println(isNegative(-1));
    }

    public static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        else {
            return false;
        }
    }
}