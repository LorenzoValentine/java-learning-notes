package Thread.threadsafety.notSafe;

public class WindowTest1 {
    public static void main(String[] args) {

        SaleTicket1 s1 = new SaleTicket1();
        SaleTicket1 s2 = new SaleTicket1();
        SaleTicket1 s3 = new SaleTicket1();


        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");

        s1.start();
        s2.start();
        s3.start();


    }

}

class SaleTicket1 extends Thread{
    static int ticket = 100; // 由于上面new了三个对象 这里要改成全局变量

    @Override
    public void run() {
        while(true){
            synchronized (SaleTicket1.class) {
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "售票: " + ticket);
                    ticket--;
                } else break;
            }
        }
    }
}
