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
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        //Пример работы метода stream
        long count = listOptional.stream().flatMap(l -> l.stream()).count();
        long countEmptyList = emptyListOptional.stream().count();
        long countEmptyOptional = Optional.empty().stream().count();
        System.out.println("Количество элементов в списке внутри Optional = " + count);
        System.out.println("Количество элементов в Optional хрянящем пустой список = " + countEmptyList);
        System.out.println("Количество элементов в Optional.empty() = " + countEmptyOptional);
    }
}
