import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.apache.commons.collections4.CollectionUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: gdprtest
 * @description: 实现
 * @author: Mr.Shu
 * @create: 2018-07-18 17:25
 **/
public class test {
    public static void main(String[] args) throws Exception {

        //通过Workbook的静态方法getWorkbook选取Excel文件
        PowerInerface KEY = new PowerInformation();

        KEY.power();






    }
}