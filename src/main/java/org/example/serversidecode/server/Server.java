package org.example.serversidecode.server;

import org.example.serversidecode.sockethandlers.SocketHandler;

import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    private static final Logger logger = Logger.getLogger(Server.class.getName());

    private final int port;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            logger.log(Level.INFO, "Server started on port {}", port);
            SocketHandler handler = SocketHandler.deduceSocketHandler();
            while (true) {
                handler.handle(serverSocket.accept());
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to start server", e);
            throw e;
        }

    }


}
