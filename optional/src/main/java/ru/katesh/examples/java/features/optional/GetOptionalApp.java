package ru.katesh.examples.java.features.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class GetOptionalApp {

    /**
     * Демонстрация безопасного извлечения содержимого Optional
     */
    public static void main(String[] args){
        Optional<String> nameOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        //Если значение внутри Optional null, то вернётся значение аргумента метода orElse, иначе сам объект
        System.out.println(nameOptional.orElse("Содержимое optional пустое"));
        System.out.println(emptyOptional.orElse("Содержимое optional пустое"));

        System.out.println();
        //Если значение внутри Optional null, то вернётся значение аргумента метода orElse, иначе сам объект.
        //Значение переданное в orElseGet вычисляет только в том случае, если содержимое Optional равно null
        System.out.println(nameOptional.orElseGet(() -> "Содержимое optional пустое"));
        System.out.println(emptyOptional.orElseGet(() ->"Содержимое optional пустое"));

        System.out.println();
        //Если значение внутри Optional null, то выбросится NoSuchElementException, иначе сам объект
        System.out.println(nameOptional.orElseThrow());
        try {
            System.out.println(emptyOptional.orElseThrow());
        } catch (NoSuchElementException e) {
            System.out.println("Содержимое optional пустое, было выброшено исключение NoSuchElementException");
        }

        System.out.println();
        //Если значение внутри Optional null, то выбросится указанное исключение, иначе сам объект
        System.out.println(nameOptional.orElseThrow(RuntimeException::new));
        try {
            System.out.println(emptyOptional.orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            System.out.println("Содержимое optional пустое, было выброшено исключение RuntimeException");
        }

        System.out.println();
        //Если значение пустое, то заменяем на другой Optional
        //Можно вызывать цепочку or в случае поиска значения из нескольких источник(кэш, бд и т.п.)
        nameOptional.or(() -> Optional.of("Пустое значение")).ifPresent(System.out::println);
        emptyOptional.or(() -> Optional.of("Пустое значение")).ifPresent(System.out::println);
    }
}
