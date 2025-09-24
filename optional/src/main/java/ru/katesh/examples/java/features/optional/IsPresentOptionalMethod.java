package ru.katesh.examples.java.features.optional;

import java.util.Optional;

public class IsPresentOptionalMethod {

    /**
     * Метод возвращает true, если Optional содержит значение, иначе false
     */
    public void isPresent() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.isPresent());
        System.out.println(emptyOptional.isPresent());
    }

    /**
     * Демонстрация работы метода isPresent
     */
    public static void main(String[] args){
        IsPresentOptionalMethod isPresentOptionalMethod = new IsPresentOptionalMethod();
        isPresentOptionalMethod.isPresent();
    }
}
