package api.compare.comparable;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {
    @Test
    public void test(){
        String[] arr = new String[]{"Tom", "Apple", "Jerry", "Rose", "Lucy", "Jack"};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2(){
        Product[] arr = new Product[5];
        arr[0] = new Product("HuaweiMate50pro", 6999);
        arr[1] = new Product("Xiaomi13pro", 2323);
        arr[2] = new Product("VivoX90pro", 1362);
        arr[3] = new Product("Iphone14ProMax", 10000);
        arr[4] = new Product("HonorMagic", 2291);

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
