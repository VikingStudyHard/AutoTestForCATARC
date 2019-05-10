package cn.edu.tju.scs.seql.report;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.testng.ITestContext;

import java.io.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class PoiClient {
	public static String getTime(){
		Date nowTime=new Date(); 
		SimpleDateFormat time=new SimpleDateFormat("yyyyMMddHHmmss"); 
		return time.format(nowTime).toString();
	}
	
	public static HSSFWorkbook loadExl(){
		 File fi=new File("template.xls");  
	     POIFSFileSystem fs = null;
		try {
			fs = new POIFSFileSystem(new FileInputStream(fi));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  
	     //读取excel模板  
	     HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	     return wb;
	}
	
	public static void buildExcel(String runDate, String projectName, String startTime, String endTime, String costTime, int totalCase, int success, int failure, List<ITestContext> module){
		HSSFWorkbook wb = loadExl();
		HSSFSheet sheet = wb.getSheetAt(0);  
        //在相应的单元格进行赋值  
        HSSFCell runDateCell = sheet.getRow(1).getCell(1);  
        runDateCell.setCellValue(runDate);  
        HSSFCell projectNameCell = sheet.getRow(1).getCell(3);  
        projectNameCell.setCellValue(projectName);  
        HSSFCell startCell = sheet.getRow(2).getCell(1);  
        startCell.setCellValue(startTime);    
        HSSFCell endCell = sheet.getRow(2).getCell(3);  
        endCell.setCellValue(endTime);    
        HSSFCell costCell = sheet.getRow(2).getCell(5);  
        costCell.setCellValue(costTime);  
        HSSFCell numCell = sheet.getRow(3).getCell(1);  
        numCell.setCellValue(totalCase);  
        HSSFCell sucCell = sheet.getRow(3).getCell(3);  
        sucCell.setCellValue(success); 
        HSSFCell failCell = sheet.getRow(3).getCell(5);  
        failCell.setCellValue(failure); 
        
        Random random=new Random();
        HSSFCell cell;
        for(int i = 0; i < module.size(); i++){
        	ITestContext overview = module.get(i);
        	HSSFRow row = sheet.createRow(6 + i);
        	cell = row.createCell(0);
        	cell.setCellValue(i + 1);
        	cell = row.createCell(1);
        	cell.setCellValue(overview.getName());
        	int suc = overview.getPassedTests().size();
        	int fail = overview.getFailedTests().size();
        	int total = suc + fail;
        	cell = row.createCell(2);
        	cell.setCellValue(total);
        	cell = row.createCell(3);
        	cell.setCellValue(suc);
        	String rate =(new BigDecimal((double)suc/total*100)).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue()  + "%";
        	cell = row.createCell(4);
        	cell.setCellValue(fail);
        	cell = row.createCell(5);
        	cell.setCellValue(rate);  
        	
        }
        //修改模板内容导出新模板 
        try{
        	FileOutputStream out = new FileOutputStream("测试用例报告_" + getTime() + ".xls");         	
            wb.write(out);  
            out.close();  
        } catch (Exception e){
        	System.out.println(e.getMessage());
        }
        
	}
	
	
//	public static void main(String[] args) {
//		Date nowTime=new Date(); 
//		SimpleDateFormat time=new SimpleDateFormat("yyyy年MM月dd日"); 
//		String runTime = time.format(nowTime).toString();
//		String startTime = runTime;
//		String endTime = runTime;
//		String projectName = "自动化测试项目";
//		String costTime = "00:00:00";
//		int totalCase = 13;
//		int success = 9;
//		int failure = 4;
//		List<String> module = new ArrayList<String>();
//		module.add("注册");
//		module.add("登录");
//		module.add("搜索");
//		module.add("高级搜索");
//		module.add("首页");
//		module.add("个人中心");
//		buildExcel(runTime, projectName, startTime, endTime, costTime, totalCase, success, failure, module);
//	}
//	
}

