package ru.kot1a.examples.java.features.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class GetOptionalMethod {

    /**
     * Метод возвращает значение, если оно присутствует, иначе, если Optional пуст, то выбрасывает
     * NoSuchElementException
     */
    public void get() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.get());
        try {
            System.out.println(emptyOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("Тут был NoSuchElementException");
        }
    }

    /**
     * Демонстрация работы метода get
     */
    public static void main(String[] args){
        GetOptionalMethod getOptionalMethod = new GetOptionalMethod();
        getOptionalMethod.get();
    }
}
