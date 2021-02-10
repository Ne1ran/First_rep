import java.util.*;
import java.io.*;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = in.nextLine(), otvet = "";
        for (int i = 0; i < stroka.length() - 1; i += 2) {
            int a = Integer.parseInt(stroka.substring(i, i + 1));
            String b = stroka.substring(i + 1, i + 2);
            for (int j = 0; j < a; j++) {
                otvet += b;
            }
        }
        String finalOtvet1 = otvet;
        class Program {
            public void main(String[] args) {
                try(FileOutputStream wr=new FileOutputStream("D:\\file1.txt")){
                    byte[] buffer = finalOtvet1.getBytes();
                    wr.write(buffer, 0, buffer.length);
                }
                catch(IOException ex){

                    System.out.println(ex.getMessage());
            }
        }
    }
    }
}