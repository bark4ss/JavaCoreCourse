package socketdemo;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
    public static void main(String[] args) {
        Socket socketOfClient;
        BufferedWriter os;
        BufferedReader is;

        try {
            socketOfClient = new Socket("localhost", 9988);
            // Create output stream at the client (to send data to the server)
            os = new BufferedWriter(new OutputStreamWriter(socketOfClient.getOutputStream()));


            // Input stream at Client (Receive data from the server).
            is = new BufferedReader(new InputStreamReader(socketOfClient.getInputStream()));
            // Создаем поток для чтения с клавиатуры.
            InputStreamReader isr;
            isr = new InputStreamReader(System.in);
            BufferedReader keyboard;
            keyboard = new BufferedReader(isr);
            while (true) {
                System.out.print("Input line: ");
                String line = keyboard.readLine();
                System.out.println(line);
                os.write(line);
                os.flush();
                os.write("I am Tom Cat");
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
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
