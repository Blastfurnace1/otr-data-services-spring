package com.blastfurnace.otr.util;

public class Utils {
	
	public static long getLong(String value) {
		long returnValue = 0;
		try {
			returnValue = Long.parseLong(value);
		} catch (Exception e) {
			returnValue = -1;
		}
		return returnValue;
	}

	
}
