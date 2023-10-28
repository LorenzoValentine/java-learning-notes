package Polymorphism;

public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        // 不能直接调用子类特有的属性和方法
        // p1.earnMoney();
        // System.out.println(p1.isSmoking);

        // 向下转型
        Man m1 = (Man) p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);
        System.out.println(p1 == m1); // True, p1 和 m1指向堆空间中的同一个对象

        // 向下转型的问题：类型转换异常(ClassCastException)
        // 格式：a instanceof A: 判断a是否是A的实例，
        // 如果 a instanceof A 返回 true, 则 a instanceof superA 也返回 true, 其中，A 是 superA 的子类
        Person p2 = new Woman();
//        Man m2 = (Man) p2;
//        m2.earnMoney(); // 运行的时候会报错

        // 在向下转型之前使用instanceof进行类型的判断
        if (p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.earnMoney();
        }

    }
}
