/**
 * 
 */
package org.powerapi.jjoules;

public class Sleep {
	
	public static final Sleep SLEEP = new Sleep();
	
	public int sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return time;
		
	}
}
