package socketdemo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerProgram {
    public static void main(String args[]) throws IOException {

        ServerSocket listener = null;

        System.out.println("Server is waiting to accept user...");
        int clientNumber = 0;

        // Try to open a server socket on port 7777
        // Note that we can't choose a port less than 1023 if we are not
        // privileged users (root)

        try {
            listener = new ServerSocket(7777);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(1);
        }

        try {
            while (true) {
                // Accept client connection request
                // Get new Socket at Server.

                Socket socketOfServer = listener.accept();
                new ServiceThread(socketOfServer, clientNumber++).start();
            }
        } finally {
            listener.close();
        }

    }

    private static void log(String message) {
        System.out.println(message);
    }

    private static class ServiceThread extends Thread {

        private final Socket socketOfServer;

        public ServiceThread(Socket socketOfServer, int clientNumber) {
            this.socketOfServer = socketOfServer;

            // Log
            log("New connection with client# " + clientNumber + " at " + socketOfServer);
        }

        @Override
        public void run() {

            try {

                // Open input and output streams
                BufferedReader is = new BufferedReader(new InputStreamReader(socketOfServer.getInputStream()));
                BufferedWriter os = new BufferedWriter(new OutputStreamWriter(socketOfServer.getOutputStream()));

                while (true) {
                    // Read data to the server (sent from client).
                    String line = is.readLine();

                    // Write to socket of Server
                    // (Send to client)
                    os.write(">> " + line);
                    // End of line.
                    os.newLine();
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
                System.out.println(e);
                e.printStackTrace();
            }
        }
    }
}
