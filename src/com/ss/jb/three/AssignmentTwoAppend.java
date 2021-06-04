package com.ss.jb.three;

import java.io.File;
import java.io.FileFilter;

public class AssignmentTwoAppend {

    void listFolder(File dir) {
        File[] subDirs = dir.listFiles(File::isDirectory);

        System.out.println(dir.getAbsolutePath());
        listFile(dir);

        for (File folder : subDirs) {
            listFolder(folder);
        }
    }

    private void listFile(File dir) {
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }
    }


}
