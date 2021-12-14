package task20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> result = numbers.stream()
                .filter((num) -> (num % 2) == 0)
                .map((num) -> (num * num))
                .collect(Collectors.toList());
        System.out.println(result);

//

        List<String> name = new ArrayList<>();
        name.add("Egor");
        name.add("vanya");
        name.add("Nasty");
        name.add("Sonya");
        name.add("vika");

        Predicate<List<String>> predicate = (input) -> (name.stream()
                .filter((input2) -> Character.isUpperCase(input2.charAt(0)))
                .count() > 2);
        long count = name.stream().map(input -> name).filter(predicate).count();

        System.out.println(count > 2);

//

        Map<Integer, Boolean> map = new HashMap<>();
        map.put(1, true);
        map.put(2, false);
        map.put(3, false);
        map.put(4, true);
        map.put(5, false);
        map.put(6, true);

        List<Integer> sort = map.entrySet().
                stream().filter(Map.Entry::getValue)
                .sorted((input, input2) -> input2.getKey() - input.getKey())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(sort);
    }
}
