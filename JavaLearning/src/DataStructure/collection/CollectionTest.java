package DataStructure.collection;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

// 测试collection中的方法使用
public class CollectionTest {

    // 1> add(Object obj): 添加元素到当前集合里，如果后面是一个集合，会把他整体放进去，而不会进行拆分
    // 2> addAll(Collection other): 添加other集合中的元素全部加到当前集合中
    @Test
    public void test(){
        Collection coll = new ArrayList();
        // add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add(new Object());
        coll.add(new Person("Tom", 12));
        System.out.println(coll); // [AA, 123, java.lang.Object@52d455b8, Person{name='Tom', age=12}]

        // addAll(Collection other)
        Collection coll1 = new ArrayList();
        coll1.add("BB");
        coll1.add(36716);
        coll1.add("新加的");
        coll.addAll(coll1);
        System.out.println(coll); // [AA, 123, java.lang.Object@52d455b8, Person{name='Tom', age=12}, BB, 36716, 新加的]
    }


    // 3> int size(): 获取当前集合中实际存储的元素个数
    // 4> boolean isEmpty(): 判断当前集合是否为空集合
    // 5> boolean contains(Object obj): 判断当前集合中是否存在一个与obj对象equals返回true的元素
    // 6> boolean containsAll(Collection col): 判断coll中的所有元素是否在当前集合中都存在
    // 7> boolean equals(Object obj): 判断当前集合与obj是否相等
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        // add()
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add(new Person("Tom", 12));
        coll.add(new String("哈哈"));


        // isEmpty()
        System.out.println(coll.isEmpty()); // false

        // contains()
        // Returns true if this collection contains the specified element. More formally, returns true if and only if this collection contains at least one element e such that Objects.equals(o, e).
        System.out.println(coll.contains("AA")); // true
        System.out.println(coll.contains(new String("哈哈"))); // true 这里比较的是内容，因为string里面有重写equals
        System.out.println(coll.contains(new Person("Tom", 12))); // false 这里Person类没有重写equals方法

        // containsAll()
        Collection coll1 = new ArrayList();
        coll1.add("AA");
        coll1.add(123);

        System.out.println(coll.containsAll(coll1)); // true

        // boolean equals(Object obj)
        // 需要与集合进行比较，而不是单独的元素
    }


    // 8> void clear(): 清空当前集合里的元素
    // 9> boolean remove(Object obj): 从当前集合中删除第一个找到的与obj对象equals返回true的元素
    // 10> boolean removeAll(Collection coll): 从当前集合中删除所有与coll集合相同的元素 ->取差集
    // 11> boolean retainAll(Collection coll): 从集合中删除所有两个集合中不同的元素，只保留两个集合相同的元素 ->取交集
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add(new Person("Tom", 12));
        coll.add(new String("哈哈"));

        // clear()
        coll.clear();
        System.out.println(coll); // []
        System.out.println(coll.size()); // 0

        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add(new Person("Tom", 12));
        coll.add(new String("哈哈"));

        // remove(Object obj) 只会删除找到的第一个，并不会删除所有的
        coll.remove(123);
        System.out.println(coll); // [AA, Person{name='Tom', age=12}, 哈哈]

    }

    // 12> Object[] toArray(): 返回包含当前集合中所有元素的数组
    // 13> hashCode(): 获取当前集合对象的哈希值
    // 14> iterator(): 返回迭代器对象，用于集合遍历
    @Test
    public void test4(){
        Collection coll = new ArrayList();
        coll.add("AA");
        coll.add(123); // 自动装箱
        coll.add(new Person("Tom", 12));
        coll.add(new String("哈哈"));

        // Object[] toArray(): 集合转换成数组
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr)); // [AA, 123, Person{name='Tom', age=12}, 哈哈]

        // hashCode():
        System.out.println(coll.hashCode()); // 144689218

    }

    // 数组和集合的相互转化
    @Test
    public void test5(){
        String[] arr = new String[]{"AA", "BB", "CC"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list); // [AA, BB, CC]
        System.out.println(list.size()); // size = 3
    }

    @Test
    public void test6(){
        Integer[] arr1 = new Integer[]{111,222,333};
        List list1 = Arrays.asList(arr1); // Integer[]是引用数据类型，里面的111 222 333是三个对象
        System.out.println(list1.size()); // size=3
        System.out.println(list1); // [111, 222, 333]

        int[] arr2 = new int[]{111,222,333};
        List list2 = Arrays.asList(arr2); // asList里面装的是引用数据类型，由于111 222 333是基本数据类型，所以被放进去的是int[]整体看做一个对象
        System.out.println(list2.size()); // size=1
        System.out.println(list2); // [[I@270421f5]

    }

}
