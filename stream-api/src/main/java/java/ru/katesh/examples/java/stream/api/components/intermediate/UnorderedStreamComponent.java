package java.ru.katesh.examples.java.stream.api.components.intermediate;

import java.util.List;

/**
 * Метод unordered() возвращает новый стрим, у которого убирается требование соблюдать порядок элементов. Если исходный
 * стрим упорядоченный (например, List.stream() или Stream.of()), то после unordered() он становится неупорядоченным.
 * Если исходный стрим и так неупорядоченный (например, из HashSet), то вызов unordered() ничего не меняет. Важно: сами
 * данные не меняются, меняется только логика обработки стрима.  Метод unordered полезен когда порядок неважен, он
 * позволяет стриму работать быстрее, т.к. не нужно синхронизировать или сохранять порядок элементов. Также может
 * ускорить выполнение при работе вместе с методами distinct, limit и skip, так как также не нужно поддерживать соблюдение
 * порядка.
 */
public class UnorderedStreamComponent {

    /**
     * Пример выполнения unordered на последовательном и параллельном стриме
     */
    public void unordered() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Последовательный стрим: ");
        numbers.stream()
                .unordered()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Параллельный стрим: ");
        numbers.parallelStream()
                .unordered()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    /**
     * Демонстрация работы метода unordered
     */
    public static void main(String[] args){
        UnorderedStreamComponent unorderedStreamComponent = new UnorderedStreamComponent();
        unorderedStreamComponent.unordered();
    }
}
