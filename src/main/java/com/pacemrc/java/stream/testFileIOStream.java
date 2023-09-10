package com.pacemrc.java.stream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.pacemrc.java.utils.FileUtil.checkFileExist;
import static com.pacemrc.java.utils.constantUtil.resourcesPath;

/**
 * 演示文件输入流和文件输出流的使用
 */
public class testFileIOStream {

    public static void testFileInputStream(Path path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(String.valueOf(path));
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();
        String filecontent;
        while ((filecontent = bufferedReader.readLine()) != null){
            stringBuilder.append(filecontent);
        }

        System.out.println(stringBuilder.toString());

    }

    public static void testFileOutputStream(Path path1,Path path2) throws IOException {

        byte[] bytes = Files.readAllBytes(path1);
        FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(path2));

        fileOutputStream.write(bytes);
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {

        //获取文件的路径
        Path path1 = Paths.get(resourcesPath + "fileDir\\1.txt");
        Path path2 = Paths.get(resourcesPath + "fileDir\\2.txt");
        checkFileExist(path1);
        checkFileExist(path2);
        //读取文件内容
        testFileInputStream(path1);
        //读取文件1内容并写入到文件2
        testFileOutputStream(path1,path2);

    }
}
