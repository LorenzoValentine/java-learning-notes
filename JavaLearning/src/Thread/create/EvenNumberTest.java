package Thread.create;

public class EvenNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        p1.start();
    }
}

class PrintNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
