package ru.katesh.examples.java.stream.api.components;

import java.util.List;

/**
 * Метод map принимает функцию, которая применяется к каждому элементу потока, и возвращает новый поток с
 * преобразованными элементами.<br>
 */
public class MapStreamComponent {

    public void map() {
        List<String> list = List.of("Aaaa", "abba", "Aa", "Bara", "Abba");
        List<String> newList = list.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Стало - " + newList);
    }

    public static void main(String[] args) {
        MapStreamComponent mapStreamComponent = new MapStreamComponent();
        mapStreamComponent.map();
    }
}
