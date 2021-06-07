package com.ss.jb.four;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Producer extends Thread {
    private static final int MAX_SIZE = 4;
    private final List<String> list = new ArrayList<>();

    @Override
    public void run() {
        try {
            while(true) {
                produce();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private synchronized void produce() throws InterruptedException {
        while (list.size() == MAX_SIZE) {
            wait();
        }
        String data = LocalDateTime.now().toString();
        list.add(data);
        System.out.println("Producer activated");
        notify();
    }

    public synchronized String consume() throws InterruptedException {
        notify();
        while (list.isEmpty()) {
            wait();
        }
        String data = list.get(0);
        list.remove(data);
        return data;
    }
}
