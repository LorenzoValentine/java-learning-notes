package Treeset;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    @Test
    public void test1(){
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("AA");
        treeSet.add("CC");
        treeSet.add("ZZ");
        treeSet.add("FF");
        treeSet.add("BB");
        treeSet.add("LL");

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
