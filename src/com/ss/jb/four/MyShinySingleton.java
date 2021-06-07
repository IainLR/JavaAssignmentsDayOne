package com.ss.jb.four;

public class MyShinySingleton {

    volatile private static MyShinySingleton singleton = null;

    private MyShinySingleton() {

    }

    public MyShinySingleton getSingleton() {
        // check 1
        if (singleton == null) {
            // lock
            synchronized (singleton) {
                //check 2
                if (singleton == null) {
                    singleton = new MyShinySingleton();
                }
            }
        }

        return singleton;
    }
}
