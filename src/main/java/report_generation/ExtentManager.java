package report_generation;

import java.io.File;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentManager {
	public static ExtentReports reports;
	public static String screenshotFolderpath;
	public static String reportFolderpath;
	
	
	public static ExtentReports getReports () {
		
		if (reports==null) {
	 reports = new ExtentReports();
	Date d= new Date();
	String reportFolder= d.toString().replaceAll(":", "-")+ "// screenshots//";
	
	String screenshotFolderpath= System.getProperty("user.dir")+ "//reports//" + reportFolder;
	String reportFolderPath= System.getProperty("user.dir")+"//reports//"+ d.toString().replaceAll(":", "-");
	
	File f = new File(screenshotFolderpath);
	f.mkdirs();
	
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter(reportFolderPath);
	sparkReporter.config().setReportName("Guru 99 bank version1");
	sparkReporter.config().setDocumentTitle("Tarlesh Automation report");
	sparkReporter.config().setTheme(Theme.STANDARD);
	sparkReporter.config().setEncoding("utf-8");
	
	reports.attachReporter(sparkReporter);
	
	
	
	} 		return reports;
	
}
}