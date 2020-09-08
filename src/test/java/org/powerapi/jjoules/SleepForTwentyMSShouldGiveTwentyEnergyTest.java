package org.powerapi.jjoules;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.powerapi.jjoules.junit.EnergyTest;

@RunWith(JUnitPlatform.class)
class SleepForTwentyMSShouldGiveTwentyEnergyTest {

	@Test
	void sleepForTwentyMSShouldGiveTwenty() {
		Assertions.assertEquals(20,Sleep.SLEEP.sleep(20));
	}

}
