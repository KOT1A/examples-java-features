package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

public class OrElseOptionalMethod {

    /**
     * Метод возвращает значение, если оно есть, иначе возвращает значение other переданное в аргумент метода
     */
    public void orElse() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.orElse("Содержимое optional пустое"));
        System.out.println(emptyOptional.orElse("Содержимое optional пустое"));
    }

    /**
     * Демонстрация работы метода orElse
     */
    public static void main(String[] args){
        OrElseOptionalMethod orElseOptionalMethod = new OrElseOptionalMethod();
        orElseOptionalMethod.orElse();
    }
}
