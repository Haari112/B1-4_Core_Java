package com.JUNIT_Testing;

import org.junit.jupiter.api.Assumptions;

public class JUnitExample10 {
	void accept()
	{
		System.setProperty("1", "Harish");
		Assumptions.assumeTrue("Harish".equals(System.getProperty("2")));
		
		 
	}
}