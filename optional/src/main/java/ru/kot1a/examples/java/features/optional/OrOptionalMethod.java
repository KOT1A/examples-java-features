package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

public class OrOptionalMethod {

    /**
     * Метод возвращает альтернативное значение, если Optional пуст. Данный метод можно вызывать как цепочку or в случае
     * поиска значения из нескольких источник(кэш, бд и т.п.).
     */
    public void or() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        javaOptional.or(() -> Optional.of("Пустое значение")).ifPresent(System.out::println);
        emptyOptional.or(() -> Optional.of("Пустое значение")).ifPresent(System.out::println);
    }

    /**
     * Демонстрация работы метода or
     */
    public static void main(String[] args){
        OrOptionalMethod orOptionalMethod = new OrOptionalMethod();
        orOptionalMethod.or();
    }
}
