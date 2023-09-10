package com.pacemrc.java.commandExec;

import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Scanner;

/**
 * 演示4种命令执行以及两种获取命令执行结果的方式
 */
public class main {

    public static String getOutputByBufferReader(InputStream inputStream) throws IOException {

        InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"GBK");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        String output;
        while ((output = bufferedReader.readLine()) != null){
            stringBuilder.append(output);
            stringBuilder.append(ls);
        }
        bufferedReader.close();

        return stringBuilder.toString();

    }

    public static String getOutputByScanner(InputStream inputStream){

        Scanner scanner = new Scanner(inputStream,"GBK");
        Scanner scanner1 = scanner.useDelimiter("\\a");
        String output = scanner1.next();

        return output;
    }

    public static void testRuntime(String[] cmds) throws IOException, InterruptedException {

        Process process = Runtime.getRuntime().exec(cmds);

        //判断命令执行结果
        int exitCode = process.waitFor();
        if (exitCode == 0){
            System.out.println("命令执行成功");
        }else {
            System.out.println("命令执行失败");
        }
        //获取命令执行结果
        InputStream inputStream = process.getInputStream();
        String output = getOutputByBufferReader(inputStream);
//        String output = getOutputByScanner(inputStream);
        System.out.println(output);


        //销毁进程
        process.destroy();

    }

    public static void testProcessBuilder(String[] cmds) throws IOException, InterruptedException {


        Process process = new ProcessBuilder(cmds).start();

        //获取命令执行结果
        int exitCode = process.waitFor();
        if(exitCode == 0){
            System.out.println("命令执行成功");
        }else {
            System.out.println("命令执行失败");
        }

        //获取命令执行结果
        InputStream inputStream = process.getInputStream();
//        String output = getOutputByBufferReader(inputStream);
        String output = getOutputByScanner(inputStream);
        System.out.println(output);

    }

    public static void testInvoke(String[] cmds) throws ClassNotFoundException, NoSuchMethodException, IOException, InvocationTargetException, IllegalAccessException {

        Class clazz = Class.forName("java.lang.ProcessImpl");
        Method start = clazz.getDeclaredMethod("start",String[].class, Map.class,String.class,ProcessBuilder.Redirect[].class,boolean.class);
        start.setAccessible(true);
        Process process = (Process) start.invoke(null,cmds,null,null,null,false);
        InputStream inputStream = process.getInputStream();
//        String output = getOutputByBufferReader(inputStream);
        String output = getOutputByScanner(inputStream);
        System.out.println(output);

    }


    public static void testScriptEngineManager() throws ScriptException, IOException {

        String javascript = "java.lang.Runtime.getRuntime().exec(\"whoami\")";
        Process process = (Process) new ScriptEngineManager().getEngineByExtension("js").eval(javascript);
        InputStream inputStream = process.getInputStream();
//        String output = getOutputByBufferReader(inputStream);
        String output = getOutputByScanner(inputStream);
        System.out.println(output);

    }

    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, ScriptException {
        String[] cmds = {"cmd.exe","/c","ipconfig"};

        testRuntime(cmds);
//        testProcessBuilder(cmds);
//        testInvoke(cmds);
//        testScriptEngineManager();

    }
}
