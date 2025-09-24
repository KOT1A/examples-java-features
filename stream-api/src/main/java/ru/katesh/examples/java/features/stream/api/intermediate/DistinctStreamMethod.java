package ru.katesh.examples.java.features.stream.api.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * Метод distinct() возвращает новый стрим, в котором удалены все дубликаты элементов. Под капотом он использует
 * equals() и hashCode() объектов
 */
public class DistinctStreamMethod {

    /**
     * Метод оставляет уникальные элементы массива и выводит их в консоль
     */
    public void distinct() {
        String[] arr = {"1", "2", "3", "4", "5", "2", "3", "4"};

        List<String> arrUniq = Arrays.stream(arr)
                .distinct()
                .toList();

        System.out.println("Уникальные элементы массива = " + arrUniq);
    }

    /**
     * Демонстрация работы метода distinct
     */
    public static void main(String[] args){
        DistinctStreamMethod distinctStreamMethod = new DistinctStreamMethod();
        distinctStreamMethod.distinct();
    }
}
