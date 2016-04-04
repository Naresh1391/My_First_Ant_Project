package com.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.ci.RoomDeposit;

public class RoomDepositTest {
	
	RoomDeposit obj = null;
	
@Before
	public void setUp(){
		 obj = new RoomDeposit();
	}
@Test
	public void initialize(){
		
		int intialDeposit = obj.getInitialAmount();
		Assert.assertEquals(5000, intialDeposit);
		
	}
@Test
	public void currentDue(){
		int monthlyAmount = obj.getMonthlyAmount();
		Assert.assertEquals(7000, monthlyAmount);
	}
@After
public void tearDown(){
	obj = null;
}
}
