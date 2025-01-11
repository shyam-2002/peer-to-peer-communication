package org.example.serversidecode.comm.requesthandlers;

import org.example.comm.request.RequestType;
import org.example.serversidecode.comm.SocketWrapper;

import java.io.IOException;

public interface RequestHandler {

    void handle(SocketWrapper wrapper);


    static RequestHandler deduceRequestHandler(SocketWrapper socketWrapper) throws IOException {
        int requestId = Integer.parseInt(socketWrapper.read());
        RequestType requestType = RequestType.get(requestId);
        return switch (requestType) {
            case JOIN -> new JoinRequestHandler();
            case BLOCK -> new BlockRequestHandler();
            default -> throw new IllegalArgumentException("Unsupported request type: " + requestType);
        };
    }
}
