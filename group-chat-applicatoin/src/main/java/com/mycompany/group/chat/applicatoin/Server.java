package com.mycompany.group.chat.applicatoin;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Soshan Wijayarathne
 */
public class Server {
    
    /**
     * This Object is responsible for listening into incoming connection or 
     * clients and creating a socket object to communicate with them
     */
    private ServerSocket serverSocket;  

    public Server(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }
    
    public void startServer(){
        
        try {
            while (!serverSocket.isClosed()){ //Server is running indefenitely
                
                Socket socket = serverSocket.accept(); //This is a blocking method until a Client is connected
                System.out.println("A new client has connected!");
                
                                 
                //Each object of this class will be responsible for communicating with a client
                ClientHandler clientHandler = new ClientHandler(socket);
                
                Thread thread = new Thread(clientHandler);
                thread.start();
            }
            
        }catch (IOException e) {
            
        }
        
    }
    
    public void closeServerSocket(){
        try {
            if (serverSocket != null){
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }
    
    
}
