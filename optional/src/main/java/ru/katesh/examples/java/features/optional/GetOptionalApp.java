package ru.katesh.examples.java.features.optional;

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
        //Если значение внутри Optional null, то выбросится указанное исключение, иначе сам объект
        System.out.println(nameOptional.orElseThrow(RuntimeException::new));
        try {
            System.out.println(emptyOptional.orElseThrow(RuntimeException::new));
        } catch (RuntimeException e) {
            System.out.println("Содержимое optional пустое, было выброшено исключение");
        }

        System.out.println();
        //Если значение внутри Optional null, то вернётся значение аргумента метода orElse, иначе сам объект.
        //Значение переданное в orElseGet вычисляет только в том случае, если содержимое Optional равно null
        System.out.println(nameOptional.orElseGet(() -> "Содержимое optional пустое"));
        System.out.println(emptyOptional.orElseGet(() ->"Содержимое optional пустое"));
    }
}
