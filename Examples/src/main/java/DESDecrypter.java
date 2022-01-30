import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DESDecrypter {
    public static void main(String[] args) {
        String key="Thikdglgjd93389503034858";
        String text="uE7QLw09eX7eXwqeQwTI4/LSCp/SiR9WoAzdFBM1M7I="; //то что надо расшифровать
        System.out.println(decrypt(key,text));
    }

    public static  String decrypt(String key,String encrypted){
        try {
            SecretKeyFactory f = SecretKeyFactory.getInstance("DESede");
            SecretKey skey = f.generateSecret(new DESedeKeySpec(key.getBytes(StandardCharsets.UTF_8)));
            Cipher cipher=Cipher.getInstance("DESede");;
            cipher.init(Cipher.DECRYPT_MODE, skey);
            byte[] data = Base64.getDecoder().decode(encrypted);
            byte[] decrypted = cipher.doFinal(data);
            return new String(decrypted,StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
