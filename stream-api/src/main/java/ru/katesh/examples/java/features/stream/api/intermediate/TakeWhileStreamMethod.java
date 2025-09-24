package ru.katesh.examples.java.features.stream.api.intermediate;

import java.util.List;

/**
 * Метод takeWhile берёт элементы из стрима с начала, пока выполняется условие
 */
public class TakeWhileStreamMethod {

    /**
     * Метод берёт элементы до тех пор, пока не встретит 0
     */
    public void takeWhile() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 0, 6, 7);

        List<Integer> result = numbers.stream()
                .takeWhile(n -> n > 0)
                .toList();

        System.out.println(result);
    }

    /**
     * Демонстрация работы метода takeWhile
     */
    public static void main(String[] args){
        TakeWhileStreamMethod takeWhileStreamMethod = new TakeWhileStreamMethod();
        takeWhileStreamMethod.takeWhile();
    }
}
