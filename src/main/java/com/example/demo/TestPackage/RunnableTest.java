package com.example.demo.TestPackage;

import java.util.ArrayList;

public class RunnableTest implements Runnable{
    int seq;

    public RunnableTest(int seq) {
        this.seq = seq;
    }

    @Override
    public void run() {
        StringBuilder soutBuilder = new StringBuilder();
        soutBuilder.append(this.seq).append("thread start");
        System.out.println(soutBuilder);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        soutBuilder.delete(1,soutBuilder.length());
        soutBuilder.append("thread end");
        System.out.println(soutBuilder);
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i=0; i<10; i++) {
            Thread t = new Thread(new RunnableTest(i));
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join(); // t 쓰레드가 종료할 때까지 기다린다.
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}
