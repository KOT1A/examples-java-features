package ru.kot1a.examples.java.features.stream.api.terminal;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Метод collect - это терминальная операция, которая преобразует поток в другой объект: список, множество, строку,
 * карту и т.д.
 */
public class CollectStreamMethod {

    /**
     * Примеры преобразования потока строк в коллекции и вывод их в консоль.
     */
    public void collectToCollection() {
        List<String> collectListNames = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.toList());

        List<String> toListNames = Stream.of("Kate", "Max", "Anna")
                .toList();

        Set<String> collectToSetNames = Stream.of("Kate", "Max", "Kate", "Anna")
                .collect(Collectors.toSet());

        System.out.println(collectListNames);
        System.out.println(toListNames);
        System.out.println(collectToSetNames);
    }

    /**
     * Пример преобразования потока строк в массив и вывод его в консоль.
     */
    public void collectToArray() {
        Object[] toArrayNames = Stream.of("Kate", "Max", "Anna")
                .toArray();

        System.out.println(Arrays.toString(toArrayNames));
    }

    /**
     * Пример преобразования потока строк в Map и вывод её в консоль.
     */
    public void collectToMap() {
        Map<Integer, String> map = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.toMap(
                        String::length,
                        name -> name,
                        (n1, n2) -> n1
                ));

        System.out.println(map);
    }

    /**
     * Пример преобразования потока строк в строки и вывод их в консоль.
     */
    public void collectToString() {
        String stringJoin = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.joining());

        String stringWithDelimiter = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.joining(", "));

        String stringWithPrefixAndSuffix = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.joining(", ", "[", "]"));

        System.out.println(stringJoin);
        System.out.println(stringWithDelimiter);
        System.out.println(stringWithPrefixAndSuffix);
    }

    /**
     * Пример склейки элементов потока с применением дополнительной функции после.
     */
    public void collectAndThen() {
        String str = Stream.of("Alice", "Bob", "Charlie")
                .collect(Collectors.collectingAndThen(
                        Collectors.joining(", "),
                        join -> "Имена: [" + join + "]"
                ));

        System.out.println(str);
    }

    /**
     * Пример агрегирующих операций над потоком данных:<br>
     *  - количество элементов потока<br>
     *  - среднее арифметическое значение элементов потока<br>
     *  - статистика по элементам потока: количество, минимальное, среднее арифметическое, максимальное значения<br>
     */
    public void collectStatistic() {
        long countWithCounting = Stream.of("Kate", "Max", "Anna")
                .collect(Collectors.counting());

        long count = Stream.of("Kate", "Max", "Anna")
                .count();

        double avg = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.averagingInt(i -> i));

        IntSummaryStatistics stats = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.summarizingInt(i -> i));

        System.out.println(countWithCounting);
        System.out.println(count);
        System.out.println(avg);
        System.out.println(stats);
    }

    /**
     * Пример группировки элементов потока в Map по длине, хранящую группы элементов.
     */
    public void collectGrouping() {
        Map<Integer, List<String>> groups = Stream.of("Kate", "Max", "Anna", "John", "Li")
                .collect(Collectors.groupingBy(String::length));

        System.out.println(groups);
    }

    /**
     * Пример группировки элементов потока в Map по длине, хранящую Mapу с группировкой по первому символу.
     */
    public void collectGroupingWithGrouping() {
        Map<Integer, Map<Character, List<String>>> result = Stream.of("Kate", "Kira", "Max", "Anna", "Li", "Leon")
                .collect(Collectors.groupingBy(
                        String::length,
                        Collectors.groupingBy(name -> name.charAt(0))
                ));

        System.out.println(result);
    }

    /**
     * Пример разделения потока данных на 2 группы, в данном случае на чётные и нечётные числа.
     */
    public void collectPartition() {
        Map<Boolean, List<Integer>> partitioned = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println(partitioned);
    }

    /**
     * Демонстрация работы метода collect с различными параметрами.
     */
    public static void main(String[] args){
        CollectStreamMethod collectStreamMethod = new CollectStreamMethod();
        collectStreamMethod.collectToCollection();
        collectStreamMethod.collectToArray();
        collectStreamMethod.collectToMap();
        collectStreamMethod.collectToString();
        collectStreamMethod.collectAndThen();
        collectStreamMethod.collectStatistic();
        collectStreamMethod.collectGrouping();
        collectStreamMethod.collectGroupingWithGrouping();
        collectStreamMethod.collectPartition();
    }
}
