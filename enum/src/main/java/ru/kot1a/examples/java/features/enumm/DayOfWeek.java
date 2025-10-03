package ru.kot1a.examples.java.features.enumm;

/**
 * Как и у обычного класса у enum могут быть обычные поля, константы и статические поля, константы.
 */
public enum DayOfWeek {

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
    public String toString() {
        return DAY_OF_WEEK_RU + this.russianNameOfWeek + "[" + this.abbr + "]";
    }
}
