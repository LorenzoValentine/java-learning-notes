package Generic.selfdefine;

import org.junit.Test;

public class GenericTest {
    // 测试自定义泛型类
    @Test
    public void test(){
        // 实例化时，就可以指明类的泛型参数的类型
        Order order = new Order();
        Object obj = order.getT();

        // 泛型参数在指明时，只能使用引用数据类型，不能使用基本数据类型，但是可以使用包装类来替代
        Order<Integer> order1 = new Order<>();
        Integer t = order1.getT();

        // 在实例化时，可以指明类的泛型参数的具体类型。一旦类型被知名，则在泛型类中凡是使用了此泛型参数的位置，都将替换为指定的类型
        Order<String> order2 = new Order<>();
        String t1 = order2.getT();

    }
}
