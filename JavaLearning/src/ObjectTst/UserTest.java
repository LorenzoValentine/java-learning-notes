package ObjectTst;

import java.util.Objects;

public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);

        System.out.println(u1.equals(u2)); // return false 实际判断的是u1和u2的地址值
    }

}

class User{
    String name;
    int age;

    public User(){

    }


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 手动实现重写
//    @Override
//    public boolean equals(Object obj){
//        // 地址值如果一样就不需要比较了，因为指向的是同一个堆空间
//        if (this == obj){
//            return true;
//        }
//
//        if (obj instanceof User){
//            User user = (User) obj;
//            if (this.age == user.age && this.name.equals(user.name)){
//                return true;
//            }
//        }
//        return false;
//    }

    // intellij 自动重写
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        return Objects.equals(name, user.name);
    }
}

