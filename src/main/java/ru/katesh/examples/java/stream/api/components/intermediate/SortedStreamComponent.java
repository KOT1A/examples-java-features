package ru.katesh.examples.java.stream.api.components.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * Метод sorted в Java Stream API относится к промежуточным операциям и является stateful (он должен видеть весь
 * поток, чтобы отсортировать).
 */
public class SortedStreamComponent {

    /**
     * Пример работы сортировки
     */
    public void sorted() {
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5, 13, 14, 15, 10, 11, 12};
        List<Integer> list = Arrays.stream(arr)
                .toList();
        System.out.println("Массив отсортированный по возрастанию = " + list);
    }

    /**
     * Пример работы сортировки с указанием comparator
     */
    public void sortedWithComparator() {
        Integer[] arr = {1, 9, 2, 8, 3, 7, 4, 6, 5, 13, 14, 15, 10, 11, 12};
        List<Integer> list = Arrays.stream(arr)
                .sorted((o1, o2) -> o2 - o1)
                .toList();
        System.out.println("Массив отсортированный по убыванию = " + list);
    }

    /**
     * Демонстрация работы метода sorted
     */
    public static void main(String[] args){
        SortedStreamComponent sortedStreamComponent = new SortedStreamComponent();
        sortedStreamComponent.sorted();
        sortedStreamComponent.sortedWithComparator();
    }
}
