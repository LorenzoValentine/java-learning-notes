package DataStructure.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {

    @Test
    public void test(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(new Person("Tom", 12));

        System.out.println(list); // [AA, BB, 123, Person{name='Tom', age=12}]

        // add(index)
        list.add(2, "CC");
        System.out.println(list); // [AA, BB, CC, 123, Person{name='Tom', age=12}] 插入到index2的位置

        // addAll(int index, Collection coll)
        List list1 = Arrays.asList(1,2,3);
        list.addAll(1, list1);
//        list.add(1, list1); 这个是将list1视作一个元素整体插入到list中，而不是将list1中的每一个元素分别插入。 [AA, [1, 2, 3], BB, CC, 123, Person{name='Tom', age=12}]
        System.out.println(list); // [AA, 1, 2, 3, BB, CC, 123, Person{name='Tom', age=12}]
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2); // 自动装箱了
        list.add(new Person("Tom", 12));

        list.remove(2); // 这里删除的是索引2，而不是数据为2的元素

        list.remove(Integer.valueOf(2)); // 这里删除的是数据为2的元素，而不是索引2
        list.remove((Object) 2); // 这里删除的是数据为2的元素，而不是索引2
    }

    @Test
    public void test3(){
        List list = new ArrayList();
        list.add("AA");
        list.add("BB");
        list.add(123);
        list.add(2); // 自动装箱了
        list.add(new Person("Tom", 12));

        // 遍历方式1：迭代器
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 遍历方式2：增强的for
        for (Object o : list){
            System.out.println(o);
        }

        // 遍历方式3：一般的for循环
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
