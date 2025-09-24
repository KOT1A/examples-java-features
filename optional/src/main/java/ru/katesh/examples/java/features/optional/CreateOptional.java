package ru.katesh.examples.java.features.optional;

import java.util.Optional;

public class CreateOptional {

    /**
     * Создаёт Optional с ненулевым значением. Выбрасывает NullPointerException, если value = null
     */
    public void of(){
        Optional<String> javaOptional = Optional.of("Java");
        javaOptional.ifPresent(System.out::println);
    }

    /**
     * Создаёт Optional с возможным null. Если value = null, возвращает пустой Optional
     */
    public void ofNullable() {
        Optional<String> nullOptional = Optional.ofNullable(null);
        Optional<String> notNullOptional = Optional.ofNullable("Hello from ofNullable");
        nullOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Значение Optional null"));
        notNullOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Значение Optional null"));
    }

    /**
     * Возвращает пустой Optional
     */
    public void empty() {
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println, () -> System.out.println("Значение Optional null"));
    }

    /**
     * Демонстрация создания Optional
     */
    public static void main(String[] args){
        CreateOptional createOptional = new CreateOptional();
        createOptional.of();
        createOptional.ofNullable();
        createOptional.empty();
    }
}
