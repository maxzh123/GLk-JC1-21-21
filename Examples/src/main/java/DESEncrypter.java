import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DESEncrypter {
    public static void main(String[] args) {
        String key="Thikdglgjd93389503034858";
        String text="То чтоdfpg[oflg[d;fghfggfhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh;dfg'f" ;
        try {
            SecretKeyFactory f = SecretKeyFactory.getInstance("DESede");
            SecretKey skey = f.generateSecret(new DESedeKeySpec(key.getBytes(StandardCharsets.UTF_8)));
            Cipher cipher=Cipher.getInstance("DESede");;
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            byte[] plainText = text.getBytes(StandardCharsets.UTF_8);
            byte[] encryptedText = cipher.doFinal(plainText);
            String encrypted=new String(Base64.getEncoder().encodeToString(encryptedText));
            System.out.println(encrypted);

            System.out.println(DESDecrypter.decrypt(key,encrypted));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
