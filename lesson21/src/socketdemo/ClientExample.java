package socketdemo;

import java.io.*;
import java.net.Socket;

public class ClientExample {
    public static void main(String[] args) {
        Socket socketOfClient = null;
        BufferedWriter os = null;
        BufferedReader is = null;

        try {
            socketOfClient = new Socket("localhost", 9999);
            // Create output stream at the client (to send data to the server)
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));


            // Input stream at Client (Receive data from the server).
            is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));

            os.write("HELLO ");
            os.flush();
            os.write("I am Tom Cat");
            os.newLine();
            os.flush();
            os.write("QUIT");
            os.newLine();
            os.flush();



            // Read data sent from the server.
            // By reading the input stream of the Client Socket.
            String responseLine;
            while ((responseLine = is.readLine()) != null) {
                System.out.println("Server: " + responseLine);
                if (responseLine.contains("OK")) {
                    break;
                }
            }

            os.close();
            is.close();
            socketOfClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
