package com.ss.jb.four;

public class Deadlock {

    public static void main(String[] args) {
        String resource1 = "resource one";
        String resource2 = "resource two";

        Runnable thread1 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resource1) {
                        Thread.sleep(100);
                        synchronized (resource2) {
                            System.out.println("Thread one activated");
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Runnable thread2 = new Runnable() {
            @Override
            public void run() {
                try {
                    synchronized (resource2) {
                        Thread.sleep(100);
                        synchronized (resource1) {
                            System.out.println("thread two activated");
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        };

        new Thread(thread1).start();
        new Thread(thread2).start();

    }


}
