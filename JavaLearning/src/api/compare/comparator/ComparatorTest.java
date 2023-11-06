package api.compare.comparator;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    @Test
    public void test(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro", 6999);
        arr[1] = new Product("Xiaomi13pro", 2323);
        arr[2] = new Product("VivoX90pro", 1362);
        arr[3] = new Product("Iphone14ProMax", 10000);
        arr[4] = new Product("HonorMagic", 2291);


        // 创建一个实现了Comparator接口的实现类对象
        Comparator<Product> comparator = new Comparator() {
            // 如何判断两个对象的大小：其标准就是此方法的方法体要写的
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product && o2 instanceof Product){
                    Product p1 = (Product) o1;
                    Product p2 = (Product) o2;

                    int value = Integer.compare(p1.getPrice(), p2.getPrice());
                    if (value != 0){
                        return -value;
                    }
                    return -p1.getName().compareTo(p2.getName());
                }
                throw new RuntimeException("参数不匹配");
            }
        };
        Arrays.sort(arr, comparator);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
