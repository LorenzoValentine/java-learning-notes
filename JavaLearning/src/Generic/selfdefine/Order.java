package Generic.selfdefine;

public class Order<T> {

    // 声明了类的泛型参数以后，就可以在类的内部使用此泛型参数
    T t;
    int orderID;

    public Order() {
    }

    public Order(T t, int orderID) {
        this.t = t;
        this.orderID = orderID;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
}
