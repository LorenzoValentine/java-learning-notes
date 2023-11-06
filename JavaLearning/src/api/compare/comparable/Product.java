package api.compare.comparable;

import java.util.Objects;

public class Product implements Comparable {
    String name;
    int price;

    public Product() {
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // 需要在此方法中指明如何判断当前类的对象的大小。比如按照价格的高低等
    // 如果返回值是正的：当前对象打
    // 如果返回值是负的：当前对象小

    // 先比较价格，从小到大，后比较名字，从小到大
    @Override
    public int compareTo(Object o) {
        if (o == this){
            return 0;
        }
        if (o instanceof Product){
            Product p = (Product) o;
            int value = Integer.compare(this.price, p.price);
            if (value != 0) return value;
            return this.name.compareTo(p.name);
        }
        throw new RuntimeException("type not match");
    }

}
