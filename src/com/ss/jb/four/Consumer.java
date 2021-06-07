package com.ss.jb.four;

public class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String data = producer.consume();
                System.out.println("Consumer:  " + Thread.currentThread().getName() + " Consumed " + data);

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
