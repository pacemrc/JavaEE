package com.pacemrc.java.demo;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * 测试通过6种方式读取文件的内容
 */
public class testReadFile {

    public static void testFilesreadAllLines(Path path) throws IOException {

        List<String> strings = Files.readAllLines(path);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            stringBuilder.append(strings.get(i));
        }
        System.out.println(stringBuilder.toString());
    }

    public static void testFilesreadAllBytes(Path path) throws IOException {

        String filecontent = new String(Files.readAllBytes(path));
        System.out.println(filecontent);
    }

    public static void testScanner(Path path) throws IOException {

        Scanner scanner = new Scanner(path);
        String filecontent = scanner.useDelimiter("\\a").next();
        System.out.println(filecontent);
    }

    public static void testInputStreamReader(Path path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path.toString());
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();
        String filecontent;
        while ((filecontent = bufferedReader.readLine())!= null){
            stringBuilder.append(filecontent);
        }
        System.out.println(stringBuilder.toString());
    }

    public static void testFileReader(Path path) throws IOException {

        FileReader fileReader = new FileReader(String.valueOf(path));
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        StringBuilder stringBuilder = new StringBuilder();
        String filecontent;
        while ((filecontent = bufferedReader.readLine())!= null){
            stringBuilder.append(filecontent);
        }
        System.out.println(stringBuilder.toString());
    }

    public static void testCommonsIO(Path path) throws IOException {
        String filecontent = FileUtils.readFileToString(new File(String.valueOf(path)));
        System.out.println(filecontent);
    }

    public static void main(String[] args) throws IOException {


        //获取文件的路径
        Path path = Paths.get("D:\\tmp\\1.txt");
        //读取文件内容
        testFilesreadAllLines(path);
        testFilesreadAllBytes(path);
        testScanner(path);
        testInputStreamReader(path);
        testFileReader(path);
        testCommonsIO(path);
    }
}
