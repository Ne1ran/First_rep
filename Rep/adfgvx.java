import java.util.Locale;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        String[][] adfgvx = {
        {"","A","D","F","G","V","X"},
        {"A","A","B","C","D","E","F"},
        {"D","G","H","I","J","K","L"},
        {"F","M","N","O","P","Q","R"},
        {"G","S","T","U","V","W","X"},
        {"V","Y","Z","1","2","3","4"},
        {"X","5","6","7","8","9","0"}};
        Scanner in = new Scanner(System.in);
        System.out.println("Что вы хотите сделать? Закодировать или декодировать (code or decode)");
        String zada4a = in.nextLine().toLowerCase();
        String checkstr = "QWERTYUIOPASDFGHJKLZXCVBNM1029384756", otvet = "";
        if (zada4a.equals("code")) {
            System.out.println("Введите строку");
            String stroka = in.nextLine().toUpperCase();
            for (int i = 0; i < stroka.length(); i++){
                if (checkstr.contains(stroka.substring(i, i+1))){
                    for (int j = 1; j < 7; j++){
                        for (int g = 1; g < 7; g++){
                            if (stroka.substring(i, i+1).equals(adfgvx[j][g])){
                                otvet += adfgvx[j][0] + adfgvx[0][g];
                            }
                        }
                    }
                } else {
                    otvet += stroka.substring(i, i+1);
                }
            }
            System.out.println(otvet);
        } else {
            if (zada4a.equals("decode")) {
                System.out.println("Введите строку");
                String stroka = in.nextLine().toUpperCase();
                for (int i = 0; i < stroka.length() - 1; i += 2){
                    if (checkstr.contains(stroka.substring(i, i+1)) & checkstr.contains(stroka.substring(i+1, i+2))) {
                        for (int j = 1; j < 7; j++) {
                            for (int g = 1; g < 7; g++) {
                                if (stroka.substring(i, i+1).equals(adfgvx[0][j]) & stroka.substring(i+1, i+2).equals(adfgvx[g][0])){
                                    otvet += adfgvx[j][g];
                                }
                            }
                        }
                    }else {
                        otvet += stroka.substring(i, i+1);
                        i--;
                    }
                }
                System.out.println(otvet);
            } else System.out.println("Такой задачи нет");
        }
}   }