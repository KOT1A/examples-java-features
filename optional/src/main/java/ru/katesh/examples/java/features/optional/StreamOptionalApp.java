package ru.katesh.examples.java.features.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamOptionalApp {

    /**
     * Демонстрация методов stream, map, filter, flatMap
     */
    public static void main(String[] args){
        Optional<List<String>> listOptional = Optional.of(List.of("Hello", "world", "!"));
        Optional<List<String>> emptyListOptional = Optional.of(Collections.emptyList());
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        //Пример работы метода stream
        long count = listOptional.stream().flatMap(l -> l.stream()).count();
        long countEmptyList = emptyListOptional.stream().count();
        long countEmptyOptional = Optional.empty().stream().count();
        System.out.println("Количество элементов в списке внутри Optional = " + count);
        System.out.println("Количество элементов в Optional хрянящем пустой список = " + countEmptyList);
        System.out.println("Количество элементов в Optional.empty() = " + countEmptyOptional);

        System.out.println();
        //Пример работы map. Метод map маппит объект в новый Optional и работаем с ним
        listOptional.map(List::size).ifPresent(System.out::println);
        emptyOptional.map(String::length).ifPresentOrElse(System.out::println, () -> System.out.println("Пустой optional"));

        System.out.println();
        //Пример работы flatMap. Метод flatMap помогает избежать двойного Optional, если метод возвращает Optional
        List<Optional<String>> flatMapList = listOptional.flatMap(l -> {
                    List<Optional<String>> newList = l.stream().map(s -> Optional.of(s)).toList();
                    return Optional.of(newList);
                }
        ).orElse(Collections.emptyList());
        flatMapList.forEach(o -> o.ifPresent(System.out::println));

        System.out.println();
        //Пример работы filter. Если значение Optional равно null, то filter не выполняется, иначе проверяет
        //соответствует ли значение optional фильтру
        javaOptional
                .filter(s -> {
                    System.out.println("Работает фильтр");
                    return s.equals("Java");
                })
                .ifPresentOrElse(System.out::println, () -> System.out.println("Не Java"));
        Optional.of("Kotlin")
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
}
