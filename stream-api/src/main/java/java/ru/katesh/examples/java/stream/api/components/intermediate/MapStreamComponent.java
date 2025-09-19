package java.ru.katesh.examples.java.stream.api.components.intermediate;

import java.util.List;

/**
 * Метод map возвращает новый поток с преобразованными элементами.<br>
 * В аргументах принимает Function, которая преобразует объект первого типа, в объект второго типа.
 */
public class MapStreamComponent {

    /**
     * Метод преобразует все элементы списка строк к верхнему регистру и выводит их в консоль
     */
    public void map() {
        List<String> list = List.of("Aaaa", "abba", "Aa", "Bara", "Abba");
        List<String> newList = list.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Стало - " + newList);
    }

    /**
     * Демонстрация работы метода map
     */
    public static void main(String[] args) {
        MapStreamComponent mapStreamComponent = new MapStreamComponent();
        mapStreamComponent.map();
    }
}
