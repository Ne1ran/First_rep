package com.company;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int p = 0, c = 0, k = 0;
    BigInteger P = new BigInteger("0");
    System.out.println("Что вы хотите сделать: Зашифровать - 1; Дешифровать - 0; Выйти из программы - End: ");
	while (true){
        String task = in.nextLine();
        if (task.equals("1")){
            System.out.println("Введите свое сообщение (в виде числа): ");
            int m = in.nextInt();
            System.out.println("Введите число p, которое больше m и является простым числом: ");
            p = in.nextInt();
            while (SimpleCheck(p) || p <= m) {
                System.out.println("Вы ввели неправильное значение! Введите новое: ");
                p = in.nextInt();
            }
            P = new BigInteger(String.valueOf(p));
            System.out.println("Введите число g, являющееся простым числом: ");
            int g = in.nextInt();
            while (SimpleCheck(g)) {
                System.out.println("Вы ввели неправильное значение! Введите новое: ");
                g = in.nextInt();
            }
            c = random.nextInt(p - 1);
            while (SimpleCheck(c)) {
                c = random.nextInt(p - 1);
            }
            int d = BigIntModPow(g, c, 1, P);
            System.out.println("Закрытый ключ с = " + c);
            System.out.println("Открытый ключ d = " + d);
            k = random.nextInt(p - 1);
            while (SimpleCheck(k)) {
                k = random.nextInt(p - 1);
            }
            System.out.println("Случайное число k = " + k);
            int r = BigIntModPow(g, k, 1, P);
            int e = BigIntModPow(d, k, m, P);
            System.out.println("Кодировка вашего числа: (" + r + "," + e + ")");
            System.out.println("Что вы хотите сделать: Зашифровать - 1; Дешифровать - 0; Выйти из программы - End: ");
        } else if (task.equals("0")){
            if (p == 0 || k == 0 || c == 0){
                System.out.println("Вы не можете декодировать не закодировав");
                continue;
            }
            System.out.println("Введите шифр в формате (число1 , число2)");
            String code = in.nextLine();
            code = code.substring(1, code.length() - 1);
            String[] mas = code.split(",");
            int r1 = Integer.parseInt(mas[0]);
            int e1 = Integer.parseInt(mas[1]);
            System.out.println("Загаданное число = " + BigIntModPow(r1, (p - 1 - c), e1, P));
            System.out.println("Что вы хотите сделать: Зашифровать - 1; Дешифровать - 0; Выйти из программы - End: ");
        } else if (task.equals("End")){
            System.out.println("Работа завершена");
            break;
        }
        }
    }
    public static boolean SimpleCheck(int number){
        return number % 2 == 0 && number % 3 == 0 && number % 5 == 0 && number % 7 == 0;
        }
    public static int BigIntModPow(int a, int b, int c, BigInteger ModP){
        BigInteger mid = new BigInteger("1");
        mid = mid.multiply(BigInteger.valueOf(c));
        for (int i = 0; i < b; i++){
            mid = mid.multiply(BigInteger.valueOf(a));
        }
        return mid.mod(ModP).intValue();
    }

    }

