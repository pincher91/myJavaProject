package school.lesson2;
// Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

public class HW2_6 {
    public static void main(String[] args) {
        fillArray();
    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
        System.out.println("arr["+i+"]=" +arr[i]);
        }
    }
}
