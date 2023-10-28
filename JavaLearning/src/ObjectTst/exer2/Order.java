package ObjectTst.exer2;

import java.util.Objects;

public class Order {
    private int orderId;
    private String orderName;

    public Order(){

    }

    public Order(int orderId, String orderName){
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    // 手写
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj){
//            return true;
//        }
//        if (obj instanceof Order){
//            Order o1 = (Order) obj;
//            return this.orderId == o1.orderId && this.orderName.equals(o1.orderName);
//        }
//
//        return false;
//    }

    // 生成

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        return Objects.equals(orderName, order.orderName);
    }
}
