package wetagustin.javacompletereference12ed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) {

        try {
            ServerSocket server = new ServerSocket(9000);
            Socket socket = server.accept();

            System.out.println("Client Connected");

            InputStreamReader in = new InputStreamReader(socket.getInputStream());
            BufferedReader buffer = new BufferedReader(in);

            System.out.println("Client says : " + buffer.readLine());

        } catch (IOException e) {
            System.out.println("Error creating server on port 9000");
        }

    }
}
