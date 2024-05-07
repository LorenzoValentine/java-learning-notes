package DataStructure.list;

import org.junit.Test;

import java.util.LinkedList;

public class LinkedlistTest {
    @Test
    public void test1(){
        LinkedList<String> list = new LinkedList<>();

        list.add("这是加入的第一个");
        list.add("这是加入的第二个");
        list.add("这是加入的第三个");
        list.add("这是加入的第四个");
        list.add("这是加入的第五个");

        System.out.println(list.getLast());


    }
}
