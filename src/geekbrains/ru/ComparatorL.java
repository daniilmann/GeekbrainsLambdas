package geekbrains.ru;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorL {

    public static void main(String[] args) {

        List<Integer> sValues = new ArrayList<>();
        sValues.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8}));

        sValues.sort(new Comparator<Integer>() {

            @Override
            public int compare(Integer arg0, Integer arg1) {
                return arg1 - arg0;
            }
        });

        System.out.println("Sorted array old way:");
        for (Integer v : sValues)
            System.out.print(v + " ");
        System.out.println("\n\n");


        sValues.clear();
        sValues.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8}));

        System.out.println("Sorted array lambdas:");
        sValues.sort((v0, v1) -> v1 - v0);
        System.out.println(sValues.stream().map(String::valueOf).collect(Collectors.joining(" ")));

    }
}
