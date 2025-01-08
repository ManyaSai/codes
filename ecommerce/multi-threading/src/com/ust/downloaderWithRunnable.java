package com.ust;

public class downloaderWithRunnable implements Runnable{
    @Override
    public void run() {
        download();
    }

    public void download(){
        for(int i=0;i<=100;i+=10){
            System.out.println("from "+Thread.currentThread().getName()+" downloading "+i+"%");
            try{
                Thread.sleep(100);
            }catch(InterruptedException ex){
                System.err.println(ex.getMessage());
            }
        }
    }


}
