package io.file;

import org.junit.Test;

import java.io.*;

public class FileReaderWriterTest {
    @Test
    public void test() throws IOException {
        // 需求：读取hello.txt的文件，显示在控制台上
        // 1.创建File类的对象，对应着hello.txt文件
        File file = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/hello.txt");
        // 2.创建输入型的字符流，用于读取数据
        FileReader fr = new FileReader(file);
        // 3. 读取数据，显示在控制台上
        // 3.1 方式1
        int data = fr.read();
        while (data != -1){
            System.out.print((char) data);
            data = fr.read();
        }

        // 3.2 方式2
        int data2;
        while ((data2 = fr.read()) != -1){
            System.out.print((char) data2);
            data2 = fr.read();
        }
        // 4. 关闭流
        fr.close();
    }

    @Test
    public void test2(){
        // 需求：读取hello.txt的文件，显示在控制台上
        // 1.创建File类的对象，对应着hello.txt文件
        // 2.创建输入型的字符流，用于读取数据
        FileReader fr = null;
        try {
            File file = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/hello.txt");
            // 2.创建输入型的字符流，用于读取数据
            fr = new FileReader(file);
            // 3. 读取数据，显示在控制台上
            // 3.1 方式1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }

            // 3.2 方式2
            int data2;
            while ((data2 = fr.read()) != -1) {
                System.out.print((char) data2);
                data2 = fr.read();
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                // 4. 关闭流
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    @Test
    public void test3(){
        FileReader fr = null;
        try {
            // 1.创建File类的对象，对应着hello.txt文件
            File file = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/hello.txt");
            // 2.创建输入型的字符流，用于读取数据
            fr = new FileReader(file);
            // 3. 读取数据，显示在控制台上
            char[] cbuf= new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1){
                for (int i = 0; i < len; i++) {
                    System.out.println(cbuf[i]);
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                // 4. 关闭流
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


    @Test
    public void test4() throws IOException{
        FileWriter fw = null;
        try {
            // 1.创建File类对象，指明要写出的文件的名称，输出时的文件不需要存在
            File file = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/info.txt");
            // 2.创建输出流
            fw = new FileWriter(file); // 替换文件里全部内容
//            fw = new FileWriter(file, false); // 替换文件里全部内容
//            fw = new FileWriter(file, true); // 在现有的文件里追加内容

            // 3.具体操作
            fw.write("A B C\n");
            fw.write("哈哈哈哈\n");
            fw.write("迪拜一大笔\n");

            System.out.println("输出成功");
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                if (fw != null){
                    // 4.关闭资源
                    fw.close();
                }
            } catch (NullPointerException e){
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test5(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            // 创建文件类
            File srcFile = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/hello.txt");
            File destFile = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/hello_copy.txt");

            // 输入输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            // 输入
            char[] cbuff = new char[5];
            int len; // 记录每次读入到cbuffer中字符的个数

            while ((len = fr.read(cbuff)) != -1) {
                // 输出
                fw.write(cbuff, 0, len);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
