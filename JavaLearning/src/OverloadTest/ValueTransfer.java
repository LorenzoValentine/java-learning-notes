package OverloadTest;

public class ValueTransfer {
    public static void main(String[] args) {
        int m = 10;
        int n = m;

        System.out.println("m=" + m + "n=" + n);

        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1;
        System.out.println("o1 id:" + o1.orderId + "\n" + "o2 id:" + o2.orderId);
        o2.orderId = 1002;
        System.out.println("o1 id:" + o1.orderId + "\n" + "o2 id:" + o2.orderId);
    }


}

class Order{
    int orderId;
}