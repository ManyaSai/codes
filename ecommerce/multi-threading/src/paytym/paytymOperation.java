package paytym;

class paytymOperation {
    double balance;
    public paytymOperation(double balance){
        this.balance=balance;
    }
    synchronized void addMoney(double amount){

        balance+=amount;
        System.out.println(balance);
        notifyAll();//all waiting threads get awakened
    }
    synchronized void payBill(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println(balance);
        }
        else {
            System.out.println("b ins");
            try {
                wait();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        if(amount>balance) {
            System.out.println("still ins b");
            return;
        }

    }
}
