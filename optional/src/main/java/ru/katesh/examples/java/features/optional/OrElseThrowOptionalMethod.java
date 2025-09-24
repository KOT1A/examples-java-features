package ru.katesh.examples.java.features.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OrElseThrowOptionalMethod {

    /**
     * Метод возвращает значение, если оно есть, иначе выбрасывает исключение
     */
    public void orElseThrow() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.orElseThrow());
        try {
            System.out.println(emptyOptional.orElseThrow());
        } catch (NoSuchElementException e) {
            System.out.println("Содержимое optional пустое, было выброшено исключение NoSuchElementException");
        }
    }

    /**
     * Метод возвращает значение, если оно есть, иначе выбрасывает исключение переданное в аргумент exceptionSupplier
     */
    public void orElseThrowCustomException() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.orElseThrow(RuntimeException::new));
        try {
            System.out.println(emptyOptional.orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            System.out.println("Содержимое optional пустое, было выброшено исключение RuntimeException");
        }
    }

    /**
     * Демонстрация работы метода orElseThrow
     */
    public static void main(String[] args){
        OrElseThrowOptionalMethod orElseThrowOptionalMethod = new OrElseThrowOptionalMethod();
        orElseThrowOptionalMethod.orElseThrow();
        orElseThrowOptionalMethod.orElseThrowCustomException();
    }
}
