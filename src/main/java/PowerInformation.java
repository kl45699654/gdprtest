import jxl.read.biff.BiffException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: gdprtest
 * @description: 实体
 * @author: Mr.Shu
 * @create: 2018-07-18 17:20
 **/

public class PowerInformation implements PowerInerface{
    public void power() {
//        int key= 1;
//        int getkey=1;
//        if (key == getkey){
//            System.out.print("权限匹配");
        String relativePath = System.getProperty("user.dir");
        String path=relativePath+"\\src\\main\\xsl\\readExcel.xls";
        HashMap<String,String> dataMap = ImportExcelUtil.method(path);
        ImporExcelForList daa= new ImporExcelForList();
        IsPhone phonenum= new IsPhone();

        try {
            int a =0;
            for (int i=0;i<daa.getData().size();i++){
                boolean wdd=phonenum.isMobileNO(daa.getData().get(i));

                if (wdd){
                    a = 1;
                }

            }

            int key = Integer.parseInt(dataMap.get("PHONENUM"));
            if(key==a){
                System.out.print("PHONENUM权限匹配");
            }
            else {
                System.out.println("PHONENUM权限不匹配");
            }

        } catch (BiffException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        }


//    private static void printMap(HashMap<String,String> dataMap){
//        for (Map.Entry<String, String> en: dataMap.entrySet()) {
//           System.out.println(en.getKey()+"..."+en.getValue());
//
//        }
//    }
}
