package ru.katesh.examples.java.features.stream.api.terminal;

import java.util.List;

/**
 * Метод reduce берёт все элементы стрима и сворачивает их в одно значение, используя начальное значение (identity)
 * (опционально) и аккумулятор — функцию, которая объединяет два значения.
 */
public class ReduceStreamComponent {

    /**
     * Метод складывает значения списка используя метод reduce и проверяет туже сумму сложением через цикл, в консоль
     * выводит результат
     */
    public void reduceWithoutStartValue(){
        List<Double> list = List.of(10.0, 5.0, 15.0, 3.0);
        Double sum = list.stream()
                .reduce(Double::sum)
                .orElse(null);
        double sumTwo = 0.0;

        for(Double a : list) {
            sumTwo += a;
        }

        System.out.println("сумма c reduce = " + sum + " сумма с for = " + sumTwo);
    }

    /**
     * Метод складывает значения списка с начальным результатом используя метод reduce и проверяет туже сумму сложением
     * через цикл, в консоль выводит результат
     */
    public void reduceWithStartValue(Double startValue){
        List<Double> list = List.of(10.0, 5.0, 15.0, 3.0);
        Double sum = list.stream()
                .reduce(startValue, Double::sum);
        double sumTwo = startValue;

        for(Double a : list) {
            sumTwo += a;
        }

        System.out.println("сумма c reduce = " + sum + " сумма с for = " + sumTwo);
    }

    /**
     * Демонстрация работы метода reduce
     */
    public static void main(String[] args){
        ReduceStreamComponent reduceStreamComponent = new ReduceStreamComponent();
        reduceStreamComponent.reduceWithoutStartValue();
        reduceStreamComponent.reduceWithStartValue(2000.0);
    }
}
