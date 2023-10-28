package Polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        // 多态性之前的场景
        Person p1 = new Person();
        Man m1 = new Man();

        // 多态性
        Person p2 = new Man();

        // 多态性的应用: 虚拟方法调用
        // 在多态场景下，调用方法时：
        // 编译时看左边，即认为方法时左边声明的父类的类型的方法（被重写的方法）
        // 运行时看右边，即实际执行的是子类重写父类的方法
        p2.eat();
        p2.walk();

    }

}
