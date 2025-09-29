package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

public class FilterOptionalMethod {

    /**
     * Возвращает Optional, если значение удовлетворяет условию, которое передано в аргументе predicate, иначе пустой
     * Optional. Стоит подчеркнуть, что если значение Optional равно null, то filter не выполняется.
     */
    public void filter() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> kotlinOptional = Optional.of("Kotlin");
        Optional<String> emptyOptional = Optional.empty();

        javaOptional
                .filter(s -> {
                    System.out.println("Работает фильтр");
                    return s.equals("Java");
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println("Не Java"));
        kotlinOptional
                .filter(s -> {
                    System.out.println("Работает фильтр");
                    return s.equals("Java");
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println("Не Java"));
        emptyOptional
                .filter(s -> {
                    System.out.println("Работает фильтр");
                    return s.equals("Java");
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println("Не Java"));
    }

    /**
     * Демонстрация работы метода filter.
     */
    public static void main(String[] args){
        FilterOptionalMethod filterOptionalMethod = new FilterOptionalMethod();
        filterOptionalMethod.filter();
    }
}
