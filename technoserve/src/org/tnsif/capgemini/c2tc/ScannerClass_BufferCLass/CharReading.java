package org.tnsif.capgemini.c2tc.ScannerClass_BufferCLass;
import java.util.Scanner;
public class CharReading {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string ");
		char c=scan.next().charAt(0);
		System.out.println("the first charater of string is "+c);
		
	}

}
