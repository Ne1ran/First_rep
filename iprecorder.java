import java.io.*;
import java.util.Scanner;
import java.util.regex.*;

class Scratch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
                    System.out.print("Введите команду (1 - для ввода IP-адреса, любую другую кнопку - вывод записанных адресов): ");
                    String command = in.nextLine();
                    if (command.equals("1")) {
                        try(FileWriter writer = new FileWriter("D://ips.txt", true)){
                            System.out.println("Введите IP-адрес");
                        String ip = in.nextLine();
                        Pattern ipbase = Pattern.compile("((1?[1-9][0-9])|(1?[0-9]?[1-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.(((1?[1-9][0-9])|(1?[0-9]?[1-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))\\.){2}((1?[1-9][0-9])|(1?[0-9]?[0-9])|(1[0-9][0-9])|(2[0-4][0-9])|(25[0-5]))");
                        Matcher ipcheck = ipbase.matcher(ip);
                        if (ipcheck.matches()) {
                            System.out.println("IP введен верно");
                            writer.write(ip + "\n");
                        } else {
                            System.out.println("IP введен неверно");
                        }
                    } catch (IOException e) {
                            e.printStackTrace();
                        }} else {
                        try(BufferedReader reader = new BufferedReader(new FileReader("D://ips.txt"))){
                            String string;
                            while ((string = reader.readLine()) != null){
                            System.out.println(string);
                        }
                        break;
                    } catch (IOException exception){
                            exception.printStackTrace();
        }
    }
}}}