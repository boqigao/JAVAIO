package cn.boqi;

import java.io.File;

/**
 * 测试file
 * 相对路径与绝对路径
 * 1）存在盘符：绝对路径
 * 2）不存在盘符：相对路径
 * 
 */
public class FileDemo01 {
    public static void main(String[] args) {
        String path = "D:/boqi_dropbox/Dropbox/14. Game/" +
                "1. 苍之骑士团/202001吃睡玩/苍骑吃药.txt";

        //1.构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //2.
    }
}
