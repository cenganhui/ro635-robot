package com.cgh.ro635bot.utils;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 读取文件夹下所有文件名并拼接成sql语句输出到txt文件中
 *
 * @author Akuma
 * @date 2021/4/9 22:43
 */
public class PrintFileName {

    public static final String PATH = "D:\\IdeaProjects\\TestPic\\2021-5-1";

    public static final String SQL1 = "INSERT INTO random_picture (pid) VALUES ('";
    public static final String SQL2 = "');";

    /**
     * 读取文件夹下的文件名
     */
    public static void getFileName() {
        // 获取路径
        File f = new File(PATH);
        if (!f.exists()) {
            // 不存在就输出
            System.out.println(PATH + " not exists");
            return;
        }
        // 用数组接收
        File[] fa = f.listFiles();
        // 获取数组中的第i个
        assert fa != null;
        StringBuilder stringBuilder = new StringBuilder();
        // 循环遍历
        for (File fs : fa) {
            if (fs.isDirectory()) {
                // 如果是目录就输出
                System.out.println(fs.getName() + " [目录]");
            } else {
                // 否则直接输出
//                System.out.println(fs.getName());
                stringBuilder.append(SQL1)
                        .append(fs.getName())
                        .append(SQL2)
                        .append("\r\n");
            }
        }
        writeTxt(PATH + "_sql.txt", stringBuilder.toString());
        System.out.println("write txt success");
    }

    /**
     * 使用FileOutputStream来写入txt文件
     *
     * @param txtPath txt文件路径
     * @param content 需要写入的文本
     */
    public static void writeTxt(String txtPath, String content) {
        FileOutputStream fileOutputStream = null;
        File file = new File(txtPath);
        try {
            if (file.exists()) {
                //判断文件是否存在，如果不存在就新建一个txt
                file.createNewFile();
            }
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        getFileName();
    }

}
