package ru.kot1a.examples.java.features.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamOptionalMethod {

    /**
     * Метод преобразует Optional в Stream, содержащий ноль или один элемент. Это позволяет интегрировать Optional с
     * Stream API и использовать все возможности потоков для дальнейшей обработки
     */
    public void stream() {
        Optional<List<String>> listOptional = Optional.of(List.of("Hello", "world", "!"));
        Optional<List<String>> emptyListOptional = Optional.of(Collections.emptyList());
        Optional<List<String>> emptyOptional = Optional.empty();

        long count = listOptional.stream().flatMap(l -> l.stream()).count();
        long countEmptyList = emptyListOptional.stream().count();
        long countEmptyOptional = emptyOptional.stream().count();

        System.out.println("Количество элементов в списке внутри Optional = " + count);
        System.out.println("Количество элементов в Optional хранящем пустой список = " + countEmptyList);
        System.out.println("Количество элементов в emptyOptional = " + countEmptyOptional);
    }

    /**
     * Демонстрация работы метода stream
     */
    public static void main(String[] args){
        StreamOptionalMethod streamOptionalMethod = new StreamOptionalMethod();
        streamOptionalMethod.stream();
    }
}
