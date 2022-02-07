package school.lesson2;
// Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

public class HW2_1 {
    public static void main(String[] args) {
        System.out.println(within10and20(5, 17));
    }

    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }
}