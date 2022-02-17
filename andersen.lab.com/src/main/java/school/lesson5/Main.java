package school.lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Задание 1.
        Integer[] array = new Integer[3];

        array[0] = 25;
        array[1] = 72;
        array[2] = 58;
        System.out.println("Задание 1.");
        System.out.println("Массив до взаимодействия: "+ Arrays.toString(array));
        swapElements(array, 0, 2);
        System.out.println("Поменяем 1й и 3й элементы массива местами: "+ Arrays.toString(array));

        // Задание 2.
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        Box<Apple> box1 = new Box<>(apple1, apple2);
        Box<Orange> box2 = new Box<>(orange1, orange2, orange3, orange4);
        System.out.println();
        System.out.println("Задание 2.");
        System.out.println("Вес коробки с яблоками " + box1.getWeight());
        System.out.println("Вес коробки с апельсинами " + box2.getWeight());
        box1.add(apple3);
        box2.remove(orange1);
        System.out.println();
        System.out.println("Добавляем в коробку 1 яблоко и удаляем 1 апельсин");
        System.out.println("Вес коробки с яблоками " + box1.getWeight());
        System.out.println("Вес коробки с апельсинами " + box2.getWeight());
        System.out.println(box1.compare(box2));
        if(box1.compare(box2)) {
            System.out.println("Коробки равны по весу");
        } else System.out.println("Коробки не равны по весу");
        Box<Apple> box3 = new Box<>();
        System.out.println();
        System.out.println("Вес пустой коробки " + box3.getWeight());
        box1.shift(box3);
        System.out.println("Пересыпаем яблоки в пустую коробку");
        System.out.println("Вес полной коробки " + box3.getWeight());
    }

    private static void swapElements(Object[] _array, int num1, int num2) {
        Object t = _array[num1];
        _array[num1] = _array[num2];
        _array[num2] = t;
    }
}