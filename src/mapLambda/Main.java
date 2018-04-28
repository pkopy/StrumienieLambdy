package mapLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;

public class Main {
    public static void main(String[] args) {

       List<Integer> elements = new ArrayList<>();
       elements.add(5);
       elements.add(8);
       elements.add(12);
        System.out.println(map(elements, s -> s + 5));

        List<Person> names = new ArrayList<>();
        names.add(new Person("Paweł"));
        names.add(new Person("Adam"));

        names.sort((o1,o2)->o1.getName().compareTo(o2.getName()));
        names.forEach(System.out::println);


    }

    public static List<Integer> map(List<Integer> list, Map map){
        List <Integer> newList = new ArrayList<>();
        for (Integer t : list) {
            newList.add(map.operation( t));

        }
        return newList;
    }
}
