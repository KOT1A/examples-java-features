package java.ru.katesh.examples.java.stream.api.components.intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Метод flatMap трансформирует объект в поток, а затем соединяет эти потоки в один
 */
public class FlatMapStreamComponent {

    /**
     * Преобразуем список строк в слова
     */
    public void flatMap() {
        List<String> sentences = List.of(
                "Java is fun",
                "Streams are powerful"
        );

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .toList();

        System.out.println(words);
    }

    /**
     * Преобразуем список списков строк в один список
     */
    public void flatMapWithListOfList() {
        List<List<String>> listOfListWords = new ArrayList<>();
        listOfListWords.add(List.of("a", "aa", "aaa"));
        listOfListWords.add(List.of("b", "bb", "bbb"));
        listOfListWords.add(List.of("c", "cc", "ccc"));

        List<String> words = listOfListWords.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(words);
    }

    /**
     * Демонстрация работы метода flatMap
     */
    public static void main(String[] args){
        FlatMapStreamComponent flatMapStreamComponent = new FlatMapStreamComponent();
        flatMapStreamComponent.flatMap();
        flatMapStreamComponent.flatMapWithListOfList();
    }
}
