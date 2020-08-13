/**
 * 
 */
package org.powerapi.jjoules;


import org.junit.jupiter.api.Assertions;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.powerapi.jjoules.junit.EnergyTest;

@RunWith(JUnitPlatform.class)
class FibonacciZeroShouldBeZeroEnergyTest {

	@EnergyTest
	void fibonacciZeroShouldBeZero() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assertions.assertEquals(0,Fibonacci.FIB.fibo(0));
	}

}
