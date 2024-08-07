package WebServiceCall;

import Controllers.RFID_Starter;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    public static int statusCode = 0;
    public static String username = "admin";
    public static String password = "A123456789a$";
    public static String encoding = Base64.getEncoder().encodeToString((username + ":" + password).getBytes());


    public StringBuffer WebServiceCallold(String url) throws IOException {
        HttpURLConnection con = null;
        StringBuffer response = null;
        URL obj = null;
        try {
            obj = new URL(url);
            con = (HttpURLConnection) obj.openConnection();
            con.setConnectTimeout(5000);
            Authentication(con);
            statusCode = con.getResponseCode();
            BufferedReader in;
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            in = null;
            con.disconnect();
            con = null;
            obj = null;
        } catch (MalformedURLException e) {
            Logger.getLogger(Utils.class.getName()).log(Level.WARNING, "URL Format Failure", e);
        } catch (IOException e) {
            Logger.getLogger(Utils.class.getName()).log(Level.WARNING, "I/O Exception", e);
            throw e;

        }
        return response;
    }

    public static StringBuffer WebServiceCall(String url) throws IOException {
        HttpURLConnection con = null;
        StringBuffer response = null;
        URL obj = null;

        try {
            obj = new URL(url);

            // Open connection
            if (url.startsWith("https")) {
                con = (HttpsURLConnection) obj.openConnection();
                // Bypass DNS name checking
                ((HttpsURLConnection) con).setHostnameVerifier(new HostnameVerifier() {
                    @Override
                    public boolean verify(String hostname, SSLSession session) {
                        // Always return true to bypass DNS name checking
                        return true;
                    }
                });
            } else {
                con = (HttpURLConnection) obj.openConnection();
            }

            con.setConnectTimeout(5000);
            Authentication(con);
            statusCode = con.getResponseCode();

            // Read response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } finally {
            if (con != null) {
                con.disconnect();
            }
        }

        return response;
    }

    public static void Authentication(HttpURLConnection con) throws ProtocolException {
        if (RFID_Starter.isBsicAuth == 1) {
            con.setRequestMethod("GET");
            con.setDoOutput(true);
            con.setRequestProperty("Authorization", "Basic " + encoding);
        } else {
            con.setRequestMethod("PUT");
            con.setDoOutput(true);
            System.out.println("Bearer Auth :" + RFID_Starter.token);
            con.setRequestProperty("Authorization", "Bearer " + RFID_Starter.token);
        }


        con.setUseCaches(false);
    }

}
