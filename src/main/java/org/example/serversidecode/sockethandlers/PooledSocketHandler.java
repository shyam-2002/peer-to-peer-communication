package org.example.serversidecode.sockethandlers;

import org.example.serversidecode.comm.CommunicationHandler;

import java.net.Socket;
import java.util.concurrent.ExecutorService;


public class PooledSocketHandler implements SocketHandler {

    private final ExecutorService executorService;

    public PooledSocketHandler() {
        //init executorService
        executorService = null;
    }

    @Override
    public void handle(Socket socket) {
        executorService.execute(() -> {
            CommunicationHandler.handle(socket);
        });
    }


    @Override
    public void closeResources() {
        executorService.shutdown();
    }
}
