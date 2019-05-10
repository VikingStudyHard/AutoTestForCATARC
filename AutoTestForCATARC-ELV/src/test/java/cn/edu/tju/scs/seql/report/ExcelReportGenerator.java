package cn.edu.tju.scs.seql.report;

import org.testng.*;
import org.testng.log4testng.Logger;
import org.testng.xml.XmlSuite;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Reported designed to render self-contained HTML top down view of a testing
 * suite.
 * 
 * @author Paul Mendelson
 * @since 5.2
 * @version $Revision: 719 $
 */
public class ExcelReportGenerator extends TestListenerAdapter implements IReporter{
	private static final Logger L = Logger.getLogger(ExcelReportGenerator.class);
	private String runDate = "";
	private String projectName = "";
	private String startTime = "";
	private String costTime = "";
	private long start = -1;
	private long end = -1;
	private String endTime = "";
	private int totalCase = 0;
	private int success = 0;
	private int failure = 0;
	List<ITestContext> module = new ArrayList<ITestContext>();

	// ~ Methods --------------------------------------------------------------
	
	/* 
	 * 毫秒转化时分秒毫秒 
	 */  
	public String formatTime(Long ms) {  
	    Integer ss = 1000;  
	    Integer mi = ss * 60;  
	    Integer hh = mi * 60;  
	    Integer dd = hh * 24;  
	  
	    Long day = ms / dd;  
	    Long hour = (ms - day * dd) / hh;  
	    Long minute = (ms - day * dd - hour * hh) / mi;  
	    Long second = (ms - day * dd - hour * hh - minute * mi) / ss;  
	    Long milliSecond = ms - day * dd - hour * hh - minute * mi - second * ss;  
	      
	    StringBuffer sb = new StringBuffer();  
	    if(day > 0) {  
	        sb.append(day+"天");  
	    }  
	    if(hour > 0) {  
	        sb.append(hour+"小时");  
	    }  
	    if(minute > 0) {  
	        sb.append(minute+"分");  
	    }  
	    if(second > 0) {  
	        sb.append(second+"秒");  
	    }  
	    return sb.toString();  
	}

	public static String formatTimeInMillis(long timeInMillis) {  
		System.out.println(timeInMillis);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	    Date date= new Date(timeInMillis);
	    String fmt = sdf.format(date);  
	    System.out.println(fmt);
	  
	    return fmt;  
	}  
	
	/** Creates summary of the run */
	public void generateReport(List<XmlSuite> xml, List<ISuite> suites, String outdir) {
		Date nowTime=new Date(); 
		SimpleDateFormat time=new SimpleDateFormat("yyyy年MM月dd日"); 
		runDate = time.format(nowTime).toString();
		for (ISuite suite : suites) {
			List<ITestResult> list = this.getFailedTests();
//			ITestResult result = list.get(0);
//			String str = result.getInstanceName();
			if (suites.size() > 1) {
				
			}
			projectName = suite.getName();
			Map<String, ISuiteResult> tests = suite.getResults();
			for (ISuiteResult r : tests.values()) {
				ITestContext overview = r.getTestContext();
				module.add(overview);
				success += overview.getPassedTests().size();
				failure += overview.getFailedTests().size();
			}
		}
		totalCase = success + failure;
		
		PoiClient.buildExcel(runDate, projectName, startTime, endTime, costTime, totalCase, success, failure, module);
	}
	
	
	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
	}

	@Override
	public void onTestStart(ITestResult tr) {
		super.onTestStart(tr);
		if (startTime == "" && start == -1){
			Date date = new Date();
			SimpleDateFormat time=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
			start = date.getTime();
			startTime = time.format(date).toString();
		}
		if (start == -1){
			start = System.currentTimeMillis(); 
		}
		
	}

	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);
		System.out.println("finish");
		Date date = new Date();
		SimpleDateFormat time=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss"); 
		end = date.getTime();
		endTime = time.format(date).toString();
		long during = end - start;
		costTime = formatTimeInMillis(during);
		costTime = formatTime(during);
	}
}
