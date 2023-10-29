package ObjectTst.tostring;

public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        System.out.println(u1.toString()); // 输出为: ObjectTst.tostring.User@36baf30c
        System.out.println(u1); // 输出为: ObjectTst.tostring.User@36baf30c
    }
}

class User{
    String name;
    int age;

    public User(){
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 手动实现toString()
//    @Override
//    public String toString() {
//        return "User{ name: " + name + " age: " + age + " }";
//    }

    // Intellij自动重写

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
