import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: gdprtest
 * @description: 读取esl进入list
 * @author: Mr.Shu
 * @create: 2018-07-19 10:44
 **/
public class ImporExcelForList {
//    public static List<String> method(String path) {
//        Workbook workbook = null;
//        try{
//            workbook = Workbook.getWorkbook(new File(path));
//            return ImportExcelUtil.getDataMap(workbook);
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            workbook.close();
//        }
//        return null;
//    }
    /**
     * 根据excel得到list数据
     * @param
     * @return
     */
    public static  List<String> getData()throws BiffException, IOException {
        //通过Workbook的getSheet方法选择第一个工作簿（从0开始）
        Workbook workbook =Workbook.getWorkbook(new File("F:\\gdprtest\\src\\main\\xsl\\informationData.xls"));
        Sheet sheet = workbook.getSheet(0);

        int rows = sheet.getRows();
        int cols = sheet.getColumns();
        List<String> result = new ArrayList<>();
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                Cell cell= sheet.getCell(i,j);

               result.add(cell.getContents());
            }
        }
        return result;
    }
}
