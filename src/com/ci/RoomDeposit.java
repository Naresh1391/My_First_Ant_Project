/**
 * 
 */
package com.ci;

/**
 * @author mucha
 *
 */
public class RoomDeposit {
public int initialAmount;
public RoomDeposit(){
	initialAmount=5000;
}
	public int getInitialAmount() {
		return initialAmount;
	}

	public int getMonthlyAmount() {
		return initialAmount+2000;
	}

}
