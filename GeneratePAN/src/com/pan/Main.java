package com.pan;

public class Main {

	public static void main(String[] args) {
		GeneratePAN pan = new GeneratePAN();
		String prefix = "502195";
		pan.generatePAN(prefix, 1000);

	}

}
