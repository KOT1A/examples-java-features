package ru.katesh.examples.java.features.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class CreateAndGetOptionalApp {

    /**
     * Демонстрация создания Optional и методов isPresent, isEmpty, get
     */
    public static void main(String[] args){
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> nullOptional = Optional.ofNullable(null);
        Optional<String> notNullOptional = Optional.ofNullable("Hello from ofNullable");
        Optional<String> emptyOptional = Optional.empty();

        //Если значение внутри Optional не null, то вернётся true, иначе false
        System.out.println(nameOptional.isPresent());
        System.out.println(nullOptional.isPresent());
        System.out.println(notNullOptional.isPresent());
        System.out.println(emptyOptional.isPresent());

        System.out.println();
        //Если значение внутри Optional null, то вернётся true, иначе false (противоположный методу isPresent)
        System.out.println(nameOptional.isEmpty());
        System.out.println(nullOptional.isEmpty());
        System.out.println(notNullOptional.isEmpty());
        System.out.println(emptyOptional.isEmpty());

        System.out.println();
        //Если значение внутри Optional не null, то вернётся объект, иначе будет ошибка NoSuchElementException
        System.out.println(nameOptional.get());
        try {
            System.out.println(nullOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("Тут был NoSuchElementException");
        }
        System.out.println(notNullOptional.get());
        try {
            System.out.println(emptyOptional.get());
        } catch (NoSuchElementException e) {
            System.out.println("Тут был NoSuchElementException");
        }
    }
}
