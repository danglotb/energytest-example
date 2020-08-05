/**
 * 
 */
package org.powerapi.jjoules;

/**
 * @author spirals
 *
 */
public class Sleep {
	
	public int sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return time;
		
	}
}
