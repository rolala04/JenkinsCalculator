package com.rohan.jenkins.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalcTest {

	@Test
	public void addtest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(10,myCalc.addNo(6, 4)); 
	}
	
	@Test
	public void subtest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(7,myCalc.subNo(15, 8)); 
	}
	
	@Test
	public void multest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(9,myCalc.mulNo(3, 3)); 
	}

}
