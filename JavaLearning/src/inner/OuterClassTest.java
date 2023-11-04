package inner;

public class OuterClassTest {

    public static void main(String[] args) {
        // 创建Person的静态的成员内部类实例
        Person.Dog dog = new Person.Dog();
        dog.eat();
        // 创建Person的非静态的成员内部类实例
        // Person.Bird bird = new Person().Bird; 报错，需要创建Person实例
        Person p1 = new Person();
        Person.Bird b1 = p1.new Bird();
        b1.eat();
        b1.show("黄鹂");
    }
}

class Person { // 外部类

    String name = "Tom";
    int age = 10;

    // 静态的成员内部类
    static class Dog{
        public void eat(){
            System.out.println("dog eat bone");
        }
    }

    // 非静态的成员内部类
    class Bird {
        String name = "Cocatoo";
        public void eat(){
            System.out.println("dog eat worm");
        }

        public void show(String name){
            System.out.println("age= " + age); // 这里由于Bird没有age，所以调用的Person的，省略了Person.this
            System.out.println("name= " + name); // 这里调用的是形参的name
            System.out.println("name= " + this.name); // 这里调用的是Bird的name
            System.out.println("name= " + Person.this.name); // 这里调用的是Person的name
        }

    }

    // 方法内
    public void method(){
        // 局部内部类
        class InnerClass{

        }
    }

    // 构造器内
    public Person(){
        // 局部内部类
        class InnerClass{

        }
    }
}
