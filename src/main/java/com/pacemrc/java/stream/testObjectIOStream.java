package com.pacemrc.java.stream;

import com.pacemrc.java.dao.User;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.pacemrc.java.utils.FileUtil.checkFileExist;
import static com.pacemrc.java.utils.constantUtil.resourcesPath;


/**
 * 演示对象输入输出流的序列化和反序列化
 */
public class testObjectIOStream {

    public static void testObjectInputStream(Path path) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(String.valueOf(path));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        User user = (User)objectInputStream.readObject();
        System.out.println("成功从" + path + "获取到对象");
        System.out.println(user);

    }

    public static void testObjectOutputStream(Path path,User user) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(String.valueOf(path));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(user);
        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("成功将对象写入至"+ path +"文件");
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = new User();
        user.setName("john");
        user.setAge(24);

        Path path = Paths.get(resourcesPath + "fileDir\\user.ser");
        checkFileExist(path);
        testObjectOutputStream(path,user);
        testObjectInputStream(path);

    }
}
