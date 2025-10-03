package ru.kot1a.examples.java.features.enumm;

public class EnumExampleApp {

    /**
     * Встроенный метод, который преобразует строку в enum
     */
    public void valueOf() {
        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
        System.out.println("valueOf - " + monday.getAbbr());
    }

    /**
     * Встроенный метод, который возвращает имя enum
     */
    public void name() {
        String tuesday = DayOfWeek.TUESDAY.name();
        System.out.println("name - " + tuesday);
    }

    /**
     * Встроенный метод, который возвращает порядковый номер enum
     */
    public void ordinal() {
        int wednesday = DayOfWeek.WEDNESDAY.ordinal();
        System.out.println("ordinal - " + wednesday);
    }

    /**
     * Метод выводит все элементы enum
     */
    public void forEach() {
        System.out.println("Выводим все элементы enum:");
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.println(d);
        }
    }

    /**
     * Встроенный метод, который возвращает порядковый номер enum
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
        enumExampleApp.changeField();
    }
}
