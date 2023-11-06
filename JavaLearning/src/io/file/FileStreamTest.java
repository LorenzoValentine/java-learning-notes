package io.file;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
    @Test
    public void test() throws IOException {
        // 1.创建相关File类对象
        File srcFile = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/pic1.JPG");
        File desFile = new File("/Users/doujingqi/Documents/Macbook Document/Notes/java-learning-notes/JavaLearning/src/io/file/pic1_copy.JPG");
        // 2.创建相关字节流
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(desFile, false);
        // 3.数据的读入和输出
        // 找一个小车
        byte[] buffer = new byte[1024];
        int len; // 记录读入buffer中字节的个数
        while ((len = fis.read(buffer)) != -1){
            fos.write(buffer, 0, len);
        }
        // 4.关闭流
        fis.close();
        fos.close();
    }
}
