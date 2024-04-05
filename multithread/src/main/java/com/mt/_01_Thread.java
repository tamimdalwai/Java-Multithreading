package com.mt;

public class _01_Thread extends Thread {

    _01_Thread(String name){
        super(name);
    }
    public static void main(String[] args) {
         _01_Thread t1 = new _01_Thread("First Thread");
         _01_Thread t2 = new _01_Thread("Second Thread");
         t1.start();
         t2.start();

    }

    @Override
    public void run() {
        // Thread t = Thread.currentThread();
        // System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
        System.out.println(16);
    }
    
}
