package Polymorphism.exer1;

public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String setColor(String color) {
        return this.color = color;
    }

    public double setWeight(double weight) {
        return this.weight = weight;
    }

    public double findArea() {
        return 0.0;
    }
}
