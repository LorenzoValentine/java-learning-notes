package List;

import java.util.LinkedList;

public class LinkedListtest {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("刘备");
        linkedList.add("吕布");
        linkedList.add("张飞");
        linkedList.add("关羽");
        linkedList.add("貂蝉");
        System.out.println(linkedList);

        linkedList.addFirst("孙尚香");
        System.out.println(linkedList);
        linkedList.addFirst("董卓");
        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.removeFirst());

        System.out.println(linkedList);
        linkedList.pop();
        linkedList.pop();
        System.out.println(linkedList);

        linkedList.push("刘备");
        linkedList.push("王备");
        System.out.println(linkedList);

    }
}
