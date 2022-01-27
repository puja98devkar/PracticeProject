package com.mypackage;
import java.util.Scanner;

public class Simple_Interest {
	public static void main(String args[]) 
    {
        float p, r, t, result;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        result = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +result);
    }

}
