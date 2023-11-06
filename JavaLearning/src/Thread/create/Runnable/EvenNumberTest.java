package Thread.create.Runnable;

public class EvenNumberTest {
    public static void main(String[] args) {

        EvenNumberPrint p = new EvenNumberPrint();
        // 创建Thread类型的实例对象
        Thread ts = new Thread(p);
        ts.start();

    }
}

class EvenNumberPrint implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
