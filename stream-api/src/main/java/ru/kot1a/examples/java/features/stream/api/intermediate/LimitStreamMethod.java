package ru.kot1a.examples.java.features.stream.api.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * Метод limit возвращает новый поток, содержащий не больше
 */
public class LimitStreamMethod {

    /**
     * Пример использования метода limit
     */
    public void limit() {
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5, 13, 14, 15, 10, 11, 12};

        List<Integer> list = Arrays.stream(arr)
                .limit(5)
                .toList();

        System.out.println("Возвращаем не более 5 элементов = " + list);
    }

    /**
     * Демонстрация работы метода sorted
     */
    public static void main(String[] args){
        LimitStreamMethod limitStreamMethod = new LimitStreamMethod();
        limitStreamMethod.limit();
    }
}
