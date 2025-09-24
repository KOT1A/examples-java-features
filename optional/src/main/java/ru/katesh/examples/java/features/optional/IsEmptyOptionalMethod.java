package ru.katesh.examples.java.features.optional;

import java.util.Optional;

public class IsEmptyOptionalMethod {

    /**
     * Метод возвращает true, если Optional пустой, иначе false
     */
    public void isPresent() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.isEmpty());
        System.out.println(emptyOptional.isEmpty());
    }

    /**
     * Демонстрация работы метода isEmpty
     */
    public static void main(String[] args){
        IsEmptyOptionalMethod isEmptyOptionalMethod = new IsEmptyOptionalMethod();
        isEmptyOptionalMethod.isPresent();
    }
}
