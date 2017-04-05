package com.ijoy.core.util;

import org.apache.commons.codec.binary.Base64;

/**
 * Base64Util 工具类，加盐
 */
public class Base64Util {
	/**
	 * 加密
	 * @param arg1
	 * @return
	 */
	public static String encode(String arg1){
		
		byte[] binaryData=arg1.getBytes();
		return Base64.encodeBase64String(binaryData);
	}
	
	
	public static String decode(String arg1){
		return new String(Base64.decodeBase64(arg1));
	}
	
	
	  
	 
	 
}

