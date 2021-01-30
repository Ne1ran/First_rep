package com.company;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x");
        double x = in.nextDouble();
        System.out.println("Введите число n");
        int n = in.nextInt();
        double otvet = 1;
        if ((float)x > 0.5)
            for (int i = 0; i < n; i++){
                otvet += Math.pow((x - 1), i + 1) / ((i + 1) * Math.pow((x + 1), i + 1));
            }
        System.out.println(Math.log(otvet));
    }
}