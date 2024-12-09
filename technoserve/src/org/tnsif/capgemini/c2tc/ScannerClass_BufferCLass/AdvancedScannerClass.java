package org.tnsif.capgemini.c2tc.ScannerClass_BufferCLass;
import java.util.Scanner;
public class AdvancedScannerClass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter some data(enter number or text}");
		while(scan.hasNext())
		{
			if(scan.hasNextInt()) {
				int intvalue=scan.nextInt();
				System.out.println("read an interger "+intvalue);
			}
			else if(scan.hasNextDouble()) {
				double doublevalue=scan.nextDouble();
				System.out.println("read an double "+doublevalue);
				
			}
			else {
				String stringvalue=scan.next();
				System.out.println("unknown value "+stringvalue);
			}
		}
	}

}
