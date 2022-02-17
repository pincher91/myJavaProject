package school.lesson4;

public class CatAndDog {
    public static void main(String[] args) {

        Cat cat = new Cat();
        System.out.println("Создано котиков: " + Cat.count);
        cat.run(201);
        cat.swim(1);

        Dog dog = new Dog();
        System.out.println("Создано собачек: " + Dog.count);
        dog.run(550);
        dog.swim(10);
    }
}
abstract class Animal {
    static int count;
    Animal() {
        count++;
    }
    abstract void run(int length);
    abstract void swim(int length);
}

class Cat extends Animal {
    static int count;
    Cat() {
        count++;
    }
    private final int MAX_RUN_LENGTH = 200;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Котик смог добежать");
        else System.out.println("Котик не смог добежать");
    }

    @Override
    void swim(int length) {
        System.out.println("Котик не умеет плавать");
    }
}

class Dog extends Animal {
    static int count;

    Dog() {
        count++;
    }

    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("Собачка смогла добежать");
        else System.out.println("Собачка не смогла добежать");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("Собачка смогла доплыть");
        else System.out.println("Собачка не смогла доплыть");
        System.out.println("Создано животных: " + Animal.count);{
        }
    }
}