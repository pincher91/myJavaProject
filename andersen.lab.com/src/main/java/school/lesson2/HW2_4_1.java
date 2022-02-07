package school.lesson2;
// * Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

public class HW2_4_1 {
    public static void main(String[] args){
        System.out.println(howyear(2000));
    }
    public static boolean howyear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            return false;
        }
        else {
            return true;
        }
    }
}