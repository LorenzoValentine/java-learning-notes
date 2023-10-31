package DataStructure.list.exer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List studentList = new ArrayList();

        System.out.println("请录入学生信息：");
        while(true){
            System.out.println("1. 继续录入， 0. 结束录入");
            int selection = scanner.nextInt();
            if (selection == 0){
                break;
            }
            System.out.print("请输入学生姓名： ");
            String name = scanner.next();
            System.out.print("请输入学生年龄： ");
            int age = scanner.nextInt();
            Student s = new Student(name, age);
            studentList.add(s);

        }
        scanner.close();

        // 遍历学生信息
        for (Object o : studentList){
            System.out.println(o.toString());
        }

//        Iterator iterator = studentList.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
