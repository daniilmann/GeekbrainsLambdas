package geekbrains.ru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> sValues = new ArrayList<>();
        sValues.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8}));

        System.out.println("min : " + sValues.stream().min(Integer::compareTo).get());
        System.out.println("max : " + sValues.stream().max(Integer::compareTo).get());

        System.out.println("\nFiltered list:");
        sValues = sValues.parallelStream().filter(v -> v % 2 == 0 ).collect(Collectors.toList());
        System.out.println(sValues.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }

}
