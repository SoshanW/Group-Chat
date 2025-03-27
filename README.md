# Group Chat Application

A simple Java-based group chat application that allows multiple clients to communicate with each other through a central server.

## Features

- Real-time group chat functionality
- Multiple client support
- Server-client architecture
- Thread-based client handling
- Simple and intuitive communication

## Prerequisites

- Java Development Kit (JDK) 23 or higher
- Maven (for building the project)

## Project Structure

```
group-chat-application/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── mycompany/
│   │               └── group/
│   │                   └── chat/
│   │                       └── application/
│   │                           ├── Server.java
│   │                           ├── ClientHandler.java
│   │                           └── Client.java
│   └── test/
└── pom.xml
```

## Components

- **Server**: Handles incoming client connections and manages communication between clients
- **ClientHandler**: Manages individual client connections and message broadcasting
- **Client**: Represents a chat participant that can send and receive messages

## Building the Project

1. Clone the repository
2. Navigate to the project directory
3. Build the project using Maven:
   ```bash
   mvn clean package
   ```

## Running the Application

1. Start the server:
   ```bash
   java -cp target/group-chat-application-1.0-SNAPSHOT.jar com.mycompany.group.chat.application.Server
   ```

2. Start multiple clients:
   ```bash
   java -cp target/group-chat-application-1.0-SNAPSHOT.jar com.mycompany.group.chat.application.Client
   ```

## Usage

1. The server runs on port 1234 by default
2. Each client can connect to the server using the localhost address
3. Once connected, clients can send messages that will be broadcast to all other connected clients
4. To exit, clients can disconnect from the server

## Technical Details

- The application uses Java Socket programming for network communication
- Each client connection is handled by a separate thread
- The server uses a ServerSocket to accept incoming connections
- Messages are broadcast to all connected clients except the sender

## Author

Soshan Wijayarathne

## License

This project is open source and available under the MIT License. 