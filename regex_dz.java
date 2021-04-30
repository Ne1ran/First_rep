import java.util.Scanner;
import java.util.regex.*;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ip-адрес: ");
        String ip = in.nextLine();
        Pattern ipbase = Pattern.compile("((1?[1-9][0-9])|(1?[0-9]?[1-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.(((1?[1-9][0-9])|(1?[0-9]?[1-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.){2}((1?[1-9][0-9])|(1?[0-9]?[0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))");
        Matcher ipcheck = ipbase.matcher(ip);
        if (ipcheck.matches()) {
            System.out.println("IP введен верно");
        } else {
            System.out.println("IP введен неверно");
        }
    }
}