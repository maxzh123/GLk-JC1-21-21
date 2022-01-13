import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeatherGetter {
    public static void main(String[] args) {
        getWeather();
    }

    static public String getWeather() {
        final CloseableHttpClient httpClient = HttpClients.createDefault();
        String result=null;
        HttpGet request = new HttpGet("https://www.gismeteo.ru/weather-gomel-4918/");

        request.addHeader(HttpHeaders.USER_AGENT, "Googlebot");

        try (CloseableHttpResponse response = httpClient.execute(request)) {

            // Get HttpResponse Status
            System.out.println(response.getStatusLine().toString());

            HttpEntity entity = response.getEntity();
            Header headers = entity.getContentType();
            //System.out.println(headers);

            if (entity != null) {
                // return it as a String
                result = EntityUtils.toString(entity);
                Pattern p=Pattern.compile("^\\s*M\\.state\\.popup\\.dates\\s*=\\s*\\[([\\S\\s]*?)\\]\\s*$",Pattern.MULTILINE);
                Matcher m=p.matcher(result);
                if (m.find()){
                    result= m.group(1);
                    Pattern p2=Pattern.compile("\\{([^}]*?\"key\":1,[^}]*)\\}");
                    Matcher m2=p2.matcher(result);
                    if (m2.find()){
                        result= m2.group(1);
                        result=result.replaceAll("\",\"","\r\n");
                        result=result.replaceAll("\":\""," ");
                        result=result.replaceAll("[\":]+","");
                    }
                }
                System.out.println(result);

            }

        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                httpClient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
          return result;
        }
    }
