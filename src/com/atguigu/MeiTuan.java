package com.atguigu;

import java.io.File;

/**
 * @author ：Shine
 * @description：
 * @date ：2021/3/31 20:33
 */
public class MeiTuan {
    public static void main(String[] args) {
        //    某个目录下所有的文件及其子文件打印出来
        File file = new File("G:\\meituan");
         getFileName(file);
         if (file.listFiles()==null){
             System.out.println("当前目录没有子目录"+file.getName());
         }
        }

    public static void getFileName(File fs){
        boolean dirFlag = fs.isDirectory();
        if(dirFlag){
            File[] files = fs.listFiles();
        if (files!=null){
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
                getFileName(files[i]);
            }
        }}
    }
}
