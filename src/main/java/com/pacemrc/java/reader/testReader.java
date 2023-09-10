package com.pacemrc.java.reader;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.pacemrc.java.utils.FileUtil.checkFileExist;
import static com.pacemrc.java.utils.constantUtil.resourcesPath;

/**
 * 演示通过FileReader和InputStreamReader两种Reader读取文件
 */
public class testReader {

    public static BufferedReader testFileReader(File file) throws FileNotFoundException {

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        return bufferedReader;

    }

    public static BufferedReader testInputStreamReader(File file) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        return bufferedReader;

    }

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(resourcesPath + "fileDir\\1.txt");
        File file = new File(String.valueOf(path));

        BufferedReader bufferedReader = testFileReader(file);
        BufferedReader bufferedReader1 = testInputStreamReader(file);
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader1.readLine());


    }
}
