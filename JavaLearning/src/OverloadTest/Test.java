package OverloadTest;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);

        System.out.println("a=" + a + ",b=" + b);
    }

    public static void method(int a, int b) {
        a = a * a;
        b = 2 * b * b;
        System.out.println(a);
        System.out.println(b);
        System.exit(0);
    }
}

