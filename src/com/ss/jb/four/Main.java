package com.ss.jb.four;

public class Main {

    public static void main(String[] args) {
        Producer producer = new Producer();
        producer.setName("Prodo Baggins");
        producer.start();

        Consumer consumer = new Consumer(producer);
        consumer.setName("Arthur Conserelli");
        consumer.start();

        Consumer consumerTwo = new Consumer(producer);
        consumerTwo.setName("Second Consumer");
        consumerTwo.start();
    }
}
