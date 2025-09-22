package ru.katesh.examples.java.features.optional;

import java.util.Optional;

public class IfPresentOptionalApp {

    /**
     * Демонстрация работы методов ifPresent
     */
    public static void main(String[] args){
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        //Если значение есть, то выполняется переданный метод
        nameOptional.ifPresent(v -> System.out.println("Значение равно = " + v));
        emptyOptional.ifPresent(v -> System.out.println("Значение равно = " + v));

        System.out.println();
        //Если значение есть, то выполняется метод из первого аргумента, иначе из второго
        nameOptional.ifPresentOrElse(
                v -> System.out.println("Значение равно = " + v),
                () -> System.out.println("Значение пустое"));
        emptyOptional.ifPresentOrElse(
                v -> System.out.println("Значение равно = " + v),
                () -> System.out.println("Значение пустое"));
    }
}
