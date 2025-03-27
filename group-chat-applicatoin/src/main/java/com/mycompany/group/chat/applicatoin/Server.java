package com.mycompany.group.chat.applicatoin;

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
                ClientHandler clientHandler = new ClientHandler();
            }
        }
        
    }
    
    
}
