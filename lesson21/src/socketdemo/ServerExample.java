package socketdemo;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket listener = null;
        InetAddress ia;
        String line;
        BufferedReader is;
        BufferedWriter os;
        Socket socketOfServer;

        try {
            ia = InetAddress.getByName("localhost");
            listener = new ServerSocket(9988, 0, ia);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            socketOfServer = listener.accept();
            is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
            os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));


            while (true) {
                // Read data to the server (sent from client).
                line = is.readLine();

                // Write to socket of Server
                // (Send to client)
                os.write(">> " + line);
                // End of line
                //os.newLine();
                // Flush data.
                os.flush();


                // If users send QUIT (To end conversation).
                if (line.equals("QUIT")) {
                    os.write(">> OK");
                    os.newLine();
                    os.flush();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
