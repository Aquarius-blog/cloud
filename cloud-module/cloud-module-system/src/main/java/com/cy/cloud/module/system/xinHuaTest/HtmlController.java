package com.cy.cloud.module.system.xinHuaTest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class HtmlController {

    public static void main(String[] args) throws IOException {
        String path = "/Applications/work/ucap/xinHuaExpress/test/xinhua_test/html/main.html";
        File file = new File(path);
        // 解析模板文件为 doc
        Document doc = Jsoup.parse(file, "UTF-8");
        Element element = doc.getElementById("content_");
        if (element != null) {
            element.html("替换后的内容。。。");
        }

        String path2 = "/Applications/work/ucap/xinHuaExpress/test/xinhua_test/html/main2.html";
        File file2 = new File(path2);
        if (!file2.exists()) {
            file2.createNewFile();
        }
        FileOutputStream fos = new FileOutputStream(file2, false);
        // 设置输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        // 讲doc写入文件中
        osw.write(doc.html());
        osw.close();
    }
}
