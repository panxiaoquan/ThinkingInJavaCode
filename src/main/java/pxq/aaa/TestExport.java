package pxq.aaa;

import org.apache.poi.hssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @describe:
 * @user: pxq
 * @date: 2019/12/2 13:47
 */
public class TestExport {
    private static final Logger log = LoggerFactory.getLogger(TestExport.class);

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\pxq\\Desktop\\test4.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            workbook.setSheetName(0, "test测试");
            int rowNumber = -1;
            HSSFRow row = sheet.createRow(++rowNumber);
            HSSFCellStyle cellStyle = workbook.createCellStyle();
            HSSFFont font = workbook.createFont();
            font.setFontName("宋体");
            font.setFontHeightInPoints((short) 10);
            cellStyle.setFont(font);
            HSSFCell cell = row.createCell(0);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("NAME");
            cell = row.createCell(1);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("SEX");
            cell = row.createCell(2);
            cell.setCellStyle(cellStyle);
            cell.setCellValue("HOBBY");
            List<MembersEnum> membersEnums = getMembers();
            System.out.println("==============" + membersEnums.size());
            for (int i=1; i <= membersEnums.size(); i++) {
                HSSFRow row1 = sheet.createRow(++rowNumber);
                MembersEnum membersEnum = membersEnums.get(i-1);
                HSSFCell cell0 = row1.createCell(0);
                cell0.setCellValue(membersEnum.getName());
                HSSFCell cell1 = row1.createCell(1);
                cell1.setCellValue(membersEnum.getSex());
                HSSFCell cell2 = row1.createCell(2);
                cell2.setCellValue(membersEnum.getHobby());
            }
            System.out.println("==========="+rowNumber);
            workbook.write(fos);
            fos.close();

        } catch (IOException e) {
            log.error("导出错误"+e);
        }

    }

    private static List<MembersEnum> getMembers() {
        List<MembersEnum> list = new ArrayList<>();
        for (MembersEnum membersEnum : MembersEnum.values()) {
            list.add(membersEnum);
        }
        return list;
    }

}

