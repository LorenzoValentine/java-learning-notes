package DataStructure.treeSet;

import org.junit.Test;

import java.util.Comparator;
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


    // 自然排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet();

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Alice", 8);
        Person p3 = new Person("Sara", 34);
        Person p4 = new Person("Bill", 1);
        Person p5 = new Person("Ben", 12);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    // 定制排序
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            // 先按照姓名排序，再按照年龄排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;

                    int value = p1.getName().compareTo(p2.getName());
                    if (value != 0){
                        return value;
                    }
                    return -(p1.getAge() - p2.getAge());
                }
                throw new RuntimeException("类型不匹配");

            }
        };

        TreeSet set = new TreeSet(comparator);

        Person p1 = new Person("Tom", 12);
        Person p2 = new Person("Alice", 8);
        Person p3 = new Person("Sara", 34);
        Person p4 = new Person("Bill", 1);
        Person p5 = new Person("Ben", 12);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
