import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число Х");
    int x = in.nextInt();
    int count = 0;
    String otvet = "";
    for(int i = 10; i < x; i++){
        String mid = String.valueOf(i);
        String i1 = "";
        for(int j = mid.length(); j > 1; j--){
            int a = Integer.parseInt(mid.substring(j - 1, j));
            if(a != 0){
                i1 += mid.substring(j - 1, j);
            }
        }
        i1 += mid.substring(0, 1);
        if(i + Integer.parseInt(i1) == x){
            otvet += (i + " ");
        }
    }
    if(otvet.length() > 0){
        System.out.println(otvet);
    }
    else {
        System.out.println("У этого числа нет уникальных чисел");
    }
    }
    }
