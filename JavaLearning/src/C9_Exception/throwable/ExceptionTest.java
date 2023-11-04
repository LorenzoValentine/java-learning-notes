package C9_Exception.throwable;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

public class ExceptionTest {
    @Test
    public void test(){
        // ArrayIndexOutOfBondsException 角标越界
        int[] arr = new int[2];
        System.out.println(arr[2]);
    }

    @Test
    public void test2(){
        // NullPointerException
        String str = "hello";
        str = null;
        System.out.println(str);
    }

    @Test
    public void test3(){
        // ClassCastException
        Object obj = new String();
        Date date =(Date) obj;
    }

    @Test
    public void test4(){
        // NumberFormatException
        String str = "abc";
        System.out.println(Integer.parseInt(str));
    }

    @Test
    public void test5(){
        // InputMismatchException
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);

    }

    @Test
    public void test6(){
        // ArithmeticException
        System.out.println(10/0);
    }
}
