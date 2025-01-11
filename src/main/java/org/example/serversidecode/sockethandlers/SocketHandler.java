package org.example.serversidecode.sockethandlers;

import java.net.Socket;

public interface SocketHandler {

    void handle(Socket socket);

    default void closeResources() {

    }

    static SocketHandler deduceSocketHandler() {
        return new DefaultSocketHandler();
    }
}
