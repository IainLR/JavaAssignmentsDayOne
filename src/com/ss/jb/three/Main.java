package com.ss.jb.three;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to day three");

        new AssignmentOneList().listFolder(new File("src"));


        assignmentTwoAppend("test.txt");


        assignmentThreeCharCount(args);


    }



    public static void assignmentTwoAppend(String filePath) {

        try {
            File textFile = new File(filePath);
            if (!textFile.exists()) {
                textFile.createNewFile();
                System.out.println("Created File!");
            }
            FileWriter fileWriter = new FileWriter(textFile.getName(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\nThis is content added by code! I hope!");
            bufferedWriter.close();
            System.out.println("The try worked, we are not in the catch");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void assignmentThreeCharCount(String[] args) {
        try {
//            FileInputStream fis = new FileInputStream("src/com/ss/jb/three/text.txt");
            FileInputStream fis = new FileInputStream("test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            int count = 0;

            while ((i = bis.read()) !=-1) {
                char a = (char)i;
                if (a == args[0].charAt(0)) {
                    count++;
                }
                System.out.println(a);
            }

            System.out.println(count);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }



}
