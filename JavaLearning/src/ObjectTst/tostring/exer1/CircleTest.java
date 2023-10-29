package ObjectTst.tostring.exer1;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("white", 1.0, 1.0);
        Circle c2 = new Circle("white", 1.5, 1.5);

        System.out.println(c1.getColor().equals(c2.getColor()));

    }
}
