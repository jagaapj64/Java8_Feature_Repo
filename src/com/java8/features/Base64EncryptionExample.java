package com.java8.features;

import java.util.Base64;

public class Base64EncryptionExample {

	

	public static void main(String[] args) {

		// Getting encoder  
		Base64.Encoder encoder=Base64.getEncoder();
		
		byte[] byteArr= {1,2};
		
		/*
		 * It encodes all bytes from the specified byte array using the Base64 encoding
		 * scheme, writing the resulting bytes to the given output byte array, starting
		 * at offset 0.
		 */		
		byte[] byteArr2=encoder.encode(byteArr);
		System.out.println("Encoded byte Array : "+byteArr2);  // [B@6bc7c054
		
		byte[] byteArr3=new byte[5];
		/*
		 * It encodes all bytes from the specified byte array using the Base64 encoding
		 * scheme, writing the resulting bytes to the given output byte array, starting
		 * at offset 0.
		 */		
		int resultArr=encoder.encode(byteArr, byteArr3);
	    System.out.println("Encoded byte array written to another array : "+byteArr3); // [B@232204a1
	    System.out.println("Number of bytes written : "+resultArr);  // 4
	    
	    String encodeStr=encoder.encodeToString("Hello Java".getBytes());
	    System.out.println("Encoded String : "+encodeStr);
	    
	 // Getting decoder  
	    Base64.Decoder decoder=Base64.getDecoder();
	   String decodeStr=new String(decoder.decode(encodeStr));
	   System.out.println("Decoded String : "+decodeStr);
	   
	// Getting encoderUrl  
	   Base64.Encoder encoderUrl=Base64.getUrlEncoder();
	   
	   //Encoding URl
	   String encodeUrlStr=encoderUrl.encodeToString("https://compiler.javatpoint.com/opr/test.jsp?filename=MethodReference".getBytes());
	   System.out.println("Encoded URL : "+encodeUrlStr);
	   
	// Getting decoderUrl  
	   Base64.Decoder decoderUrlStr = Base64.getUrlDecoder(); 
	   //Decoding URl
	  String decodeUrlStr=new String(decoderUrlStr.decode(encodeUrlStr));
	  System.out.println("Decode URl String : "+decodeUrlStr);
	  
	// Getting MIME encoder 
	  Base64.Encoder encodeMime=Base64.getMimeEncoder();
	  
	  String message="Hello, \nHow many years of Experience of do you have";
	  String encodeMimeStr= encodeMime.encodeToString(message.getBytes());
	  System.out.println("Encoded MIME message : "+encodeMimeStr);
	  
	// Getting MIME decoder 
	  Base64.Decoder decodeMime=Base64.getMimeDecoder();
	  String decodeMimeStr=new String(decodeMime.decode(encodeMimeStr));
	  System.out.println("Decode Mime message : "+decodeMimeStr);
	   
	}

}
