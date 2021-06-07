package com.ss.jb.wk1_assignment;


import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {

    private static Connection conn = null;

    volatile private static SampleSingleton instance = null;

    private SampleSingleton() {

    }

    public static SampleSingleton getInstance() {
        // check 1
        if (instance == null) {
            // lock
            synchronized (instance) {
                //check 2
                if (instance == null) {
                    instance = new SampleSingleton();
                }
            }
        }

        return instance;
    }


}
