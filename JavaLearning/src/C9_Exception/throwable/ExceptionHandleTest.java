package C9_Exception.throwable;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandleTest {

    public static void main(String[] args) {
        // InputMismatchException
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e){
            System.out.println("出现了InputMismatchException的异常");
        } catch(RuntimeException e){ // 这个是上面的父类，需要放到最后
            System.out.println("出现了RuntimeException的异常");
        }

    }

    @Test
    public void test1(){
        try{
            // NumberFormatException
            String str = "abc";
            System.out.println(Integer.parseInt(str));
        } catch (InputMismatchException e){
            e.printStackTrace();
//            System.out.println(e.getMessage());
        }
//        System.out.println(str);
    }
}
