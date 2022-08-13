package Day09;
// 自定义数组的工具类

public class ArrayUtil {

    // 求最大值
    public int getMax(int[] arr){
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求最小值
    public int getMix(int[] arr){
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求和
    public int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // 求平均值
    public int getAve(int[] arr){
        return (getSum(arr) / arr.length);

    }

    // 反转数组
    public void reverse(int[] arr){
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i > 0; i--){
            result[j] = arr[i];
            j++;
        }
        arr = result;
    }

    // 复制数组
    public int[] copy(int[] arr){
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    // 数组排序
    public void sort(int[] arr){
        System.out.println("排好啦只是没写代码");

    }

    // 遍历数组
    public void print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }
    }

    // 查找指定元素
    public int getIndex(int[] arr, int dest){
        for (int i = 0; i < arr.length; i++){
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
