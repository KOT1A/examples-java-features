package ru.katesh.examples.java.features.optional;

import java.util.Optional;

public class IfPresentOptionalMethod {

    /**
     * Метод выполняет действие переданное в аргументе consumer над значением Optional, если оно есть
     */
    public void ifPresent() {
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        nameOptional.ifPresent(v -> System.out.println("Значение равно = " + v));
        emptyOptional.ifPresent(v -> System.out.println("Значение равно = " + v));
    }

    /**
     * Демонстрация работы методов ifPresent
     */
    public static void main(String[] args){
        IfPresentOptionalMethod ifPresentOptionalMethod = new IfPresentOptionalMethod();
        ifPresentOptionalMethod.ifPresent();
    }
}
