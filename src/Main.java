import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("oskar", "paweł", "magda", "ryś"));

//        names.sort((s,s1) -> s.compareTo(s1) * -1);
//        names.forEach(System.out::println);
//
//        Nameator nameator = s -> s.toUpperCase();
//        System.out.println(nameator.getName("damian"));

        showMe(s -> s.toUpperCase(), "koteczek");
        showMe(s -> s.concat(" - coś doklejamy"), "hejo");
        showMe(s -> String.valueOf(s.charAt(0)), "HEJO");
        showMe(s -> s + "++++", "Morda");
        showMe(s -> {for(int i = 0; i < 5; i++){s += " ss";} return  s;}, "tata");
        showMe(s -> s.equals("kot")?"true":"false", "pies");
        showMe(s -> String.valueOf(s.length()), "mortadela");
    }

    public static void showMe(Function<String, String> nameator, String name) {
        System.out.println(nameator.apply(name));
    }
}
