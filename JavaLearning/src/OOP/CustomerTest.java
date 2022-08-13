package OOP;

import java.util.Random;

import static java.util.Arrays.sort;

public class CustomerTest {
    public static void main(String[] args) {

        String aaa = new String("Hello");
        if (aaa.startsWith("Hel")){
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

        int[] arr = {9, 27, 126, 2, 18, 7, 965, 327, 1207, 52, 37}; // 长度为11
        int[] result = new int[11];
        int j = 0;
        for (int i = 10; i >= 0; i--) {
            result[j] = arr[i];
            j = j + 1;
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}

class Customer{
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat(){
        System.out.println("eating");
    }

    public void sleep(int hour){
        System.out.println("sleeping for " + hour + " hours");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "My nationality is " + nation;
        return info;
    }


}