package StaticKeyword;

public class ChineseTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.name = "name1";
        c1.age = 40;
        // 这里只对c1的nationality赋值，作用会在所有的nationality都会更改
        c1.nationality = "China";

        Chinese c2 = new Chinese();
        c2.name = "name2";
        c2.age = 17;

        System.out.println(c1.nationality); // China
        System.out.println(c2.nationality); // China




    }
}

class Chinese{
    // 非静态变量，对于每个新的变量是不一样的
    String name;
    int age;

    // 静态变量
    static String nationality;

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}