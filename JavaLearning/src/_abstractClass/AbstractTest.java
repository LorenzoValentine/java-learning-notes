package _abstractClass;

public class AbstractTest {
    public static void main(String[] args) {
//        Person p1 = new Person(); 这里报错因为Person是抽象类不能被实例化
//        p1.eat();

        Student s1 = new Student();
        s1.sleep();
    }
}
