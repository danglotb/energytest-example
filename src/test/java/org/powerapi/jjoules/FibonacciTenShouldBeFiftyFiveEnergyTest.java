package org.powerapi.jjoules;


import org.junit.jupiter.api.Assertions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.powerapi.jjoules.junit.EnergyTest;

@RunWith(JUnitPlatform.class)
class FibonacciTenShouldBeFiftyFiveEnergyTest {

	@EnergyTest
	void fibonacciTenShouldBeFiftyFive() {
		
//		int timeToWait  = 500;
//		while(timeToWait >0 ) {
//			for(int i = 0; i<timeToWait ;i++) {
//				
//			}
//			timeToWait --;
//		}
		
		Assertions.assertEquals(55,Fibonacci.FIB.fibo(10));
	}

}
