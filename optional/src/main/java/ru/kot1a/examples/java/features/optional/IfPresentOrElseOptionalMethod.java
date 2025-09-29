package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

public class IfPresentOrElseOptionalMethod {

    /**
     * Метод выполняет действие переданное в аргументе action над значением Optional, если оно есть, иначе emptyAction.
     */
    public void ifPresentOrElse() {
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        nameOptional.ifPresentOrElse(
                v -> System.out.println("Значение равно = " + v),
                () -> System.out.println("Значение пустое"));
        emptyOptional.ifPresentOrElse(
                v -> System.out.println("Значение равно = " + v),
                () -> System.out.println("Значение пустое"));
    }

    /**
     * Демонстрация работы методов ifPresentOrElse.
     */
    public static void main(String[] args){
        IfPresentOrElseOptionalMethod ifPresentOrElseOptionalMethod = new IfPresentOrElseOptionalMethod();
        ifPresentOrElseOptionalMethod.ifPresentOrElse();
    }
}
