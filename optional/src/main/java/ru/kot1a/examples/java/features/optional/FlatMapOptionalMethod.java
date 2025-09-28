package ru.kot1a.examples.java.features.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FlatMapOptionalMethod {

    /**
     * Метод применяет переданный в аргументе mapper и "разворачивает" результат (если mapper возвращает Optional),
     * другими словами flatMap помогает избежать двойного Optional, если метод возвращает Optional
     */
    public void flatMap() {
        Optional<List<String>> listOptional = Optional.of(List.of("Hello", "world", "!"));

        System.out.println();
        List<Optional<String>> flatMapList = listOptional.flatMap(l -> {
                    List<Optional<String>> newList = l.stream().map(s -> Optional.of(s)).toList();
                    return Optional.of(newList);
                }
        ).orElse(Collections.emptyList());
        flatMapList.forEach(o -> o.ifPresent(System.out::println));
    }

    /**
     * Демонстрация работы метода flatMap
     */
    public static void main(String[] args){
        FlatMapOptionalMethod flatMapOptionalMethod = new FlatMapOptionalMethod();
        flatMapOptionalMethod.flatMap();
    }
}
