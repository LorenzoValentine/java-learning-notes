package Day10;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "大黄";
        a.age = 1;
        //a.legs = 4;

        //a.legs = -4;
        a.setLegs(6);
        a.show();

    }
}

class Animal{
    String name;
    int age;
    private int legs; // 腿的个数

    public void setLegs(int legs) {
        if (legs >= 0 && legs % 2 == 0){
            this.legs = legs; //由于重名，这里的legs是method里的legs
        } else {
            this.legs = 0;
        }
    }
    // 对属性的获取
    public int getLegs(){
        return this.legs;
    }

    public void eat(){
        System.out.println("animal eat");
    }

    // 提供关于属性age的get和set方法
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }



    public void show(){
        System.out.println("name=" + name + ",age=" + age + ",legs=" + legs);
    }
}