package by.itAcademy.homeworks.ControlWork.Work4;



import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readFile {
    public static void main(String[] args) {
    }
    public static ArrayList<String> readNewFile(File file) {
        ArrayList<String> arr = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s,s1;
            Pattern pattern = Pattern.compile("25|26|27|28|29|30");
            Pattern pattern1=Pattern.compile("true");

            while ((s = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(s);
                while (matcher.find()){
                    Matcher matcher1=pattern1.matcher(s);
                    while (matcher1.find())
                arr.add(s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
