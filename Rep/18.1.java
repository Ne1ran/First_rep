package com.company;
import java.util.Scanner;
import java.math.*;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а");
        double a = in.nextInt();
	        double b = (a + 2) / Math.sqrt(2 * a);
	        double c = a / Math.sqrt(2 * a + 2);
	        double d = 2 / (a - Math.sqrt(2 * a));
	        double e = (Math.sqrt(a) - Math.sqrt(2)) / (a + 2);
	        double x1 = (b - c + d) * e;
	        System.out.println(x1);
    }
}
