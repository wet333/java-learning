package wetagustin.javacompletereference12ed;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UsingSockets {
    public static void main(String[] args) {

        Socket localSocket;
        int c;

        try {
            localSocket = new Socket(InetAddress.getLocalHost(), 9000);

            InputStream in = localSocket.getInputStream();
            OutputStream out = localSocket.getOutputStream();

            // Request
            byte[] message = "hola mundo".getBytes();
            out.write(message);

            // Response
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }

            //localSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
