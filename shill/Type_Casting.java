package com.Skill;

public class Type_Casting {
	public static void main(String[] args) {
		double d = 123.456;
		float f = (float)d; // double -----> Float
		long l = (long)f;  	// Float -----> long
		int i = (int)l;     // Long -----> int
		short s = (short)i; // Int ----> short
		byte b = (byte)s;   // Short ----> Byte
		int num = 65;
		char ch = (char)num; // int ----> char
		System.out.println("Byte: " + b);
		System.out.println("int to char: " + ch); // A
		
	}
}