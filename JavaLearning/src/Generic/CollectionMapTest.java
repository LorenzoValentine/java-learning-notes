package Generic;

import org.junit.Test;

import java.util.*;

public class CollectionMapTest {
    @Test
    public void test1(){
        List<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(79);
        list.add(80);
        list.add(81);
    }

    @Test
    public void test2(){
        HashMap<String, Integer> map = new HashMap<>(); // 类型推断

        map.put("Tom", 67);
        map.put("Jerry", 87);
        map.put("Rose", 99);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> stringIntegerEntry : entrySet) {
            System.out.println(stringIntegerEntry);
        }


    }
}
