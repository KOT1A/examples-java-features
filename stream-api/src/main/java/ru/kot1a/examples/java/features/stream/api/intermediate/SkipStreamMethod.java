package ru.kot1a.examples.java.features.stream.api.intermediate;

import java.util.List;

/**
 * Метод skip пропускает первые n элементов стрима и возвращает новый стрим, начиная с n+1 элемента
 */
public class SkipStreamMethod {

    /**
     * Метод пропускает первые 2 элемента, а остальные добавляет в список
     */
    public void skip() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> result = numbers.stream()
                .skip(7)
                .toList();

        System.out.println(result);
    }

    /**
     * Демонстрация работы метода skip
     */
    public static void main(String[] args){
        SkipStreamMethod skipStreamMethod = new SkipStreamMethod();
        skipStreamMethod.skip();
    }
}
