package paytym;

import com.paytym.PaytmWallet;

public class PaytmOperation {

    public static void main(String[] args) throws InterruptedException {

        PaytmWallet wallet = new PaytmWallet(100);

        Thread payBillThread = new Thread(() -> wallet.payBill(1000));
        Thread addMoneyThread = new Thread(() -> wallet.addMoney(5000));

        payBillThread.start();
        //   payBillThread.join();
        addMoneyThread.start();


    }


}
