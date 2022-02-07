package school.lesson2;
// *** Написать метод, которому на вход подается одномерный массив и число n,
// при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// При каком n в какую сторону сдвиг можете выбирать сами.

public class HW2_9_3 {
    public static void main(String[] args) {
        modifyArray(new int[] {6, 9, 3, 5, 4, 7, 2, 1}, -1);
    }
    public static void modifyArray(int[] arr, int n) {
        System.out.print("before: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nafter:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
