package com.myStudy.day1030;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author dengdogegg
 * @version 1.0.0
 * @ClassName FileTest.java
 * @Description IO流
 * 数据单位分：字节流8bit 字符流16bit
 * 数据流向分：输入流 输出流
 * 抽象基类：
 *          字节流            字符流
 * 输入流    InputStream    Reader
 * 输出流    OuputStream    Writerer
 * 角色：节点流，处理流
 *
 *
 *
 *
 * @createTime 2021年10月30日 21:09:00
 *
 *
 */



public class FileTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getAbsoluteFile()); //相对路径
        File file2 = new File("day1030//hello.txt");
        System.out.println(file2.getAbsoluteFile());//绝对路径
    }
    @Test
    public void TestInputStream() throws IOException {
        //实例化
        File file = new File("hello.txt");
//        提供具体流
        FileReader fileReader = new FileReader(file);
//        数据读入
        int data = fileReader.read();
        while (data !=-1){
            System.out.println("data = " + (char)data);
            data = fileReader.read();
        }
        fileReader.close();
    }


}
