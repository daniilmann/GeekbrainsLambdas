package geekbrains.ru;

public class Areas {

    public static void main(String[] args) {
        test("ONE", "TWO");
    }

    public static void test(String a, String b) {
        Runnable r = () -> {
            System.out.println(a);
            System.out.println(b);
        };
        new Thread(r).start();
    }

    public static void testF(String a, String b) {
//        a = "NOPE";
        Runnable r = () -> {
//            b = "NOPE";
            System.out.println(a);
            System.out.println(b);
        };
        new Thread(r).start();
    }

}
