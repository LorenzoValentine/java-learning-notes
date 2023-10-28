package Override;

public class Student extends Person{
    String major;

    public Student() {

    }

    public Student(String major) {
        this.major = major;
    }

    public void study() {
        System.out.println("Student study, 专业是： " + major);
    }

    @Override
    public void eat() {
        System.out.println("Student eat");
    }


}
