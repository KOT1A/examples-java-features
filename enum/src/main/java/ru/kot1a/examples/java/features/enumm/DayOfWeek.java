package ru.kot1a.examples.java.features.enumm;

import java.util.Locale;

/**
 * Enum является обычным классом с ограниченным количеством экземпляров и некоторым набором дополнительных методов
 */
public enum DayOfWeek implements EnglishPrint{

    MONDAY("Понедельник", "MON"),
    TUESDAY("Вторник", "TUE"),
    WEDNESDAY("Среда", "WED"),
    THURSDAY("Четверг", "THU"),
    FRIDAY("Пятница", "FRI"),
    SATURDAY("Суббота", "SAT"),
    SUNDAY("Воскресенье", "SUN");

    static {
        DAY_OF_WEEK_RU = "День недели: ";
    }

    public static final String DAY_OF_WEEK_RU;
    public static String DAY_OF_WEEK_EN = "Day of week: ";

    private String russianNameOfWeek;
    private final String abbr;

    DayOfWeek(String name, String abbr) {
        this.russianNameOfWeek = name;
        this.abbr = abbr;
    }

    public String getRussianNameOfWeek(){
        return russianNameOfWeek;
    }

    public void setRussianNameOfWeek(String russianNameOfWeek){
        this.russianNameOfWeek = russianNameOfWeek;
    }

    public String getAbbr(){
        return abbr;
    }

    @Override
    public String toStringEn() {
        return DAY_OF_WEEK_EN + this.name().toLowerCase(Locale.ROOT) + "[" + this.abbr + "]";
    }

    @Override
    public String toString() {
        return DAY_OF_WEEK_RU + this.russianNameOfWeek + "[" + this.abbr + "]";
    }
}
