package org.example.serversidecode.comm;

import org.example.serversidecode.comm.requesthandlers.RequestHandler;

import java.io.IOException;
import java.net.Socket;

public interface CommunicationHandler {

    static void handle(Socket socket) {
        try {
            SocketWrapper wrapper = new SocketWrapper(socket);
            greet(wrapper);
            RequestHandler.deduceRequestHandler(wrapper).handle(wrapper);
        } catch (IOException e) {
            //handle
        }
    }

    static void greet(SocketWrapper wrapper) throws IOException {}
}
