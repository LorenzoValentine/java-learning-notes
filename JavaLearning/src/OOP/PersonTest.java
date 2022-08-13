package OOP;

public class PersonTest {
    public static void main(String[] args) {
        // 创建Person类的对象
        Person p1 = new Person();
        // 调用对象的属性: 对象.属性
        p1.name = "Tom";
        p1.isMale = true;
        System.out.println(p1.name);

        // 调用对象的方法: 对象.方法
        p1.eat();
        p1.sleep();
        p1.talking("Chinese");

        // *************************************************************
        Person p2 = new Person();
        System.out.println(p2.name); // 未给p2赋值，所以默认为null

        // *************************************************************
        // 将p1变量保存的对象的地址值赋给p3，导致p1和p3指向了堆空间中的同一个对象实体
        Person p3 = p1;
        System.out.println(p3.name);

    }
}

class Person{
    //属性
    String name;
    int age = 1;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
    public void talking(String language){
        System.out.println("talking in " + language);
    }
}