package wetagustin.javacompletereference12ed;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class URLbasedConnections {
    public static void main(String[] args) {

        try {

            URL url = new URL("https://www.youtube.com/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            InputStream in = connection.getInputStream();

            int c;
            while( (c = in.read()) != -1 ) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
