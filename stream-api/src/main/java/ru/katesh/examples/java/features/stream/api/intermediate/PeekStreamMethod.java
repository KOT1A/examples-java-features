package ru.katesh.examples.java.features.stream.api.intermediate;

import java.util.List;
import java.util.stream.Stream;

/**
 * Метод peek ничего не меняет, а просто позволяет посмотреть, что творится внутри потока по пути
 */
public class PeekStreamMethod {

    /**
     * Пример работы метода peek с выводом промежуточных результатов в консоль
     */
    public void peek() {
        List<String> result = Stream.of("one", "two", "three")
                .peek(s -> System.out.println("До фильтра: " + s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("После фильтра: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("После мапа: " + s))
                .toList();
    }

    /**
     * Демонстрация работы метода flatMap
     */
    public static void main(String[] args){
        PeekStreamMethod peekStreamMethod = new PeekStreamMethod();
        peekStreamMethod.peek();
    }
}
