package com.vtiger.genericutil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	int count = 0, retryLimit = 4;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retryLimit) {
			count++;
			return true;
		}
		return false;
	}
}