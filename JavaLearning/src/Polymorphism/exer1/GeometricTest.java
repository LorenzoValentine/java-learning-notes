package Polymorphism.exer1;

// 编写equalsArea方法测试两个对象的面积是否相等
// 编写displayGeometricObject方法显示对象的面积
public class GeometricTest {

    public static boolean equalArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public static double displayGeometricObject(GeometricObject g1){
        return g1.findArea();
    }

    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        MyRectangle m1 = new MyRectangle(3.0, 3.0, "black", 1.0);
        Circle c1 = new Circle(3.3, "black", 1.0);
        System.out.println(equalArea(new Circle(3.3, "black", 1.0), new MyRectangle(3.0, 3.0, "black", 1.0)));
        System.out.println(displayGeometricObject(m1));
        System.out.println(displayGeometricObject(c1));

//        Circle c1 = new Circle(3.3, "black", 1.0);
//        MyRectangle r1 = new MyRectangle(3.0, 3.0, "black", 1.0);
//        System.out.println();
    }
}
