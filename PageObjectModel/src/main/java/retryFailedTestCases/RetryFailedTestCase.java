package retryFailedTestCases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTestCase  implements IRetryAnalyzer{
	int maxretry=2;
	int retryCount=0;

	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && retryCount<maxretry) {
		retryCount++;
		
			
		return true;
	}
		return false;

}
}