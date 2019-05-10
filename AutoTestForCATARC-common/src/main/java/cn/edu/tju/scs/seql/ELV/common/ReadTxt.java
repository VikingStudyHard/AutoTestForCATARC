package cn.edu.tju.scs.seql.ELV.common;


import java.io.*;
import java.util.Vector;

public class ReadTxt {
    public static Vector<String> NoAutoID() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        Vector<String> IdArray = new Vector<>();
        try {
            String str = "";

            fis = new FileInputStream("E:\\project\\ELV_LIMS_Function_Test\\AutoTestForCATARC-ELV\\doc\\因为ShowModalDialog无法继续测试的用例.txt");
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            while ((str = br.readLine()) != null) {
                IdArray.add(str.substring(str.lastIndexOf("_") + 1,str.length()-1));
            }
            /*for (String id : IdArray
                    ) {
                System.out.println(id);
            }*/

        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("读取文件失败");
        } finally {
            try {
                br.close();
                isr.close();
                ;
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return IdArray;
    }

}
