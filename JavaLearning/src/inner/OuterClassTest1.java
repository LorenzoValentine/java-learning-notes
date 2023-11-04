package inner;

public class OuterClassTest1 {
    public void method1() {
        class A {

        }
    }

        // 开发中的场景
        public Comparable getInstance(){
            // 提供了实现Comparable接口的类
//            // method1：提供了接口的实现类的对象
//            class MyCommparable implements Comparable{
//                @Override
//                public int compareTo(Object o) {
//                    return 0;
//                }
//            }
//            MyCommparable m = new MyCommparable();
//            return m;
//
//            // method2：提供了接口的实现类的匿名对象
//            class MyCommparable implements Comparable{
//                @Override
//                public int compareTo(Object o) {
//                    return 0;
//                }
//            }
//            return new MyCommparable();
//
//            // method3：提供了接口的匿名实现类的对象
//            Comparable c = new Comparable() {
//                @Override
//                public int compareTo(Object o) {
//                    return 0;
//                }
//            };
//            return c;

            // method4：提供了接口的匿名实现类的匿名对象
            return new Comparable() {
                @Override
                public int compareTo(Object o) {
                    return 0;
                }
            };
        }


}
