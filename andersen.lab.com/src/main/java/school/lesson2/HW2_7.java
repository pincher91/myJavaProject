package school.lesson2;
// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;

public class HW2_7 {
    public static void main(String[] args) {
        changeArray();
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] < 6) arr[i] *= 2;
        }
        System.out.print("\nafter:  ");
        for (int i : arr) {
        System.out.print(i + " ");
            }
        }
    }
