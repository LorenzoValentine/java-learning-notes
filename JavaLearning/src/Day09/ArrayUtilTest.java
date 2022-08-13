package Day09;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[] {23, 18, 67, 8, 17, 38, 87, 76, 47, -6, -77};
        int max = util.getMax(arr);
        System.out.println("最大值是：" + max);

        System.out.println("排序前：");
        util.print(arr);

        util.sort(arr);
        System.out.println("排序后：");
        util.print(arr);

        System.out.print("Searching index: ");
        int index = util.getIndex(arr, -6);
        if (index > 0) {
            System.out.println("Find it!");
        } else System.out.println("Not find :(");
    }
}
