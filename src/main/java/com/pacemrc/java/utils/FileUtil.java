package com.pacemrc.java.utils;

import java.io.File;
import java.nio.file.Path;

public class FileUtil {

    public static void checkFileExist(Path path){

        File file = new File(String.valueOf(path));
        boolean exists = file.exists();
        if(exists) {
            System.out.println("文件存在");
        }
    }
}
