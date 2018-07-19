
import java.io.File;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.HashMap;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ImportExcelUtil {


    public static HashMap<String,String> method(String path) {
        Workbook workbook = null;
        try{
            workbook = Workbook.getWorkbook(new File(path));
            return ImportExcelUtil.getDataMap(workbook);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            workbook.close();
        }
        return null;
    }
    /**
     * 根据excel得到map数据
     * @param workbook
     * @return
     */
    public static  HashMap<String,String> getDataMap(Workbook workbook) {
        //通过Workbook的getSheet方法选择第一个工作簿（从0开始）

        Sheet sheet = workbook.getSheet(0);

        int rows = sheet.getRows();
        int cols = sheet.getColumns();
        HashMap<String,String> dataMap = new HashMap<String, String>();
        for(int colNum=1;colNum<cols;++colNum){
            for(int rowNum=1;rowNum<rows;++rowNum){
                //获取单元格值
                String zNumStr = sheet.getCell(colNum,rowNum).getContents().trim();
                //double zNum = Double.parseDouble(zNumStr);
                //获取当前z值的x值
                String curRowXStr = sheet.getCell(0,rowNum).getContents();
                //Double curRowX = Double.parseDouble(curRowXStr);
                //获取当前z值的Y值
                String curColYStr = sheet.getCell(colNum,0).getContents();
                // Double curColY = Double.parseDouble(curColYStr);
                String key = curRowXStr+curColYStr;
                dataMap.put(key, zNumStr);
            }
        }
        return dataMap;
    }
//    private static void printMap(HashMap<String,String> dataMap){
//        for (java.util.Map.Entry<String, String> en: dataMap.entrySet()) {
//            System.out.println(en.getKey()+"..."+en.getValue());
//        }
//    }
}



