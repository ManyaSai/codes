package paytym;

public class Main {
    public static void main (String[] args) throws InterruptedException{
        paytymOperation p = new paytymOperation(5);
        Thread t1 = new Thread(()->p.addMoney(100));
        Thread t2 = new Thread(()->p.payBill(90));
        Thread t3 = new Thread(()->p.payBill(999));
        Thread t5 = new Thread(()->p.addMoney(5000));
//        Thread t6 = new Thread(()->p.paytymOperation(ba));
        t1.start();
        t2.start();
        t3.start();
        t5.start();
    }
}
