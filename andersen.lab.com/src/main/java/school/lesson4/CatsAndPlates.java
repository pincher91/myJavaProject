package school.lesson4;

public class CatsAndPlates {
    public static class Main {
        public static void main(String[] args) {
            System.out.println("Список котиков:");
            Cats[] cat = {new Cats("Матроскин", 100), new Cats("Пушок", 50), new Cats("Барсик", 30)};
            Plate plate = new Plate(100);
            for (Cats c : cat) {
                System.out.println(c);
            }
            System.out.println("\n" + plate);
            System.out.println("Добавляем 100 еды");
            plate.increaseFood(100);
            System.out.println(plate);
            System.out.println();
            System.out.println("Котитки кушают:");
            for (Cats c : cat) {
                c.eat(plate);
                System.out.println(c);
                System.out.println(plate);
            }
        }
    }
}
class Cats {
    private String name;
    private int appetite;
    private boolean isFull;

    Cats(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFull = false;
    }

    @Override
    public String toString() {
        return "Кот: " + name + " | Аппетит: " + appetite + "| Сытость: " + isFull;
    }

    void eat(Plate plate) {
        if (plate.getAmountOfFood() > appetite) {
            plate.decreaseFood(appetite);
            isFull = true;
        }
    }
}
class Plate {
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }

    @Override
    public String toString() {
        return "Еды в тарелке: " + amountOfFood;
    }

    void decreaseFood(int appetite) {
        if (amountOfFood >= appetite) {
            amountOfFood -= appetite;
        }
    }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void increaseFood(int amount) {
        amountOfFood += amount;
    }
}