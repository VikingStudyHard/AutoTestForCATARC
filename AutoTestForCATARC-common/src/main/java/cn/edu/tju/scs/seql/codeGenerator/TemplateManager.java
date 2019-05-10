package cn.edu.tju.scs.seql.codeGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemplateManager {

    /**
     * 从模板类中读取字符串
     */
    public static String getTemplateString(String templatePath) {
        File f = new File(templatePath);
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Scanner cin = new Scanner(inputStream,"utf-8");
        StringBuffer buffer = new StringBuffer();
        while(cin.hasNext()){
            buffer.append(cin.nextLine() + "\n");
        }
        cin.close();
        return buffer.toString();
    }

}
