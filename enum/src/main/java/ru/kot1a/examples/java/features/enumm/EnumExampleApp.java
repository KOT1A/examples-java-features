package ru.kot1a.examples.java.features.enumm;

public class EnumExampleApp {

    /**
     * Преобразует строку в enum, используя стандартный метод
     */
    public void valueOf() {
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println("valueOf - " + monday.getAbbr());
    }

    /**
     * Вызывает встроенный метод, который возвращает enum в виде строки
     */
    public void name() {
        String tuesday = DayOfWeek.TUESDAY.name();
        System.out.println("name - " + tuesday);
    }

    /**
     * Вызывает встроенный метод, чтобы узнать порядковый номер enum
     */
    public void ordinal() {
        int wednesday = DayOfWeek.WEDNESDAY.ordinal();
        System.out.println("ordinal - " + wednesday);
    }

    /**
     * Выводит все элементы enum
     */
    public void forEach() {
        System.out.println("Выводим все элементы enum:");
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d);
        }
    }

    /**
     * Выводит все элементы enum, используя добавленный метод
     */
    public void forEachEn() {
        System.out.println("Выводим все элементы(EN) enum:");
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d.toStringEn());
        }
    }

    /**
     * Меняет состояние enum через добавленный метод
     */
    public void changeField() {
        System.out.println("russianNameOfWeek - " + DayOfWeek.WEDNESDAY.getRussianNameOfWeek());
        DayOfWeek.WEDNESDAY.setRussianNameOfWeek("Средулька");
        System.out.println("russianNameOfWeek - " + DayOfWeek.WEDNESDAY.getRussianNameOfWeek());
    }

    /**
     * Демонстрация работы с enum
     */
    public static void main(String[] args){
        EnumExampleApp enumExampleApp = new EnumExampleApp();
        enumExampleApp.valueOf();
        enumExampleApp.name();
        enumExampleApp.ordinal();
        enumExampleApp.forEach();
        enumExampleApp.forEachEn();
        enumExampleApp.changeField();
    }
}
