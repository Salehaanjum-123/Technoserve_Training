package org.tnsif.capgemini.c2tc.ScannerClass_BufferCLass;

import java.util.Scanner;

public class SCannerCLassDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter ur name: ");
		String name=scan.nextLine();
		System.out.println("enter ur age: ");
		int age=scan.nextInt();
		System.out.println("name : "+name+ " "+"age: "+age);
		scan.close();
	}
}
