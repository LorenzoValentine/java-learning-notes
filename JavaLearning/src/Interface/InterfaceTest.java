package Interface;

public class InterfaceTest {
    public static void main(String[] args) {
//        Flyable.MAX_SPEED = 7800; 不能对全局常量修改
    }
}

interface Flyable {
    // 全局常量
    public static final int MIN_SPEED = 0;

    // 可以省略public static final
    int MAX_SPEED = 7900;

    // 方法：jdk8之前：抽象, public abstract 可以省略，不能有方法体
    void fly();
}

interface Attackable {

}

class Plane implements Flyable, Attackable {
    @Override
    public void fly(){
        System.out.println("飞机可以飞");
    }
}

interface AA {
    void method1();
}
interface BB {
    void method2();
}
interface CC extends AA,BB { // 接口多继承

}

class DD implements CC {
    @Override
    public void method1(){
        System.out.println("1");
    }

    @Override
    public void method2(){
        System.out.println("2");
    }
}
