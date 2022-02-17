package school.lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>(Arrays.asList(fruits));
    }
    //метод добавления фруктов
    public void add(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }
    //удалить все из корзины
    private void clear() {
        fruits.clear();
    }
    //метод удаления из корзины фрукта
    public void remove(T... items) {
        for (T item: items) this.fruits.remove(item);
    }
    //вычисление веса коробки
    public float getWeight() {
        if(fruits.size() == 0) return 0; //корзина пуста. Ничего не делаем
        float weight = 0;
        for (T fruit: fruits) {
            weight = weight+fruit.getWeight();
        }
        return weight;
    }
    //метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра.
    boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }
    //метод, который позволяет пересыпать фрукты из текущей коробки в другую
    void shift(Box<? super T> box) {
        box.fruits.addAll(this.fruits);
        clear();
    }
}