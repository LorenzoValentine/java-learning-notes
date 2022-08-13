package OverloadTest;

public class MethodArgsTest {
    public static void main(String[] args) {
        MethodArgsTest test = new MethodArgsTest();
        test.show(12); //
        test.show("Hello");
        test.show("Hello", "World!");
    }

    public void show(int i) { }
    public void show(String s) { }
    // 可变形参
    public void show(String ... s){ }
    // public void show(String[] strs){ }
}
