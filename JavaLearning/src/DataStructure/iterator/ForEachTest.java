package DataStructure.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add("DD");

        // 使用增强的for循环遍历集合
        for (Object o : coll){
            System.out.println(o);
        }
    }

    @Test
    public void test2(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        // 使用增强的for循环遍历数组
        for (int o : arr){
            System.out.println(o);
        }
    }
}
