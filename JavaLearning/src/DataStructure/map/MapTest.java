package DataStructure.map;

import org.junit.Test;

import javax.crypto.spec.PSource;
import java.util.*;

public class MapTest {
    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null, null);
        System.out.println(map);
    }

    @Test
    public void test2(){
        Map map = new Hashtable();
        map.put(null, null);
        System.out.println(map); // java.lang.NullPointerException 不能同时为空
    }

    @Test
    public void test3(){
        Map map = new LinkedHashMap();
        map.put("Tom", 23);
        map.put(111, "2341");
        map.put("adysadgus", "adbgya");


        System.out.println(map); // {Tom=23, 111=2341, adysadgus=adbgya} 按照添加的顺序显示
    }

    /**
     * - 添加、修改操作
     *   - `object put(Object key, Object value)`：将指定的key-value添加（或者修改）到当前`map`对象中
     *   - `void putAll(Map m)`：将m中的所有key-value对存放在当前map中
     * - 删除操作
     *   - `Object remove(Object key)`：移除指定key的key-value pair并且返回value
     *   - `void clear()`：清空当前map中所有数据
     * - 查询操作
     *   - `Object get(Object key)`：获取指定key对应的value
     * - 长度
     *   - `size()`：获取当前map的长度
     * - 遍历
     *   - 遍历key集合：`Set keySet()`
     *   - 遍历value集合：`Collection values()`
     *   - 遍历entry集合：`Set entrySet()`
     * - 其他方法
     *   - `boolean containsKey(Object key)`：是否包含指定的key，需要对key所在类进行`equals()`重写
     *   - `boolean containsValue(Object value)`：是否包含指定的value，需要对value所在类进行`equals()`重写
     *   - `boolean isEmpty()`：判断当前map是否是空
     *   - `boolean equals(Object obj)`：判断当前map和参数对象obj是否相等
     */

    @Test
    public void test4(){
        HashMap map = new HashMap();

        // put(Object key, Object value)添加
        map.put("Tom", 23);
        map.put(111, "2341");
        map.put("adysadgus", "adbgya");
        map.put(new Person("Tom", 12), 56);
        System.out.println(map); // {Tom=23, adysadgus=adbgya, Person{name='Tom', age=12}=56, 111=2341} 显示顺序和添加顺序不同
        System.out.println(map.size());

        // Object remove(Object key)
        Object value = map.remove("Tom");
        System.out.println(value); // 23

        // put(Object key, Object value)修改
        Object oldValue =  map.put("Tom", 99);
        System.out.println(oldValue); // 23 传出的是旧value

        // Object get(Object key)
        System.out.println(map.get("Tom"));
    }

    // 遍历操作
    @Test
    public void test5(){
        // 遍历key Set keySet()
        HashMap map = new HashMap();
        map.put("Tom", 23);
        map.put(111, "2341");
        map.put("adysadgus", "adbgya");
        map.put(new Person("Tom", 12), 56);

        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println(key);
        }

       // 遍历value Collection values()
        Collection values = map.values();
        for (Object o : values){
            System.out.println(o);
        }

       // 遍历entry集 entrySet()
        Set entryset = map.entrySet();
        for (Object o : entryset){
            System.out.println(o);
        }



    }
}
