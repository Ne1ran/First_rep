package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = "";
        String otvet = "";
        System.out.println("Введите число больше 2");
        int num = in.nextInt();
        if (num > 2) {
            for (int i = 1; i <= num; i++){
                if  (i % 2 != 0 && i % 3 != 0 && i % 5 !=0 && i % 7 != 0 || i == 2 || i == 3 || i == 5 || i == 7){
                    str1 += Integer.toString(i) + " ";
                }
            }
            String[] mas1 = str1.split(" ");
            String[] mas2 = str1.split(" ");
            for (int i = 0; i < mas1.length; i++){
                for (int j = 0; j < mas2.length; j++){
                    if (Integer.parseInt(mas1[i]) + Integer.parseInt(mas2[j]) == num){
                        otvet += Integer.toString(Integer.parseInt(mas1[i])) + " - " + Integer.toString(Integer.parseInt(mas2[j])) + "; ";
                        mas1[i] = "0";
                        mas1[j] = "0";
                    }
                }
            }
        } else if (num == 2) {
            System.out.println("1 - 1");
        } else System.out.println("Вы ввели неправильное число");
        if (otvet.equals("")) {
            System.out.println("Нет решений");
        } else System.out.println(otvet);
        }
    }