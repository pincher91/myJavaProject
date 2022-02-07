package school.lesson2;
// * Написать метод, принимающий на вход два аргумента: len и initialValue,
// и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

public class HW2_9 {
    public static void main(String[] args) {
        lenArr(10, 0);
    }

    public static int[] lenArr(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
        return arr;

    }

}
