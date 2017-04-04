package geekbrains.ru;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8});

        for (Integer v : values)
            System.out.println(v);

        int step = 0;
        System.out.println("Step " + ++step);
        values.forEach((Integer v) -> { System.out.println(v); });
        System.out.println();

        System.out.println("Step " + ++step);
        values.forEach(v -> { System.out.println(v); });
        System.out.println();

        System.out.println("Step " + ++step);
        values.forEach(v -> System.out.println(v));
        System.out.println();

        System.out.println("Step " + ++step);
        values.forEach(System.out::println);

    }

}




