package _abstractClass;

public abstract class Person { // 这里是抽象类，不能有实例

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public abstract void eat(){   <---抽象方法
//        System.out.println("人吃饭");  <---这里不能有方法体
//    }
    public abstract void eat();

    public void sleep(){
        System.out.println("人睡觉");
    }
}
