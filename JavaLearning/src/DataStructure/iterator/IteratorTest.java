package DataStructure.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add("BB");
        coll.add(36716);
        coll.add("新加的");

        Iterator iterator = coll.iterator();

//        // method1, 不建议
//        // .next(): 获取当前集合的下一个元素，到最后一个之后继续执行会导致报错
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        // -------报错
//        System.out.println(iterator.next()); // java.util.NoSuchElementException 这里超出元素中集合的个数会抛出异常

        // method2: for + hasNext()
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2(){
        Collection coll = new ArrayList();

        coll.add("AA");
        coll.add("BB");
        coll.add("CC");
        coll.add("DD");

//        // 方式一：错误的遍历：每次调取.next()都会将指针下移一次
//        Iterator iterator = coll.iterator();
//        while(iterator.next() != null){
//            System.out.println(iterator.next());
//        }
//
//        // 方式二：错误的遍历：每次调用.iterator()的时候都会返回一个新的迭代器对象
//        while(coll.iterator().hasNext()){
//            System.out.println(coll.iterator().next());
//        }


    }

}
