package by.itAcademy.homeworks.threads.CallableTask58;

import java.util.Random;

public class RandomString {
    private static Words[] words = Words.values();
    private static Random random = new Random();

    public static String getRandomString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb.append(words[random.nextInt(words.length)]).append(" ");
        }
        return sb.toString();
    }
}
