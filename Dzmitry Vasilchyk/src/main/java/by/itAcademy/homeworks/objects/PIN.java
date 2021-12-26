package by.itAcademy.homeworks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PIN {
    public void pincod () throws IOException {
        String cod = "1111";
        for (int i=1; i<=3;i++){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите пинкод. У Вас " + (4-i) + " попытки(а):");
            String s = reader.readLine();
            if (s.equals(cod)){
                System.out.println("Здравствуйте!");
                return;
            }
        }
        System.out.println("До свидания. Ваша карточка заблокирована");
        System.exit(0);
    }
}


