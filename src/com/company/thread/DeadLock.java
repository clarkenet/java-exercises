package com.company.thread;

public class DeadLock{
    void method1() {
        synchronized (String.class) {
            System.out.println("Method1 acquired lock on String.class");
            synchronized (Integer.class) {
                System.out.println("Method1 acquired lock on Integer.class");
            }
        }
    }

    void method2() {
        synchronized (Integer.class) {
            System.out.println("Method2 acquired lock on Integer.class");
            synchronized (String.class) {
                System.out.println("Method2 acquired lock on String.class");
            }
        }
    }

    public static void main(String[] args) {
        DeadLock lock = new DeadLock();
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                lock.method1();
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 10; i++) {
                lock.method2();
            }
        };
        Thread t1 = new Thread(r1, "CustomThread1");
        Thread t2 = new Thread(r2, "CustomThread2");
        t1.start();
        t2.start();
    }

}
