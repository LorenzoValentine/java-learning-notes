package Polymorphism.apply;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Animal());

        // 多态性，声明的animal类但是传入是dog类
        test.adopt(new Dog());
        test.adopt(new Cat());
    }

    public void adopt(Animal animal) {
        animal.eat();
        animal.jump();
        // 不能声明子类的方法
    }

    public void adopt(Dog dog) {
        dog.eat();
        dog.jump();
        dog.bark();
    }

}

class Animal {
    public void eat() {
        System.out.println("Animal eat");
    }

    public void jump() {
        System.out.println("Animal jump");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog eat");
    }

    public void jump() {
        System.out.println("Dog jump");
    }

    public void bark() {
        System.out.println("Dog bark");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("Cat eat");
    }

    public void jump() {
        System.out.println("Cat jump");
    }

    public void catchMouse() {
        System.out.println("Cat catch mouse");
    }
}
