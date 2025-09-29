package ru.kot1a.examples.java.features.optional;

import java.util.List;
import java.util.Optional;

public class MapOptionalMethod {

    /**
     * Метод применяет переданный аргумент mapper к значению, если оно есть, и возвращает Optional, иначе возвращает
     * пустой Optional.
     */
    public void map() {
        Optional<List<String>> listOptional = Optional.of(List.of("Hello", "world", "!"));
        Optional<String> emptyOptional = Optional.empty();

        listOptional
                .map(v -> {
                    System.out.println("Если значение не null, то вызов будет");
                    return v.size();
                })
                .ifPresent(System.out::println);
        emptyOptional
                .map(v -> {
                    System.out.println("Если значение null, то вызова не будет");
                    return v.length();
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println("Пустой optional"));
    }

    /**
     * Демонстрация работы метода map.
     */
    public static void main(String[] args){
        MapOptionalMethod mapOptionalMethod = new MapOptionalMethod();
        mapOptionalMethod.map();
    }
}
