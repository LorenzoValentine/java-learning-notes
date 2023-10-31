package DataStructure.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 12));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        /**
         * AA
         * BB
         * 123
         * Person{name='Tom', age=12}
         * 这里的顺序和添加的顺序不同
         */

    }
}
