package com.pan;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratePAN {
	
	
	private String dummy  =  "888000";
	FileWriter file = null;
	
	public GeneratePAN() {
		try {
			file = new FileWriter("pan.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void generatePAN(String prefix, int limit) {
		
		String PAN = "";
		String padding1 = "";
		String padding2 = "0";
		String padding3 = "00";
		String padding5 = "000";
		
		for(int i = 1; i < limit; i ++) {
			if(i<10) {
				PAN = prefix + dummy + padding5 + i +"\n";
				System.out.println(PAN);
				try {
					file.write(PAN);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
				
			if(i>=10 & i < 100) {
				PAN = prefix + dummy + padding3 + i+"\n";
				System.out.println(PAN);
				try {
					file.write(PAN);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(i>=100 & i < 1000) {
				PAN = prefix + dummy + padding2 + i+"\n";
				System.out.println(PAN);
				try {
					file.write(PAN);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			if(i>=100 & i < 1000) {
				PAN = prefix + dummy + padding2 + i +"\n";
				
				System.out.println(PAN);
				try {
					file.write(PAN);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

}
