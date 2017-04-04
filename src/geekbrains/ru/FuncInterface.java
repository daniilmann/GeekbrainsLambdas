package geekbrains.ru;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FuncInterface {

    public static void main(String[] args) {

        List<Integer> sValues = new ArrayList<>();
        sValues.addAll(Arrays.asList(new Integer[]{0,1,2,3,4,5,6,7,8}));

        IFuncTest ift = i -> i > 5;
        for (Integer v: sValues)
            if (ift.test(v))
                System.out.print(v + " ");

        System.out.print("\n\nOnly odds:\n");
        Predicate<Integer> pft = i -> i % 2 == 0;
        sValues.removeIf(pft);
        sValues.forEach(System.out::println);

    }

}

@FunctionalInterface
interface IFuncTest {
    public boolean test(Integer v);

    default void a(){}
    default void b(){}
}
