import java.io.*;
import java.util.regex.*;

class Scratch {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("D://comprog.txt"))){
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("D://prog.txt"))){
                String string;
                boolean srtcom = false;
                while ((string = reader.readLine()) != null) {
                    Pattern pattern = Pattern.compile("//");
                    Pattern pattern1 = Pattern.compile("/\\*");
                    Pattern pattern2 = Pattern.compile("\\*/");
                    Matcher matcher = pattern.matcher(string);
                    Matcher matcher1 = pattern1.matcher(string);
                    Matcher matcher2 = pattern2.matcher(string);
                    String formatstring = string;
                    if (srtcom){
                        if (matcher2.find()){
                            int start = matcher2.start();
                            srtcom = false;
                            writer.write(formatstring.substring(start + 2) + "\n");
                            continue;
                        } else continue;
                    }
                    if (matcher1.find()){
                            int start = matcher1.start();
                            srtcom = true;
                            writer.write(formatstring.substring(0, start) + "\n");
                            continue;
                    }
                    if (matcher.find()){
                        int start = matcher.start();
                        writer.write(formatstring.substring(0, start) + "\n");
                    } else writer.write(formatstring + "\n");
                }}
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }
}