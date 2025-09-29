package ru.kot1a.examples.java.features.stream.api.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamExampleApp {

    /**
     * Метод выполняет некоторую операцию в нескольких потоках.
     */
    public void randomParallelPrintStream(List<Integer> list) {
        list.parallelStream()
                .filter(v -> v >= 0)
                .map((v) -> {
                    int value = v * 2 - 3;
                    char[] array = new char[100];
                    for (int i = 0; i < value; i++){
                        if (i < 100) {
                            array[i] = (char) i;
                        } else {
                            int j = i % 100;
                            array[j] = (char) j;
                        }
                    }
                    return Arrays.toString(array);
                })
                .toList();
    }

    /**
     * Метод выполняет некоторую операцию в одном потоке.
     */
    public void printStream(List<Integer> list) {
        list.stream()
                .filter(v -> v >= 0)
                .map((v) -> {
                    int value = v * 2 - 3;
                    char[] array = new char[100];
                    for (int i = 0; i < value; i++){
                        if (i < 100) {
                            array[i] = (char) i;
                        } else {
                            int j = i % 100;
                            array[j] = (char) j;
                        }
                    }
                    return Arrays.toString(array);
                })
                .toList();
    }

    /**
     * Демонстрация работы обычного и параллельного стрима.
     */
    public static void main(String[] args){
        List<Integer> list = IntStream.range(0, 100_000).boxed().toList();

        ParallelStreamExampleApp parallelStreamExampleApp = new ParallelStreamExampleApp();
        long parallelStreamTime = System.currentTimeMillis();
        parallelStreamExampleApp.randomParallelPrintStream(list);
        parallelStreamTime = System.currentTimeMillis() - parallelStreamTime;

        ParallelStreamExampleApp streamExampleApp = new ParallelStreamExampleApp();
        long streamTime = System.currentTimeMillis();
        streamExampleApp.printStream(list);
        streamTime = System.currentTimeMillis() - streamTime;

        System.out.println("parallelStreamTime - " + parallelStreamTime);
        System.out.println("streamTime - " + streamTime);
    }
}
