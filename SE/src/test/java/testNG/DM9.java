package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class DM9 implements ITestListener {

	ExtentSparkReporter SrkR;
	ExtentReports ExtR;
	ExtentTest test;

	void OnStart(ITestContext v) {

		SrkR = new ExtentSparkReporter(System.getProperty("user.dir") + "C:\\Manik_Eclipse_Wkspace\\SE\\ExtentR\\ExtentReport.html");

		SrkR.config().setDocumentTitle("Automation Report");
		SrkR.config().setReportName("QA Testing");
		SrkR.config().setTheme(Theme.DARK);

		ExtR = new ExtentReports();
		ExtR.attachReporter(SrkR);

		ExtR.setSystemInfo("Manik", "QA");
		ExtR.setSystemInfo("Balaji", "QC");

	}

	void OnTestSuccess(ITestResult k) {

		test = ExtR.createTest(k.getName());
		test.log(Status.PASS, " TC" + k.getName());

	}

	void OnTestFailure(ITestResult k) {

		test = ExtR.createTest(k.getName());
		test.log(Status.FAIL, " TC" + k.getName());

	}

	void OnTestSkipped(ITestResult k) {

		test = ExtR.createTest(k.getName());
		test.log(Status.SKIP, " TC" + k.getName());

	}

	void OnFinish(ITestResult v) {

		ExtR.flush();

	}

}
