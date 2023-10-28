package Polymorphism.exer1;

public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight){
        super(color, weight);
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return this.weight;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    @Override
    public double findArea(){
        return width * height;
    }
}
