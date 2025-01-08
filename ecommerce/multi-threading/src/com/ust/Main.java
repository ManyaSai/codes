package com.ust;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        downloader task = new downloader();
        downloader d1 = new downloader();
        downloader d2 = new downloader();
        downloaderWithRunnable d5 = new downloaderWithRunnable();

        d5.download();
        Thread d3 = new Thread(()->task.download());
        Thread d4 = new Thread(()->task.download());
        d3.setName("Downloader3 ");
        d4.setName("Downloader4 ");
        d3.start();
        d4.start();
//        d1.download();
//        d2.download();
        d1.setName("Downloader1 ");
        d2.setName("Downloader2 ");
        d1.start();
        d2.start();

    }
}