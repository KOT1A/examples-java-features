package ru.katesh.examples.java.stream.api.components;

import java.util.Arrays;
import java.util.List;

/**
 * Возвращает новый поток с элементами, прошедшими проверку.<br>
 * В аргументах принимает predicate<br>
 * Predicate — функциональный интерфейс (принимает объект и возвращает true или false).
 */
public class FilterStreamComponent {

    public void filter() {
        String[] array = {"Aaaa", "abba", "Aa", "Bara", "Abba"};
        List<String> list = Arrays.stream(array)
                .filter(s -> s.length() > 3 && s.startsWith("A"))
                .toList();
        System.out.println("Отфильтрованный массив - " + list);
    }

    public void doubleFilter() {
        String[] array = {"Aaaa", "abba", "Aa", "Bara", "Abba"};
        List<String> list = Arrays.stream(array)
                .filter(s -> s.length() > 3 && s.startsWith("A"))
                .filter(s -> s.startsWith("A"))
                .toList();
        System.out.println("Отфильтрованный массив - " + list);
    }

    public static void main(String[] args) {
        FilterStreamComponent filterStreamComponent = new FilterStreamComponent();
        filterStreamComponent.filter();
        filterStreamComponent.doubleFilter();
    }
}
