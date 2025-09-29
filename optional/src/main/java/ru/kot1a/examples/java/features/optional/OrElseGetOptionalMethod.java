package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

public class OrElseGetOptionalMethod {

    /**
     * Метод возвращает значение, если оно есть, иначе вычисляет и возвращает результат supplier переданный в аргумент
     * метода. Ключевым отличием от метода orElse является то, что значение переданное в orElseGet вычисляет только в
     * том случае, если содержимое Optional равно null.
     */
    public void orElseGet() {
        Optional<String> javaOptional = Optional.of("Java");
        Optional<String> emptyOptional = Optional.empty();

        System.out.println(javaOptional.orElseGet(() -> {
            System.out.println("Возвращаемое значение не вычислялось, так как Optional не пуст");
            return "Содержимое optional пустое";
        }));
        System.out.println(emptyOptional.orElseGet(() -> {
            System.out.println("Возвращаемое значение вычислялось, так как Optional пуст");
            return "Содержимое optional пустое";
        }));
    }

    /**
     * Демонстрация работы метода orElseGet.
     */
    public static void main(String[] args){
        OrElseGetOptionalMethod orElseGetOptionalMethod = new OrElseGetOptionalMethod();
        orElseGetOptionalMethod.orElseGet();
    }
}
