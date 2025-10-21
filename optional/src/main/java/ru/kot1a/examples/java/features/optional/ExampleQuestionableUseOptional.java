package ru.kot1a.examples.java.features.optional;

import java.util.Optional;

/**
 * Примеры сомнительного использования Optional
 */
public class ExampleQuestionableUseOptional {

    public String ifNullThen(String name){
        return Optional.ofNullable(name)
                .filter(s -> !s.isBlank())
                .map(s -> s + " молодец!")
                .orElse("Не понятно кого назвать молодцом");

        //Вариант с Optional эквивалентен коду ниже:
        /*
        return name != null && !name.isBlank()
                ? name + " молодец!"
                : "Не понятно кого назвать молодцом";
         */
    }

    public static void main(String[] args){
        ExampleQuestionableUseOptional exampleOptional = new ExampleQuestionableUseOptional();
        String result = exampleOptional.ifNullThen("Dima");
        System.out.println(result);
        String nullResult = exampleOptional.ifNullThen(null);
        System.out.println(nullResult);
        String emptyResult = exampleOptional.ifNullThen("   ");
        System.out.println(emptyResult);
    }
}
