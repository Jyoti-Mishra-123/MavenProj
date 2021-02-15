package com.Ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class SecurityUtils {
	
	public static String encode(String plainText) {
		Encoder encoder=Base64.getEncoder();
		String encodedText = encoder.encodeToString(plainText.getBytes());
		return encodedText;
	}
	public static String decode(String encodedText) {
		Decoder decoder=Base64.getDecoder();
		byte[] decode = decoder.decode(encodedText);
		return new String(decode);
	}

	public static void main(String[] args) {
		String encodedText=SecurityUtils.encode("Rinky");
		System.out.println(encodedText);
		String decodedText=SecurityUtils.decode(encodedText);
		System.out.println(decodedText);
	}
}
