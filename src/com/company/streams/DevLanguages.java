package com.company.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Using Streams print the languages (non-duplicate) the teams knows
// format Language : {language}

//Using Streams print the most used language by the team
// format Language : {language}

//Using Streams print the languages the team shares (duplicates)
// format Language : {language}
public class DevLanguages {
    private final List<Developer> devs;

    public DevLanguages() {
        Developer dev1 = new Developer("John", "TeamFab", List.of("Java", "Cobol", "C++", "Python"));
        Developer dev2 = new Developer("Paul", "TeamFab", List.of("Scala", "C#", "Clojure"));
        Developer dev3 = new Developer("George", "TeamBar", List.of("C#", "Java", "JavaScript"));
        Developer dev4 = new Developer("Ringo", "TeamBar", List.of("Python", "Java", "C", "JavaScript"));
        this.devs = List.of(dev1, dev2, dev3, dev4);
    }

    public void printNonDuplicatedLanguages() {
        devs.stream()
                .map(Developer::languages)
                .flatMap(languages -> languages.stream())
                .distinct()
                .forEach(l -> System.out.println("\tLanguage: " + l));
    }

    public void printMostUsedLanguage() {
        devs.stream()
                .map(Developer::languages)
                .flatMap(languages -> languages.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("\tLanguage: " + entry.getKey()));
    }

    public void printDuplicatedLanguages() {
        devs.stream()
                .map(Developer::languages)
                .flatMap(languages -> languages.stream())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("\tLanguage: " + entry.getKey()));
    }
}

record Developer(String name, String team, List<String> languages) {}
