package org.example.serversidecode.sockethandlers;

import org.example.serversidecode.comm.CommunicationHandler;

import java.net.Socket;

public class DefaultSocketHandler implements SocketHandler {

    @Override
    public void handle(Socket socket) {
        new Thread(() -> {
            CommunicationHandler.handle(socket);
        }).start();
    }
}
