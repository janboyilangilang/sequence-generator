package com.main;

public class SequenceGenerator {
	
	public long getSequenceValue(long sequenceNumber) {
		
		long result = 0;
		
		for (int i = 0; i <= sequenceNumber; i++) {
			
			if(i % 2 == 0) {
				result *= i;
			} else {
				result += i;
			}
		}
		
		return result;
	}
}
