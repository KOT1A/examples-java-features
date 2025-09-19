package ru.katesh.examples.java.features.stream.api.terminal;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Примеры terminal операций Java Stream API
 */
public class OtherTerminalStreamComponent {

    /**
     * Метод count выводит количество элементов в списке
     */
    public void count() {
        List<String> words = Arrays.asList("java", "stream", "api");

        long count = words.stream().count();

        System.out.println("Количество элементов в списке = " + count);
    }

    /**
     * Метод min ищем минимальный элемент списка
     */
    public void min() {
        List<Integer> numbers = Arrays.asList(10, 3, 45, 2, 18);

        Integer min = numbers.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println("Минимальный элемент списка = " + min);
    }

    /**
     * Метод max ищем максимальный элемент списка
     */
    public void max() {
        List<Integer> numbers = Arrays.asList(10, 3, 45, 2, 18);

        Integer max = numbers.stream()
                .max(Integer::compareTo)
                .get();

        System.out.println("Максимальный элемент списка = " + max);
    }

    /**
     * Метод forEach выполняет действие для каждого элемента (обычно используется для вывода)
     */
    public void forEach() {
        List<String> words = Arrays.asList("one", "two", "three");

        words.stream().forEach(System.out::println);
    }

    /**
     * Метод toArray преобразует поток в массив
     */
    public void toArray() {
        List<String> words = Arrays.asList("one", "two", "three");

        String[] array = words.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }

    /**
     * Методы anyMatch, allMatch, noneMatch проверяют условия на элементах потока
     */
    public void match() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> numbersNoAnyEven = Arrays.asList(1, 3, 5);
        List<Integer> numbersAllEven = Arrays.asList(2, 4, 6, 8);
        List<Integer> numbersNoNoneNegative = Arrays.asList(-2, 4, 6, 8);

        //соответствует любой элемент
        boolean yesAnyEven = numbers.stream().anyMatch(n -> n % 2 == 0);
        boolean noAnyEven = numbersNoAnyEven.stream().anyMatch(n -> n % 2 == 0);
        //соответствуют все элементы
        boolean yesAllEven = numbersAllEven.stream().allMatch(n -> n % 2 == 0);
        boolean noAllEven = numbers.stream().allMatch(n -> n % 2 == 0);
        //ни один элемент не соответствует
        boolean yesNoneNegative = numbers.stream().noneMatch(n -> n < 0);
        boolean noNoneNegative = numbersNoNoneNegative.stream().noneMatch(n -> n < 0);

        System.out.println(yesAnyEven);
        System.out.println(noAnyEven);
        System.out.println(yesAllEven);
        System.out.println(noAllEven);
        System.out.println(yesNoneNegative);
        System.out.println(noNoneNegative);
    }

    /**
     * Через методы findFirst или findAny, можно найти первое вхождение или любое вхождение элемента потока
     * соответственно
     */
    public void find() {
        List<String> words = Arrays.asList("one", "two", "three");

        String first = words.stream().findFirst().get();
        String any = words.parallelStream().findAny().get();

        System.out.println(first);
        System.out.println(any);
    }

    /**
     * Метод iterator возвращает iterator, которым можно пройтись по коллекции
     */
    public void iterator() {
        List<String> words = Arrays.asList("one", "two", "three");

        Iterator<String> it = words.stream().iterator();

        it.forEachRemaining(System.out::println);
    }

    /**
     * Демонстрация работы терминальных методов
     */
    public static void main(String[] args){
        OtherTerminalStreamComponent otherTerminalStreamComponent = new OtherTerminalStreamComponent();
        otherTerminalStreamComponent.count();
        otherTerminalStreamComponent.min();
        otherTerminalStreamComponent.max();
        otherTerminalStreamComponent.forEach();
        otherTerminalStreamComponent.toArray();
        otherTerminalStreamComponent.match();
        otherTerminalStreamComponent.find();
        otherTerminalStreamComponent.iterator();
    }
}
