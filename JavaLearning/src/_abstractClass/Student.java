package _abstractClass;

public class Student extends Person{
    String school;

    public Student(){
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }

    public void sleep(){
        System.out.println("学生睡觉");
    }


}
