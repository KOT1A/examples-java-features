package ru.katesh.examples.java.features.stream.api.intermediate;

import java.util.Arrays;
import java.util.List;

/**
 * Метод filter возвращает новый поток с элементами, прошедшими проверку.<br>
 * В аргументах принимает predicate.<br>
 * Predicate — функциональный интерфейс (принимает объект и возвращает true или false).
 */
public class FilterStreamMethod {

    /**
     * Метод отбирает по фильтру все элементы, у которых длинна больше 3 и начинаются они с буквы A и выводит их в
     * консоль
     */
    public void filter() {
        String[] array = {"Aaaa", "abba", "Aa", "Bara", "Abba"};
        List<String> list = Arrays.stream(array)
                .filter(s -> s.length() > 3 && s.startsWith("A"))
                .toList();

        System.out.println("Отфильтрованный массив - " + list);
    }


    /**
     * Метод отбирает по фильтру все элементы, у которых длинна больше 3 и начинаются они с буквы A и выводит их в
     * консоль
     */
    public void doubleFilter() {
        String[] array = {"Aaaa", "abba", "Aa", "Bara", "Abba"};
        List<String> list = Arrays.stream(array)
                .filter(s -> s.length() > 3 && s.startsWith("A"))
                .filter(s -> s.startsWith("A"))
                .toList();

        System.out.println("Отфильтрованный массив - " + list);
    }

    /**
     * Демонстрация работы метода filter
     */
    public static void main(String[] args) {
        FilterStreamMethod filterStreamMethod = new FilterStreamMethod();
        filterStreamMethod.filter();
        filterStreamMethod.doubleFilter();
    }
}
