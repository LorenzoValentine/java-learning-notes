package DataStructure.list.exer2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class ListTest {
    public static void main(String[] args) {
        // 随机生成30个字符存放在arraylist

        ArrayList list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            // 'a' - 'z' [97, 97+26-1]

            list.add((char) ((Math.random() * (122 - 97 + 1)) + 97) + "");

        }
//        System.out.println(list.toString());




    }

    // 遍历arraylist，查找指定的元素出现的词数
    public static int listTest(Collection list, Object o){
        int count = 0;
        for (Object s : list){
            if (s.equals(o)){
                count++;
            }
        }
        return count;
    }
}
