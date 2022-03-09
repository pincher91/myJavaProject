package school.lesson8.task1;

import java.util.*;

public class Main {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Париж", "Лондон", "Москва", "Париж", "Вашингтон",
                "Мадрид", "Берлин", "Париж", "Минск", "Киев",
                "Дублин", "Киев", "Токио", "Киев", "Пекин",
                "Токио", "Берлин", "Минск", "Лондон", "Минск"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Оригинальный массив:");
        System.out.println(words.toString());
        System.out.println("Уникальные слова:");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов:");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}