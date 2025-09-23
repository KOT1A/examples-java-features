package ru.katesh.examples.java.features.stream.api.intermediate;

import java.util.List;

/**
 * Метод dropWhile пропускает элементы с начала стрима, пока предикат возвращает true. Как только встретился первый
 * элемент, для которого предикат false с него и до конца все элементы попадают в результат. Это ленивый метод, данные
 * реально обрабатываются только при терминальной операции.
 */
public class DropWhileStreamComponent {

    /**
     * Метод пропускает элементы пока не встретит слово stop
     */
    public void dropWhile() {
        List<String> words = List.of("a", "b", "c", "stop", "d", "e");
        List<String> result = words.stream()
                .dropWhile(w -> !w.equals("stop"))
                .toList();
        System.out.println(result);
    }

    /**
     * Демонстрация работы метода dropWhile
     */
    public static void main(String[] args) {
        DropWhileStreamComponent dropWhileStreamComponent = new DropWhileStreamComponent();
        dropWhileStreamComponent.dropWhile();
    }
}
